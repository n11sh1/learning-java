package effective_java.item01;

import effective_java.item01.provider.Provider;
import effective_java.item01.service.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author n11sh1
 */
public class Services {
    // Noninstantiable class for service registration and access
    private Services() {}

    // ConcurrentHashMapはjava.util.concurrentパッケージで提供されている、並行性をサポートする、スレッド・セーフなMap
    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();
    private static final String DEFAULT_PROVIDER_NAME = "default";

    // Provider registration API
    public static void registerProvider(String key, Provider provider) {
        providers.put(key, provider);
    }

    public static void registerDefaultProvider(Provider provider) {
        registerProvider(DEFAULT_PROVIDER_NAME, provider);
    }

    // Service access API
    public static Service newInstance(String key) {
        Provider provider = providers.get(key);
        if (provider == null) {
            throw new IllegalArgumentException("No provider registered with key: " + key);
        }
        return provider.newService();
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
}
