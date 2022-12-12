public class ThreadsExampleMain {
    public static void main(String[] args) {

        SimpleThreads t1 = new SimpleThreads();
        SimpleThreads t2 = new SimpleThreads();
        SimpleThreads t3 = new SimpleThreads();
        //we could use t1.run() method which will work but it wouldn't run as a separate thread.
        //start() would initiate a separate thread.

//        t1.start();
//        t2.start();
//        t3.start();

        //when you call sleep() method, internally it calls interrupt method to ask CPU to wait.

        //Runnable comes handy when your class already extends some parent class, we can use Interface in place of Thread class
        //Ideally Thread class also implements Runnable
        RunnableExample r1 = new RunnableExample();

        Thread tr1 = new Thread(r1);
//        tr1.setPriority(Thread.MAX_PRIORITY);
        //no guarantee but Java tries to prioritize
        Thread tr2 = new Thread(r1);

//        tr1.setDaemon(true);
        //setting a background thread like SMS in ATM transaction
        System.out.println("is tr1 Daemon " + tr1.isDaemon());

        tr1.start();

        tr2.start();
        System.out.println("is tr1 alive  " + tr1.isAlive());


    }
}