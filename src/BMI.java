import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cân nặng");
        double weight = sc.nextDouble();
        System.out.println("nhập chiều cao:");
        double height = sc.nextDouble();

        double bmi = weight / Math.pow(height,2);

        System.out.println("BMI: "+bmi);

        if(bmi<18){
            System.out.println("bạn bị thiếu cân");
        }
        else if(bmi<25.0){
            System.out.println("bạn bình thường");
        }
        else if(bmi<30){
            System.out.println("bạn bị thừa cân");
        }
        else {
            System.out.println("bạn bị máu nhiễm mỡ");
        }
    }
}
