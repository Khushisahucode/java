class E{
    public static void main(String[]args){
        Thread x=Thread.currentThread();
        ThreadGroup y= x.getThreadGroup();
        ThreadGroup z=y.getParent();
         
        System.out.println("Thread name :"  +x.getName());
         System.out.println("Thread Group name : "+y.getName());
          System.out.println( " parent Thread Group name: "+z.getName());
System.out.println( " system's parent Thread Group components: ");
           z.list(); }
}
// Thread name :main
// Thread Group name : main
//  parent Thread Group name: system
//  system's parent Thread Group components:
// java.lang.ThreadGroup[name=system,maxpri=10]
//     Thread[#9,Reference Handler,10,system]
//     Thread[#10,Finalizer,8,system]
//     Thread[#11,Signal Dispatcher,9,system]
//     Thread[#12,Attach Listener,5,system]
//     Thread[#18,Notification Thread,9,system]
//     java.lang.ThreadGroup[name=main,maxpri=10]
//         Thread[#1,main,5,main]
//     java.lang.ThreadGroup[name=InnocuousThreadGroup,maxpri=10]
//         Thread[#19,Common-Cleaner,8,InnocuousThreadGroup]