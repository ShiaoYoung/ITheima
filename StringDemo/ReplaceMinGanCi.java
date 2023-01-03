package StringDemo;

public class ReplaceMinGanCi {
    public static void main(String[] args) {

        //1. 获取内容
        String talk = "66666,tmd";

        //2. 定义敏感词库
        String[] arr = {"c","tmd","gnmd"};

        //3. 循环删去敏感词
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }

        //4. 打印结果
        System.out.println(talk);
    }
}
