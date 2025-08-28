public class equals2 {
    
    public static void main(String[] args) {
        Student x=new Student("khushi", 22);
        Student y=new Student("khushi", 22);
        System.out.println(x==y);  //false
        System.out.println(x.equals(y));//false 
        //true when override object class equals  method
    }
}
/*
false
false
 */