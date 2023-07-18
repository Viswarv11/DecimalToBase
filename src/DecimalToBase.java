import java.util.Scanner;

public class DecimalToBase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number1= scanner.nextInt();
        System.out.println("Enter the base");
        int number2= scanner.nextInt();
        System.out.println(decimalToBase(number1,number2));
    }
    public static String decimalToBase(int A, int B){
        String result = "";
        while (A > 0){
            result=A%B+""+result;
            A /= B;
        }
        return result;
    }
}
