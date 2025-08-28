class DThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + x.getName());
        }

        System.out.println(x.getName() + " is a Daemon Thread: " + x.isDaemon());
    }
}

class B{
    public static void main(String[] args) {
        DThread x = new DThread();
        x.setName("Yam");
        x.start();
    }    
}
// 0 - Yam
// 1 - Yam
// 2 - Yam
// 3 - Yam
// 4 - Yam
// 5 - Yam
// 6 - Yam
// 7 - Yam
// 8 - Yam
// 9 - Yam
// 10 - Yam
// 11 - Yam
// 12 - Yam
// 13 - Yam
// 14 - Yam
// 15 - Yam
// 16 - Yam
// 17 - Yam
// 18 - Yam
// 19 - Yam
// 20 - Yam
// 21 - Yam
// 22 - Yam
// 23 - Yam
// 24 - Yam
// 25 - Yam
// 26 - Yam
// 27 - Yam
// 28 - Yam