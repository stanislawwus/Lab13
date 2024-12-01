package task1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AuthMethod authMethod = AuthMethod.FACEBOOK;

        UniUser user = null;

        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser(
                        "test@mail.com",
                        "USA",
                        LocalDateTime.now().toString()
                );
                user = new FacebookUserAdapter(facebookUser);
                break;
            case GOOGLE:
                System.out.println("GOOGLE");
                break;
            case TWITTER:
                TwitterUser twitterUser = new TwitterUser(
                        "test@mail.com",
                        "USA",
                        LocalDateTime.now().toString()
                );
                user = new TwitterUserAdapter(twitterUser);
                break;
            default:
                break;
        }

        if (user instanceof FacebookUserAdapter) {
            System.out.println("Facebook");
        } else if (user instanceof TwitterUserAdapter) {
            System.out.println("Twitter");
        } else {
            System.out.println("Unknown or Google)");
        }

        MessageSender sender = new MessageSender();
        sender.sendMessage(user, "Hello World!");
    }
}
