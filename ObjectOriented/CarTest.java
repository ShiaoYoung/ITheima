package ObjectOriented;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车的对象
            Car car = new Car();
            //录入品牌
            System.out.println("请输入品牌：");
            String brand = sc.next();
            car.setBrand(brand);
            //录入价格
            System.out.println("请输入价格：");
            int price = sc.nextInt();
            car.setPrice(price);
            //录入颜色
            System.out.println("请输入颜色：");
            String color = sc.next();
            car.setColor(color);
            arr[i] = car;
        }

        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + "\t" + car.getColor() + "\t" + car.getPrice());
        }
    }
}
