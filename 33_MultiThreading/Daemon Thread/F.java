class D3Thread extends Thread {
    public void run() {
        E1Thread a = new E1Thread();
        a.setName("chitragupt");
      //  a.start();//not ok
        a.setDaemon(false);
        a.start();//ok
Thread x = Thread.currentThread();
for(int i=0;i<30;i++) {
            System.out.println(i + " - " + x.getName());
        }
System.out.println(x.getName() + " is a Daemon Thread: " + x.isDaemon());
    }
}
class E1Thread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
       for(int i=0;i<10;i++) {
            System.out.println(i + " - " + x.getName());
        }
 System.out.println(x.getName() + " is a Daemon Thread: " + x.isDaemon());
    }
}
class F {
    public static void main(String[] args) {
        D3Thread x = new D3Thread();
        x.setName("Yamraj");
        x.setDaemon(true);
        x.start();
       try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
    }    
}
// 0 - Yamraj
// 1 - Yamraj
// 2 - Yamraj
// 3 - Yamraj
// 4 - Yamraj
// 0 - chitragupt
// 1 - chitragupt
// 2 - chitragupt
// 5 - Yamraj
// 6 - Yamraj
// 3 - chitragupt
// 7 - Yamraj
// 8 - Yamraj
// 4 - chitragupt
// 9 - Yamraj
// 10 - Yamraj
// 5 - chitragupt
// 6 - chitragupt
// 7 - chitragupt
// 11 - Yamraj
// 12 - Yamraj
// 8 - chitragupt
// 9 - chitragupt
// 13 - Yamraj
// 14 - Yamraj
// 15 - Yamraj
// 16 - Yamraj
// 17 - Yamraj
// 18 - Yamraj
// 19 - Yamraj
// 20 - Yamraj
// 21 - Yamraj
// 22 - Yamraj
// 23 - Yamraj
// 24 - Yamraj
// 25 - Yamraj
// 26 - Yamraj
// 27 - Yamraj
// 28 - Yamraj
// 29 - Yamraj
// Yamraj is a Daemon Thread: true
// chitragupt is a Daemon Thread: false