public class q12 {
    static class Java extends Thread{
        public void run(){
            while(!Thread.currentThread().isInterrupted())
            {
                System.out.print(" JAVA ");
            }
        }
    }
    static class Oops extends Thread{
        public void run(){
            while(!Thread.currentThread().isInterrupted())
            {
                System.out.print(" OOPS ");
            }
        }
    }

    public static void main(String args[]){
        Java jav = new Java();
        Oops oop = new Oops();
        jav.start();
        oop.start();

        try
        {Thread.sleep(2000);}
        catch(Exception e)
        {System.out.println(e);}

        jav.interrupt();
        oop.interrupt();
    }
}
