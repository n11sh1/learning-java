package effective_java.item01.provider;

import effective_java.item01.Services;
import effective_java.item01.service.Service;
import effective_java.item01.service.TwitterService;

/**
 * @author n11sh1
 */
public class TwitterProvider implements Provider {
    // Like JDBC Driver
    static {
        Services.registerProvider("twitter", new TwitterProvider());
    }

    @Override
    public Service newService() {
        return new TwitterService();
    }
}
