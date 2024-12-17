//wajp to read Int and print sqrt using scanner

import java.util.Scanner;
import  java.util.InputMismatchException;
class P5{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
try{
System.out.println("enter a number");
double num = s.nextDouble();
double res = Math.sqrt(num);
System.out.println("res="+res);
}
catch(InputMismatchException e){
	System.out.println("enter valid numb");

}
}
}