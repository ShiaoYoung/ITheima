package ObjectOrientedImprove.Tool_class.Tool_Student;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxAgeStudent(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();
            if (age > max){
                max = age;
            }
        }
        return max;
    }
}
