public class Main {

    public static void main(String[] args) {
        
        Company gameDev = new GameDevCompany();
        gameDev.createSoftware();

        System.out.println("----");

        Company outsourcing = new OutsourcingCompany();
        outsourcing.createSoftware();
        
    }
}
