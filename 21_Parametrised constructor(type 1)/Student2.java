public class Student2  extends user1{
        String name;
        String  degree;
        int marks;
      
        Student2(String name,String degree,int marks){
             super(22,12333,30000.0f,903438434);
            this.name=name;
            this.degree=degree;
            this.marks=marks;
          
        }
        public static void main(String[] args) {
            Student2 s=new Student2("khushi","B.TECH",90);
            
            
            System.out.println("name :"+s.name);
            System.out.println(" degree:"+s.degree);
            System.out.println("marks :"+s.marks);
            System.out.println("roll:"+s.roll);
            System.out.println("phone :"+s.phone);
            System.out.println(" age :"+s.age);
        
        }
    }
    /*
     * name :khushi
 degree:B.TECH
marks :90
roll:12333
phone :903438434
 age :22
     */

