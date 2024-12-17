//wajp to read int and print if its even/odd using command line args with multiple catch

class P7{
public static void main(String args[]){

try{
	int num = Integer.parseInt(args[0]);
	String res = num % 2 == 0 ?"even" : "odd";
	System.out.println(res);
}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("pass a number");
}
catch(NumberFormatException e){
	System.out.println("enter valid numb");
}
}
}