// Register No: TRV19EE026
// Name: Harish Lal
import java.util.Scanner;

class Smallest {
    float output(){
        Scanner in = new Scanner(System.in);
        System.out.println("SmallestNumber");
        System.out.println("-----------------------------");
        System.out.print("Enter 1st Number : ");
        float num1 = in.nextFloat();
        System.out.print("Enter 2nd Number : ");
        float num2 = in.nextFloat();
        System.out.print("Enter 3rd Number : ");
        float num3 = in.nextFloat();
        in.close();
        if (num1 < num2 && num1 < num3)
            return num1;
        else if (num2 < num1 && num2 < num3)
            return num2;
        else
            return num3;
    }
}

public class SmallestwithClass{
    public static void main(String[] args) {
        Smallest obj = new Smallest();
        float output = obj.output();
        System.out.println("The Smallest Number is " + output);
    }
}
