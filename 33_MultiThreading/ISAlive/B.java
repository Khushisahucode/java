class BThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(x.getName() + " - " + i);
        }

        System.out.println(B.a.isAlive());
    }
}

class B {
    static Thread a;
    public static void main(String[] args) {
        a = Thread.currentThread();

        BThread y = new BThread();
        y.setName("A");
        y.start();
    }    
}
// A - 0
// A - 1
// A - 2
// A - 3
// A - 4
// A - 5
// A - 6
// A - 7
// A - 8
// A - 9
// A - 10
// A - 11
// A - 12
// A - 13
// A - 14
// A - 15
// A - 16
// A - 17
// A - 18
// A - 19
// A - 20
// A - 21
// A - 22
// A - 23
// A - 24
// A - 25
// A - 26
// A - 27
// A - 28
// A - 29
// false