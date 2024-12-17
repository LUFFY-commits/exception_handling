//wajp to read an int and print if num is even /odd  (using cosole)


import java.Console;
class P2{
public static void main(String args[]){
Console c = System.console();

try{

double num = Double.parseDouble(c.readLine("enter num"));
double res = Math.sqrt(num);
System.out.println(res);
}
catch(NumberFormatException e){
System.out.println("num not entered");
}
System.out.println("have a good day");


}
}