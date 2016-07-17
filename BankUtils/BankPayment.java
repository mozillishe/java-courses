import java.util.Scanner;
public class BankPayment{
    public static void main(String[] arg){
        System.out.println("Enter your bank debtp");
        Scanner scan  = new Scanner(System.in);
        Double debtp = scan.nextDouble();
        for (int i=1; i <=100; i++) debtp = debtp * 1.001;
        System.out.println("Your bank debtp=" +debtp);
    }
}