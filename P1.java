//wajp to read an int and print if num is even /odd(using cosole)

import java.Console*;
class P1{
public static void main(String args[]){
Console c = System.console();

try{

int num = Integer.parseInt(c.readLine("enter num"));
String res = num % 2==0? "even" : "odd";
System.out.println(res);
}
catch(NumberFormatException e){
System.out.println("num not entered");
}
System.out.println("have a good day");


}
}