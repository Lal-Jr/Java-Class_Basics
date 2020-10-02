import java.util.Scanner;

class Largest {
    float display(){
        Scanner in = new Scanner(System.in);
        System.out.println("LargestNumber");
        System.out.println("-----------------------------");
        System.out.print("Enter 1st Number : ");
        float num1 = in.nextFloat();
        System.out.print("Enter 2nd Number : ");
        float num2 = in.nextFloat();
        if (num1>num2)
            return num1;
        else
            return num2;
    }  
}

public class LargestwithClass{
    public static void main(String[] args){
        Largest obj = new Largest();
        float output = obj.display();
        System.out.println("The Largest Number is " + output);
    }
    
}
