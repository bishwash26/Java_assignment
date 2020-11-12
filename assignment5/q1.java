

class threaded extends Thread{
    public void run(){
        for (int i=1;i<100;i++)
        {
            System.out.println(i);
            try{
            Thread.sleep(1000);
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class q1 {
    public static void main(String[] args) {
        threaded t1=new threaded();
        t1.start();
    }
}
