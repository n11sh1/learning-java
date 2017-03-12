package effective_java.item01.provider;

import effective_java.item01.service.FacebookService;
import effective_java.item01.service.Service;

/**
 * @author n11sh1
 */
public class FacebookProvider implements Provider {
    @Override
    public Service newService() {
        return new FacebookService();
    }
}
