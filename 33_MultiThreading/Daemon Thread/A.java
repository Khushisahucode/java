class A {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        boolean flag = x.isDaemon();//false

        System.out.println(flag);
    }    
}