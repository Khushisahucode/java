//by default Thread in java
class A{
    public static void main(String[]args){
        Thread x=Thread.currentThread();
        x.setName("golu");
  System.out.println(x);       
 System.out.println(  "priority : " +x.getPriority());
  System.out.println("id : " +x.getId());
System.out.println( "name : "+x.getName());
    }
}
// Thread[#1,golu,5,main]
// priority : 5
// id : 1
// name : golu