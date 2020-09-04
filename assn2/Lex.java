import java.util.Scanner;
public class Lex{
	public static void main(String[] args) {
			System.out.println("Enter the two strings");
			Scanner scan=new Scanner(System.in);
			String s1,s2;
			s1=scan.nextLine();
			s2=scan.nextLine();
			char[] temp1=s1.toCharArray();
			char[] temp2=s2.toCharArray();
			char[] m;
			if (temp1.length<=temp2.length){
				m=temp1;
			}
			else
				m=temp2;
			char[] max=m;

			for (int i=0;i<m.length;i++){
				if ((int) temp1[i] < (int) temp2[i]){
					max=temp1;
					break;
				}
				else if ((int) temp1[i] > (int) temp2[i]){
					max=temp2;
					break;
				}
			}
			String str=new String(max);
			System.out.println("The lexographically smaller string is " + str);
			return ;

		}	
}
