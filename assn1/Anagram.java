import java.util.Arrays; 
import java.util.Scanner;

class Anagram{
public static boolean check(String input1,String input2){
	char tempArray[]=input1.toCharArray();
	char tempArray2[]=input2.toCharArray();
	Arrays.sort(tempArray);
	Arrays.sort(tempArray2);
	return Arrays.equals(tempArray2,tempArray);
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two strings");
	String a,b;
	String str1=scan.next();
	scan.nextLine();
	String str2=scan.next();
	boolean resp=check(str1,str2);
	if (resp){
		System.out.println("True");
	}
	else{
		System.out.println("False");
	}
}
}

