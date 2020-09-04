import java.util.Scanner;
class Sort{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the string to be sorted");
		String s=scan.nextLine();
		char[] temp=s.toCharArray();
		char cont;
		for (int i=1;i<temp.length;i++){
			for (int j=i;j>0;j--){
				if ((int) temp[j]< (int) temp[j-1]){
					cont=temp[j];
					temp[j]=temp[j-1];
					temp[j-1]=cont;
				}
			}
		}
		String fin=new String(temp);
		System.out.print(temp);
	}
}