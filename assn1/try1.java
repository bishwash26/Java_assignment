import java.util.Arrays; 
import java.util.Scanner;

class try1{
public static String sort(String input){
	char tempArray[]=input.toCharArray();
	Arrays.sort(tempArray);
	return new String(tempArray);
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two strings");
	String a,b;
	String str1=scan.next();
	scan.nextLine();
	String str2=scan.next();
	b=sort(str2);
	a=sort(str1);
	System.out.println("The numbers "+a+":"+b);
	Object o =a;
	System.out.println(o.getClass());
	if (a==b){
		System.out.println("The numbers are anagarm");
	}
	else{
		System.out.println("The numbers are not");
	}

}
}

