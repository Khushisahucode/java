 class s1{
int a=90;
void aaa(){
System.out.println("aaa() in s1......");
}
 }
 class s2 extends s1{
int b=56;
void bbb(){
System.out.println("bbb() in s2......");
}
 }
 class s3 extends s2{
char ch='h';
void ccc(){
System.out.println("ccc() in s3.......");
}
 }
 
 
 public class Q{
public static void main(String[]args){
   s3 x=new s3() ;
  System.out.println(x.a);
  System.out.println(x.b);
  System.out.println(x.ch);
  x.aaa();
  x.bbb();
  x.ccc();

}

}