class C{
    public static void main(String[]args){
        Thread x=Thread.currentThread();
        ThreadGroup y= x.getThreadGroup();
        ThreadGroup z=y.getParent();
        System.out.println("Thread name :"  +x.getName());
         System.out.println("Thread Group name : "+y.getName());
          System.out.println( " parent Thread Group name: "+z.getName());

    }
}
// Thread name :main
// Thread Group name : main
//  parent Thread Group name: system