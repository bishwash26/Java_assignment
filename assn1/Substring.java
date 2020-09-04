import java.util.Arrays; 
import java.util.Scanner;
import java.util.HashMap; 

class Substring{
	public static int count(String s1,String s2){
		char temp1[]=s1.toCharArray();
		char temp2[]=s2.toCharArray();
		int[] t1=new int [500];
		int temp;
		for (int i=0;i<temp1.length;i++){
		temp=(int) temp1[i];
		t1[temp]+=1;
	}
	int min=30000000;
	for (int i=0;i<temp2.length;i++){
		temp=(int) temp2[i];
		if (t1[temp]<min){
			min=t1[temp];
		}
	}

	return min;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the main string");
		String s1=scan.next();
		scan.nextLine();
		System.out.println("Enter the Substring");
		String s2=scan.next();
		int c1=count(s1,s2);
		System.out.println(c1);

	}
}