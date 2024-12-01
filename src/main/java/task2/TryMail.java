package task2;

public class TryMail {
    public static void main(String[] args) {
        Client client = Client.builder()
                .age(100)
                .email("email@email.com")
                .name("name")
                .sex("female")
                .build();
        MailCode bd = new BDMailCode();
        MailInfo mailInfo = new MailInfo(client, bd);
        MailSender sender = new MailSender();
        // sender.sendMail(mailInfo); - EDIT PROPS IN MAIL_SENDER BEFORE RUNNING!!!
    }
}
