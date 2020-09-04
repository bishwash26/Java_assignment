import java.util.Scanner;
class Hailstorm{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=scan.nextInt();
		if (i<0){
			System.out.println("Enter a positive number please");
			return;
		}
		while (i!=1){
			System.out.print(i+ " ");
			if (i%2==0)
				i=i/2;
			else
				i=3*i+1;
		}
		return;


	}
}