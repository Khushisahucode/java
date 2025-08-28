//command line-----> >java class name  mohan riya addi jay 
public class E {
     public static void main(String []args){
   System.out.println("args length ="+ args.length);
  System.out.println("args refrence code of string object = "+ args);
for(String str:args){
    System.out.println(str+"");
}
    }
}
/*
 * C:\Users\sahuj\java coaching code\miscellaneous>java E aadi mohan rishabh khushi riya
args length =5
args refrence code of string object = [Ljava.lang.String;@33c7353a
aadi
mohan
rishabh
khushi
riya
 */
 