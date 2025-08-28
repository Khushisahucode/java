class B{
    public static void main(String[]args){
        Class klass=aa.class;
        Class[] arr=klass.getDeclaredClasses();
        for(Class next:arr){
      System.out.println(next.getName());}
    }
}
// aa$c2
// aa$b2
// aa$a2
// aa$c1
// aa$b1
// aa$a1