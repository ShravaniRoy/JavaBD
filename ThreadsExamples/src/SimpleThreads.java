public class SimpleThreads extends Thread {
    @Override
    public void run(){ //we have to override the run method from Thread Class to be able to make it multi threadable
        for (int i=0; i<10; i++){
            System.out.println("Thread name: " + this.getName() + " " + i);
        }
    }
}
