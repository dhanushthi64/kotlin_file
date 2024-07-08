public class Threading implements Runnable{
    String name;
    Thread thread;
    Threading(String threadName){
        name = threadName;
        thread = new Thread(this,name);
        System.out.println("New Thread: "+name);
        thread.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name+"Interrupted");
        }
        System.out.println(name+"Exiting");
    }
    public static void main(String[] args) {
        Threading t1 = new Threading("One");
        Threading t2 = new Threading("two");
        Threading t3 = new Threading("three");
        System.out.println("Thread one is alive: "+t1.thread.isAlive());
        System.out.println("Thread two is alive: "+t2.thread.isAlive());
        System.out.println("Thread three is alive: "+t3.thread.isAlive());
        try{
            System.out.println("Waiting for threads interrupted");
            t1.thread.join();
            t2.thread.join();
            t3.thread.join();
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
    }
}
// public class Threading implements Runnable{
//     public void run(){
//         try{
//             for(int i=1;i<=10;i++){
//                 if(i==5) Thread.sleep(5000);
//                 System.out.println(i);
//             }
//         }catch(InterruptedException e){
//             System.out.println("Thread Interrupted");
//         }
//     }
//     public static void main(String[] args) {
//         Threading threadRun = new Threading();
//         Thread thread = new Thread(threadRun,"Hi");
//         thread.start(); 
//     }
// }
// public class Threading implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 20; i++) {
//             if (i % 2 == 0) System.out.println(i);
//         }
//     }

//     public static void main(String[] args) {
//         Threading threadRun = new Threading();
//         Thread thread1 = new Thread(threadRun, "Hi");
        
//         Thread2 threadRun2 = new Thread2();
//         Thread thread2 = new Thread(threadRun2, "Hi2");

//         thread1.setPriority(Thread.MAX_PRIORITY);
//         thread2.setPriority(Thread.MIN_PRIORITY);

//         thread1.start();
//         thread2.start();
//     }
// }

// class Thread2 implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 20; i++) {
//             if (i % 2 !=0) System.out.println(i);
//         }
//     }
// }
