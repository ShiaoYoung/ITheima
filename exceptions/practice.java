package exceptions;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        while (true) {
            try {
                System.out.println("请输入姓名：");
                String name = scanner.nextLine();
                employee.setName(name);


                System.out.println("请输入年龄：");
                String ageStr = scanner.nextLine();
                int age = Integer.parseInt(ageStr);
                employee.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄请输入合适的数字！");
            }catch (RuntimeException e){
                System.out.println("姓名或年龄格式有误！");
            }
        }
    }
}
