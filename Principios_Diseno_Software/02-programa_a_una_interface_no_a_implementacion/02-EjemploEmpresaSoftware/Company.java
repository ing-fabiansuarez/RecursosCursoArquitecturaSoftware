public class Company {

    public void createSoftware() {
        Designer d = new Designer();
        d.designArchitecture();

        Programmer p = new Programmer();
        p.writeCode();

        Tester t = new Tester();
        t.testSoftware();
    }
}
