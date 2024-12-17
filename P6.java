//wajp to read a&b and print a/b (usingscanner)

import java.util.Scanner;
import  java.util.InputMismatchException;

class P6{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
try{
System.out.println("enter value A :");
double a =s.nextDouble();
System.out.println("enter value B :");
double b = s.nextDouble();

double res = a/b;
System.out.println(res);
}
catch(InputMismatchException e){
	System.out.println("enter valid num");
}
}
}