public class limit{
	public static void main(String[] args) {
	int s=Integer.MAX_VALUE;
		// int root=(int) ((2*Math.sqrt((double) s+.25)-1)/2);
		// System.out.println(root	+1);
		// int m=(int) root+1;
		System.out.print("0"+" ");
		for (int i=1;i<s;i++){
			if ((long) i*i==(long) i*(i+1)/2){
				System.out.print(i+ " ");
			}
		}
	}
}