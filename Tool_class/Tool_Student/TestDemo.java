package Tool_class.Tool_Student;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        //1. 新建集合，存学生对象
        ArrayList<Student> list = new ArrayList<>();

        //2. 创建三个学生对象
        Student stu1 = new Student("ptg",18,"male");
        Student stu2 = new Student("fhy",19,"male");
        Student stu3 = new Student("SanJin",20,"male");

        //3. 将学生存入集合
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //4. 测试工具类
        System.out.println(StudentUtil.getMaxAgeStudent(list));;
    }
}
