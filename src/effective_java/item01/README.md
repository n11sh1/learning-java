# Consider static factory methods instead of constructors
## PROS
1. One advantage of static factory methods is that, unlike constructors, they have names.

1. A second advantage of static factory methods is that, unlike constructors, they are not required to create a new object each time they're invoked.

1. A third advantage of static factory methods is that, unlike constructors, they can return an object on any subtype of their return type.
 
1. A fourth advantage of static factory methods is that they reduce the verbosity of creating parameterized type instances.

## CONS
1. The main disadvantage of providing only static factory methods is that classes without public or protected constructors cannot be subclassed.

1. A second disadvantage of static factory methods is that they are not readily distinguishable from other static methods.

### Common names for static factory methods
- `valueOf` - Such static factories are effectively type-conversion methods.
- `of` - A concise alternative to `valueOf`.
- `getInstance` - Returns an instance that is described by the parameters but cannot be said to have the same value. In the case of a singleton, `getInstance` takes no parameters and returns the sole instance.
- `newInstance` - Like `getInstance`, expect that `newInstance` guarantees that each instance returned is distinct from all others.
- `getType` - Like `getInstance`, but used when the factory method is in a different class. Type indicates the type of object returned by the factory method.
- `newType` - Like `newInstance`, same as `getType`

## SUMMARY
- I understood that why `Class.forName("com.mysql.jdbc.Driver")` is required when connect to the database.