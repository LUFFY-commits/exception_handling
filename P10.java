//wajp to read two int a*b (using command line args)

//and print a/b


class P10{
public static void main(String args[]){

try{

double a = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);
double res = a/b;
System.out.println("res = " +res);
} 
catch(ArrayIndexOutOfBoundsException | NumberFormatException  e){
	System.out.println("pass a number");
}
}
}