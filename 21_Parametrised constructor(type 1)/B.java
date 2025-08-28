class student1 {
   static int count ;
    student1(){
        count++;
    }
    }
    class B{
    public static void main(String[] args) {
        student1 s1=new student1();
        student1 s2=new student1();
        student1 s3=new student1();
        
         student1 s4=new student1();
          System.out.println(s1.count);
          System.out.println(s2.count);
          System.out.println(s3.count);
          System.out.println(s4.count);
    
    
    } 
    }