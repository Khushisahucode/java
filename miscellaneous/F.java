
    //command line-----> >java class name  mohan verma  34 78 4556 
public class F {
    public static void main(String []args){
  System.out.println("args length ="+ args.length);
 System.out.println("args refrence code of string object = "+ args);
for(String str:args){
   System.out.println(str+"");
}
   }
}
/*
 * 
C:\Users\sahuj\java coaching code\miscellaneous>java F mohan verma 34 56 7 343 65
args length =7
args refrence code of string object = [Ljava.lang.String;@33c7353a
mohan
verma
34
56
7
343
65
 */
