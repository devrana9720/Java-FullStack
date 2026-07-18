
class A extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread A: ");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Thread A interrupted: " + e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread B: ");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Thread B interrupted: " + e);
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
