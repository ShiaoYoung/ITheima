package ObjectOrientedImprove.Extends_Employee;

public class Manager extends Employee{
    private double managedBonus;

    public Manager(long id, String name, double salary, double managedBonus) {
        super(id, name, salary);
        this.managedBonus = managedBonus;
    }

    public Manager() {
    }

    @Override
    public void work() {
        super.work();
        System.out.println("管理其他人");
    }

    @Override
    public void eating() {
        super.eating();
    }

    public double getManagedBonus() {
        return managedBonus;
    }

    public void setManagedBonus(double managedBonus) {
        this.managedBonus = managedBonus;
    }
}
