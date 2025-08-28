
class H1{
    public static void main(String[]args){
              ThreadGroup y=Thread.currentThread().getThreadGroup().getParent();
        ThreadGroup x=new ThreadGroup( y,"dholakpur");
        CRunnable c=new CRunnable();
          Thread a=new Thread(x,c);
        a.setName("bheem");
        a.start();
        Thread a2=new Thread(x,c);
        a2.setName("raju");
        a2.start();
          Thread a3=new Thread(x,c);
        a3.setName("jaggu");
        a3.start();
        Thread a4=new Thread(x,c);
        a4.setName("kaliya");
        a4.start();
        //ThreadGroup y=Thread.currentThread().getThreadGroup().getParent();
       y.list();
        System.out.println(  " count of active Thread : "+y.activeCount());
           }
}
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
//     java.lang.ThreadGroup[name=dholakpur,maxpri=10]
//         Thread[#20,bheem,5,dholakpur]
//         Thread[#21,raju,5,dholakpur]
//         Thread[#22,jaggu,5,dholakpur]
//         Thread[#23,kaliya,5,dholakpur]
//  count of active Thread : 11