//Register No: TRV19EE026
// Name: Harish Lal

import java.util.Scanner;

class GradeSystem {
    float output(){
        Scanner in = new Scanner(System.in);
        System.out.println("GradeSystem");
        System.out.println("-----------------------------");
        System.out.print("Enter Marks : ");
        float mark = in.nextFloat();
        return mark;
    }
}


class GradeSystemwithClass{
public static void main(String[] args){
    GradeSystem obj =new GradeSystem();
    float output = obj.output();
    if(output>100|| output<0)
        System.out.print("Invalid Mark");
    else if(output>=90)
        System.out.print("Grade of the Student : O");
    else if(output>=80)
        System.out.print("Grade of the Student : A");
    else if(output>=70)
        System.out.print("Grade of the Student : B");
    else if(output>=60)
        System.out.print("Grade of the Student : C");
    else if(output>=50)
        System.out.print("Grade of the Student : D");
    else if(output>=45)
        System.out.print("Grade of the Student : P");
    else 
        System.out.print("Grade of the Student : F");
    }
}