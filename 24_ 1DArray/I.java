public class I{
    public static void main(String[] args) {
        student arr[]=new student[4];
         arr[0]=new student(21,"mukul" );
         arr[1]=new student(18,"madhu");
         arr[2]=new student(15,"riya");
         arr[3]=new student(30,"rohit");
         System.out.println("object 1 refrence code : "+arr[0]);
         System.out.println("object 2 refrence code : "+arr[1]);
         System.out.println("object 3 refrence code : "+arr[2]);
         System.out.println("object 4 refrence code : "+arr[3]);
         System.out.println("object 1 name :"+arr[0].name);
         System.out.println("object 1 age  :"+arr[0].age);
    
        }
}
