// Register No: TRV19EE026
// Name: Harish Lal
import java.util.Scanner;

class Month {
        int output(){
                Scanner in = new Scanner(System.in);
                System.out.println("Month");
                System.out.println("-----------------------------");
                System.out.print("Enter Month Number : ");
                int month = in.nextInt();
                in.close();
                return month;
        }
}

public class MonthwithClass {
    public static void main(String[] args){
            Month obj = new Month();
            int output = obj.output();
        switch(output){
            case 1: System.out.println("Month --> January");
                    break;
            case 2: System.out.println("Month --> February");
                    break;
            case 3: System.out.println("Month --> March");
                    break;
            case 4: System.out.println("Month --> April");
                    break;
            case 5: System.out.println("Month --> May");
                    break;
            case 6: System.out.println("Month --> June");
                    break;
            case 7: System.out.println("Month --> July");
                    break;
            case 8: System.out.println("Month --> August");
                    break;
            case 9: System.out.println("Month --> September");
                    break;
            case 10: System.out.println("Month --> October");
                    break;
            case 11: System.out.println("Month --> November");
                    break;
            case 12: System.out.println("Month --> December");
                    break;
            default: System.out.println("Invalid Input");
        }
    }
    
}
