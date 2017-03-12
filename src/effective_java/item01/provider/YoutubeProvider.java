package effective_java.item01.provider;

import effective_java.item01.service.Service;
import effective_java.item01.service.YoutubeService;

/**
 * @author n11sh1
 */
public class YoutubeProvider implements Provider {
    @Override
    public Service newService() {
        return new YoutubeService();
    }
}
