package ObjectOriented;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student("zhangsan",1,18);
        Student stu2 = new Student("lisi",2,18);
        Student stu3 = new Student("wangwu",3,18);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student("zhaoliu", 4, 18);

        //添加学生
        boolean flag = contains(arr, stu4.getId());
        if (flag){
            System.out.println("id重复，重新添加");
        }else {
            int count = getCount(arr);
            if (count == arr.length){
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            }else {
                arr[count] = stu4;
                printArr(arr);
            }
        }

        //根据id找学生
        int Index = getIndex(arr, 2);
        System.out.println(Index);

        //删除学生
        int Index2 = getIndex(arr,1);
        if (Index2 >= 0){
            arr[Index2] = null;
            printArr(arr);
        }else {
            System.out.println("找不到此学生，删除失败。");
        }

        //改变指定学生信息
        int Index3 = getIndex(arr, 2);
        if (Index3 >= 0){
            Student stu = arr[Index3];
            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
        }else {
            System.out.println("找不到此学生。");
        }


    }

    public static int getIndex(Student[] arr, long id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];

            if (stu != null){
                long sid = stu.getId();
                if (id == sid){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null){
                System.out.println(stu.getId() + "\t" + stu.getAge() + "\t" + stu.getName());
            }
        }
    }

    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr [i] = arr[i];
        }

        return newArr;
    }

    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] arr, long id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null){
                long sid = stu.getId();
                if (sid == id){
                    return true;
                }
            }
        }
        return false;
    }
}
