class student21 {
    static int count ;
     student21(){
         count++;
     }
     }
     class C{
     public static void main(String[] args) {
         student21 s1=new student21();
         System.out.println(s1.count);
         student21 s2=new student21();
         System.out.println(s2.count);
         student21 s3=new student21();
         System.out.println(s3.count);
          student21 s4=new student21();
          
           System.out.println(s4.count);
     
     
     } 
     }