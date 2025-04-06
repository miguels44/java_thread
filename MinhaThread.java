public class MinhaThread extends Thread {
    public MinhaThread(String name){
        super(name);
    }
    @Override
    public void run(){
        super.run();
        System.out.println("Thread " + super.getName() + " sendo executada.");
        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Execução da thread " + super.getName() + " foi terminada." );
    }
}
