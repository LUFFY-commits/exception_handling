//wajp to read Int and print sqrt using command line agrs

class P9{
public static void main(String args[]){

try{
double num = Double.parseDouble(args[0]);
double res = Math.sqrt(num);
System.out.println("res="+res);
}
catch(ArrayIndexOutOfBoundsException | NumberFormatException  e){
	System.out.println("pass a number");
}
}
}