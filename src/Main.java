public class Main {

//    static class Rohit extends Thread{
////
////        @Override
////        public void run() {
////            for(int i=0;i<5;i++) {
////                System.out.println("Rohit");
////                try {
////                    Thread.sleep(1);
////                } catch (InterruptedException e) {
////                    throw new RuntimeException(e);
////                }
////            }
////        }
////    }

    static class Rohit implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<5;i++)
                System.out.println("Rohit");
        }
    }
    public static void main(String[] args) throws InterruptedException {

        // extend Thread class
//        Rohit r = new Rohit();
//        r.start();

        // Runnable
        Rohit r = new Rohit();
        Thread t = new Thread(r);  // extra line
        t.start();

        for(int i=0;i<5;i++){
            System.out.println("Virat");
            Thread.sleep(1);
        }

        for(int i=0;i<5;i++){
            System.out.println("Dhoni");
            Thread.sleep(5);
        }
    }
}