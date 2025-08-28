class  recursion{
   recursion(){
   this(4);
   }
   /*
    * recursion constructor
    */
   recursion(int x){
      this();
   }

public static void main(String[]args){

}
}/*
recursion.java:9: error: recursive constructor invocation
      this();
      ^
1 error
*/