package task3;

public class Main {

    public static void main(String[] args) {
        CompanyReaderFacade facade = new CompanyReaderFacade();
        Company company = facade.readCompany("ucu.edu.ua");
        System.out.println(company.description);
    }

}
