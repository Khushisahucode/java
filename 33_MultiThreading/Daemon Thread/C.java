class DThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + x.getName());
        }

        System.out.println(x.getName() + " is a Daemon Thread: " + x.isDaemon());
    }  //false
}

class C{
    public static void main(String[] args) {
        DThread x = new DThread();
        x.setName("Yam");
        x.start();
          try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
    }  
    }    
