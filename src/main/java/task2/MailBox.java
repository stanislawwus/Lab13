package task2;

import java.util.List;

public class MailBox {
    List<MailInfo> stored;

    public boolean addMailInfo(MailInfo mailInfo) {
        return stored.add(mailInfo);
    }

    public boolean sendAll() {
        MailSender sender = new MailSender();
        for (MailInfo mailInfo : stored) {
            sender.sendMail(mailInfo);
        }
        return true;
    }
}
