public class replace_3 {
     public static void main(String[]args){
    String x ="mohan";
    String y="sohan";
    String z=x.replace('m','s');
System.out.println(x  == y);
System.out.println(y.equals(z) );
System.out.println(y==z );
System.out.println("string = "+ x);
System.out.println("string2 = "+ y);
System.out.println("string3 = "+ z);
 }
}
// false
//true
// false
// string = sohan
// string2 = sohan
// string3 = mohan