import java.util.Vector;

public class Threadsafety_2 {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // थ्रेड 1: वेक्टर में तत्व जोड़ना
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                vector.add(i);
                System.out.println("Thread 1: Added " + i);
                try {
                    Thread.sleep(100); // कुछ समय के लिए रुकें
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // थ्रेड 2: वेक्टर से तत्व हटाना
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                if (!vector.isEmpty()) {
                    int removedElement = vector.remove(vector.size() - 1);
                    System.out.println("Thread 2: Removed " + removedElement);
                }
                try {
                    Thread.sleep(150); // कुछ समय के लिए रुकें
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.setName("A");
        thread2.setName("B");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Vector: " + vector);
    }
}
// Thread 1: Added 0
// Thread 1: Added 1
// Thread 2: Removed 1
// Thread 1: Added 2
// Thread 2: Removed 2
// Thread 1: Added 3
// Thread 1: Added 4
// Thread 2: Removed 4
// Thread 2: Removed 3
// Final Vector: [0]