public class Main implements Runnable {
    public static void main(String[] args) {
      Main obj = new Main();
      Thread thread = new Thread(obj);
      thread.start();
      for(int i=0 ;i<10 ;i++)
      {
          System.out.println("main : "+i);
      }
    }
    public void run() {
      for(int i=0 ;i<10 ;i++)
      {
          System.out.println("thread : "+i);
          Thread.yield(2000);
      }
    }
  }
  