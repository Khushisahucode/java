class A{
    public static void main(String[]args){
        Class klass=aa.class;
        Class[] arr=klass.getClasses();
        for(Class next:arr){
      System.out.println(next.getName());}
    }
}
// aa$c1
// aa$b1
// aa$a1
// aaa$aaa2
// aaa$aaa1