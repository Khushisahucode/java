class Y1{
    public static void main(String[]args){
        Thread x=new Thread();
    x.setPriority(100);
    }

 }
// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1823)
//         at Y1.main(Y1.java:4)