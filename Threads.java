public class Threads {
    public static void main(String[] args){
        Thread t1 = new MinhaThread("t1");
        Thread t2 = new MinhaThread("t2");
        Thread t3 = new MinhaThread("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}