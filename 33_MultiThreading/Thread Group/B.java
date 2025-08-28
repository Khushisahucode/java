class B{
    public static void main(String[]args){
        Thread x=Thread.currentThread();
        ThreadGroup y= x.getThreadGroup();
        System.out.println(x);
         System.out.println(y);

    }
}