package task2;

public class Main {
    public static void main(String[] args) {
        Auth auth = new Auth();
        DB db1 = new DB();
        if (auth.authorise(db1)) {
            ReportBuilder br = new ReportBuilder(db1);
            System.out.println(br);
        }
    }
}
