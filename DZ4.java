public class DZ4 {
    private volatile static char currentChar = 'A';
    

    public static void main(String[] args) throws InterruptedException {

        DZ4 monitor = new DZ4();
        Thread t1 = new Thread(() -> {
            printToChar(monitor, 'A', 'B');
        });
        Thread t2 = new Thread(() -> {
            printToChar(monitor, 'B', 'C');
        });
        Thread t3 = new Thread(() -> {
            printToChar(monitor, 'C', 'A');
        });
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

    }




    private static void printToChar(Object monitor, char letter1, char letter2) {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != letter1) {
                        monitor.wait();
                    }
                    System.out.print(currentChar);
                    currentChar = letter2;
                    monitor.notifyAll();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}




