package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BianLiStu {
    public static void main(String[] args) {
        //1. 创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2. 添加学生
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            Student stu = new Student(name,age);
            list.add(stu);
        }

        Student stu1 = new Student("SanJin",18);
        Student stu2 = new Student("fhy",18);

        list.add(stu1);
        list.add(stu2);

        //3. 遍历
        System.out.println(list);
        System.out.println(list.size());
    }
}
