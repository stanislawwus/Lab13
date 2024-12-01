package task2;

@FunctionalInterface
public interface MailCode {
    String generate(Client client);
}
