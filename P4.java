//wajp to read an int and print if its even/odd(usingscanner)

//using scanner class

import java.util.Scanner;
import java.util.InputMismatchException;
class P4{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("enter integer");
try{
int num = s.nextInt();
String res = num%2==0 ?"even":"odd";
System.out.println(res);
}
catch(InputMismatchException e){
	System.out.println("enter a valid number");
}
}
}