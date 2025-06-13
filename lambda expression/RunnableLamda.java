 class A{
     public static void main(String[]args){
         Runnable r=new Runnable(){             public void run(){    
             System.out.println("Runnable using anomous class");
          }
               };r.run();
   }
}
public class RunnableLamda{
    public static void main(String[] args) {
        Runnable r=()->System.out.println("Runnable using Lamda Expression");
        r.run();
    }
}