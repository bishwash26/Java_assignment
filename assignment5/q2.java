import java.lang.Math;


class threaded extends Thread{
    static int high;
    static int maxi=0;
    public void run(int lower,int upper)
    {
        for (int curr=lower;curr<upper;curr++){
            int count=0;
        for (int i=1;i<=curr;i++)
        {
            try{
            if (curr%i==0){
                count++;
            }
        }
        catch(Exception e)
        {System.out.println(e);}
        }
        if (count>maxi){
            maxi=count;
            high=curr;
        }
    }
    }
}
public class q2 {
    public static void main(String[] args) {
    /*Instead of allocating new thread for 100000 operation I decided to break it down into 10 threads where
    each thread will do ten thousand operations 
      */  
      threaded[] arr=new threaded[10];
      int lower=1;
      int higher=10001;
      for (int i=0;i<10;i++)
      {
          arr[i] = new threaded();
          arr[i].start();
          arr[i].run(lower,higher);
          lower=lower+10000;
          higher=higher+10000;
      }
      System.out.println("The maximum number of divisor if of "+threaded.high+" "+threaded.maxi);

    }
    
}
