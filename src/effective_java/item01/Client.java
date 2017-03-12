package effective_java.item01;

import effective_java.item01.provider.FacebookProvider;
import effective_java.item01.provider.YoutubeProvider;
import effective_java.item01.service.Service;

/**
 * @author n11sh1
 */
public class Client {

    public static void main(String[] args) {
        Services.registerDefaultProvider(new YoutubeProvider());
        Service service = Services.newInstance();
        System.out.println("Default service name is " + service.getServiceName());


        Services.registerProvider("facebook", new FacebookProvider());
        service = Services.newInstance("facebook");
        System.out.println("Service name is " + service.getServiceName());

        try {
            Class.forName("effective_java.item_01.provider.TwitterProvider");
            service = Services.newInstance("twitter");
            System.out.println("Service name is " + service.getServiceName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
