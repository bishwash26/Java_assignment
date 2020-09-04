import java.util.*; 
class Sets{
	public static int[] compliment(int[] arr1){
		int[] fini=new int [11];
		for (int i=0;i<arr1.length;i++){
			if (arr1[i]<=10 && arr1[i]>0){
				fini[arr1[i]]=1;
			}
		}
		return fini;
	}
	public static HashSet<Integer> compliment2(int[] arr1){
		 HashSet<Integer> set = new HashSet<>();
		 for (int i=0;i<arr1.length;i++){
		 	set.add(arr1[i]);
		 }
		 return set;
	}
		public static HashSet<Integer> union2(int[] arr1,int[] arr2){
			HashSet<Integer> set = new HashSet<>();
			for (int i=0;i<arr1.length;i++){
				set.add(arr1[i]);
			}
			for (int j=0;j<arr2.length;j++)
			{
				set.add(arr2[j]);
			}
		return set;
	}
	public static int[] union(int[] arr1,int[] arr2){
		int[] fini=new int [11];
		for (int i=0;i<arr1.length;i++){
			if (arr1[i]<=10 && arr1[i]>0){
				fini[arr1[i]]=1;
			}
		}
		for (int i=0;i<arr2.length;i++){
			if (arr2[i]<=10 && arr2[i]>0){
				fini[arr2[i]]=1;
			}
		}
		return fini;
	}
			public static HashSet<Integer> intersection2(int[] arr1,int[] arr2){
			HashSet<Integer> set = new HashSet<>();
			for (int i=0;i<arr1.length;i++){
				set.add(arr1[i]);
			}
			HashSet<Integer> set2 = new HashSet<>();
			for (int i=0;i<arr2.length;i++){
				set2.add(arr2[i]);
			}
			for (int i=0;i<arr1.length;i++){
				if (!(set.contains(arr1[i]) && set2.contains(arr1[i]))){
					set.remove(arr1[i]);
				}
			}


		return set;
	}


	public static int[] intersection(int[] arr1,int[] arr2){
		int[] fini=new int [11];
		for (int i=0;i<arr1.length;i++){
			if (arr1[i]<=10 && arr1[i]>0 ){
				if (fini[arr1[i]]==0){
			fini[arr1[i]]+=1;
		}
			}
		}
		for (int i=0;i<arr2.length;i++){
		if (arr2[i]<=10 && arr2[i]>0 ){
			if (fini[arr2[i]]<2){
				fini[arr2[i]]+=1;
			}
			}
		}
		return fini;

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of first array");
		int n1=scan.nextInt();
		int[] arr1=new int [n1];
		System.out.println("Enter the numbers resepectively");
		for (int i=0;i<n1;i++){
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter 1 for compliment anyother for additional operations");
		int nn=scan.nextInt();
		switch (nn)
		{
			case 1:
				long start = System.currentTimeMillis();
				System.out.println(start);
				int[] fini=compliment(arr1);
				System.out.println("Compliment of the function is ");
				for (int i=0;i<fini.length;i++){
					if (fini[i]==0)
					{
						System.out.print(i+" ");
					}
				}
				System.out.println();
				long start1 = System.currentTimeMillis();
				HashSet <Integer> set=compliment2(arr1);
				for (int i=0;i<11;i++){
					if (!set.contains(i)){
						System.out.print(i+" ");
					}
				}
				long start2 = System.currentTimeMillis();
				long t1=(start1-start)-(start2-start1);
				System.out.println();
				System.out.println("The ellapsed time by naive method is "+(start1-start)+" ms");
				System.out.println("The ellapsed time by naive method is"+(start2-start1)+" ms");
				System.out.println("The time difference between them is "+t1+" ms");
				break;

		default:
			System.out.println("Enter the length of second array");
			int n2=scan.nextInt();
			int[] arr2=new int [n2];
			System.out.println("Enter the numbers resepectively");
			for (int i=0;i<n2;i++){
				arr2[i]=scan.nextInt();
			}
			System.out.println("Press 1 for union and 2 for intersection");
			int meow=scan.nextInt();
			switch(meow){
				case 1:
				 	start = System.currentTimeMillis();
					 fini=union(arr1,arr2);
					System.out.println("The union of the numbers are");
					for (int i=0;i<fini.length;i++){
						if (fini[i]==1){
							System.out.print(i+" ");
						}
					}
					System.out.println();
					start1= System.currentTimeMillis();
					set=union2(arr1,arr2);
					for (int i=0;i<11;i++){
						if (set.contains(i))
						{
							System.out.print(i+" ");
						}
					}
					start2 = System.currentTimeMillis();
				 t1=(start1-start)-(start2-start1);
				System.out.println("The total start time is "+ start+ " ms");
				System.out.println("The total finish time is "+ start2+ " ms");
				System.out.println("The ellapsed time by naive method is "+(start1-start)+" ms");
				System.out.println("The ellapsed time by naive method is"+(start2-start1)+" ms");
				System.out.println("The time difference between them is "+t1+" ms");
					break;

				case 2:
					start = System.currentTimeMillis();
					fini=intersection(arr1,arr2);
					System.out.println("The intersection of the two numbers are");
					for (int i=0;i<fini.length;i++){
						if (fini[i]>=2){
							System.out.print(i+" ");
						}
					}
					System.out.println();
					start1= System.currentTimeMillis();
					set=intersection2(arr1,arr2);
					for (int i=0;i<11;i++){
						if (set.contains(i))
						{
							System.out.print(i+ " ");
						}
					}
					start2=System.currentTimeMillis();
					 t1=(start1-start)-(start2-start1);
					 System.out.println();
					 				System.out.println("The start time is "+ start+ " ms");
				System.out.println("The finish time is "+ start2+ " ms");
				System.out.println("The ellapsed time by naive method is "+(start1-start)+" ms");
				System.out.println("The ellapsed time by naive method is"+(start2-start1)+" ms");
				System.out.println("The time difference between them is "+t1+" ms");
					break;

				default:
					System.out.println("Please enter a valid string");
			}
		}
	}
}