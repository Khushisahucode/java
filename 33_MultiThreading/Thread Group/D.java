class D{
    public static void main(String[]args){
        Thread x=Thread.currentThread();
        ThreadGroup y= x.getThreadGroup();
        ThreadGroup z=y.getParent();
         ThreadGroup w=z.getParent();
        System.out.println("Thread name :"  +x.getName());
         System.out.println("Thread Group name : "+y.getName());
          System.out.println( " parent Thread Group name: "+z.getName());
System.out.println( " system's parent Thread Group name: "+w.getName());

    }
}
// Thread name :main
// Thread Group name : main
//  parent Thread Group name: system
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.ThreadGroup.getName()" because "<local4>" is null
//         at D.main(D.java:10)