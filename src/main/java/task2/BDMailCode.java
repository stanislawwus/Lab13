package task2;

public class BDMailCode implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Hello %s! Happy %d-th birthday!", client.getName(), client.getAge());
    }
}
