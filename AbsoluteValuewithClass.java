// Register No: TRV19EE026
// Name: Harish Lal
import java.util.Scanner;	

class AbsoluteNumber {
	int display(){
		Scanner in = new Scanner(System.in);
		System.out.println("AbsoluteValue");
		System.out.println("-----------------------------");
		System.out.print("Enter Number: ");
		int number = in.nextInt();
		return Math.abs(number);
	}
}
public class AbsoluteNumberwithClass{
	public static void main(String[] args) {
		AbsoluteNumber obj = new AbsoluteNumber();
		int output = obj.display();
		System.out.println("Absolute number to given number '"+obj.number+"': "+output);			
	}
}

