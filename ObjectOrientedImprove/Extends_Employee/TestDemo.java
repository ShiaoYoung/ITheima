package ObjectOrientedImprove.Extends_Employee;

public class TestDemo {
    public static void main(String[] args) {
        Cook ck = new Cook(666,"ptg",2000);
        ck.work();
        ck.eating();

        Manager mg = new Manager();
        mg.setId(777);
        mg.setName("6");
        mg.setSalary(3000);
        mg.setManagedBonus(100);
        mg.work();
        mg.eating();
    }
}
