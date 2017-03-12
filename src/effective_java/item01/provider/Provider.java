package effective_java.item01.provider;

import effective_java.item01.service.Service;

/**
 * @author n11sh1
 */
public interface Provider {
    Service newService();
}
