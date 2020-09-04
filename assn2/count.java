import java.util.Arrays; 
import java.util.Scanner;
public class Count{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int l;
		int[] arr=new int [21];
		System.out.println("Enter the length of an array");
		l=scan.nextInt();
		int temp;
		int j=0;
		int[] sorted=new int [l];
		System.out.println("Enter the numbers");
		for (int i=0;i<l;i++){
		temp=scan.nextInt();
		arr[temp]=arr[temp]+1;
	}

	for (int i=0;i<21;i++){
		while (arr[i]>0){
			sorted[j]=i;
			j=j+1;
			arr[i]--;
		}
	}
	System.out.println("The sorted version is");
	for (int i=0;i<l;i++){
		System.out.print(sorted[i]+" ");
	}
	}

}
