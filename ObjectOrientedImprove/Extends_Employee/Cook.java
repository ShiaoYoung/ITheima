package ObjectOrientedImprove.Extends_Employee;

public class Cook extends Employee{

    public Cook() {
    }

    public Cook(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("炒菜");
    }

    @Override
    public void eating() {
        super.eating();
    }
}
