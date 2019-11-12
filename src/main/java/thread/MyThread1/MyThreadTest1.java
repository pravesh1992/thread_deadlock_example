package thread.MyThread1;

public class MyThreadTest1 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Start of Main Thread");
//    MyThread1 myThread1 = new MyThread1("Test1");
//    MyThread1 myThread2 = new MyThread1("Test2");
//    myThread1.start();
//    System.out.println(Thread.currentThread().getName() + " is alive:" + myThread1.isAlive());
//    myThread2.start();
//    //myThread2.join();
//    //Thread.sleep(10000);
//    System.out.println(myThread1.getName() + " is alive:" + myThread1.isAlive());
//    System.out.println("Default priority of created thread:" + myThread1.getPriority());
    MyThread1Task task1 = new MyThread1Task();
    Thread thread1 = new Thread(task1,"Thread1");
    thread1.start();
    thread1.join();
    System.out.println("End of Main Thread");
  }
}