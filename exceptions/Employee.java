package exceptions;

public class Employee {
    private int age;
    private String name;

    public Employee() {
    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18){
            throw new RuntimeException();
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int length = name.length();
        if (length < 2 || length > 5){
            throw new RuntimeException();
        }
        this.name = name;
    }
}
