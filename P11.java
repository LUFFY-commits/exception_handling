//wajp to read "n" marks and print avg of marks

import java.io.Console;
class P11{
public static void main(String args[]){
Console c = System.console();
try{
 double n = Double.parseDouble(c.readLine("Enter n: "));
        double numbers[] = new double[n];

for(int i=0;i<=n;i++){
	marks[i] = Double.parseDouble(c.readLine("enter marks : "));
}
	double sum = 0.0,avg = 0.0;
	for(int i=0;i<n;i++){

	avg = sum / n;
	System.out.println("avg = " +avg);
}
catch(NumberFormatException e){
	System.out.println("enter valid num");
}
catch(NegativeArraySizeException e){
	System.out.println("enter positive numb");
}
}
}


