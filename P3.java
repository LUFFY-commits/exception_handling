//wajp to read two int a*b (using cosole)

//and print a/b

import java.io.Console;
class P3{
public static void main(String args[]){
Console c = System.console();

try{

int a = Integer.parseInt(c.readLine("enter numA"));
int b = Integer.parseInt(c.readLine("enter numB"));
int res = a/b;
System.out.println("res=" + res);
} 
catch(NumberFormatException e){
	System.out.println("u need to enter num");
}
}
}