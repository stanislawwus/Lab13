package task1;

public class MessageSender {

    public void sendMessage(UniUser user, String message) {
        System.out.println("New message was sent to " + user.getEmail());
        System.out.println("Text: " + message);
        System.out.println("From: " + user.getCountry());
        System.out.println("Last Time Online: " + user.getActiveTime());
    }

}
