public class D {
  public static void main(String[]args){
  aaa();
    Thread x=Thread.currentThread();
    
     
    for(int i=0;i<30;i++){
      System.out.println(i + "-main()-"+ x.getName());
    }
  }
static void aaa(){
     Thread x=Thread.currentThread();
    for(int i=0;i<30;i++){
      System.out.println(i + " -aaa()-"+ x.getName());
    }

  }}
// 0 -aaa()-main
// 1 -aaa()-main
// 2 -aaa()-main
// 3 -aaa()-main
// 4 -aaa()-main
// 5 -aaa()-main
// 6 -aaa()-main
// 7 -aaa()-main
// 8 -aaa()-main
// 9 -aaa()-main
// 10 -aaa()-main
// 11 -aaa()-main
// 12 -aaa()-main
// 13 -aaa()-main
// 14 -aaa()-main
// 15 -aaa()-main
// 16 -aaa()-main
// 17 -aaa()-main
// 18 -aaa()-main
// 19 -aaa()-main
// 20 -aaa()-main
// 21 -aaa()-main
// 22 -aaa()-main
// 23 -aaa()-main
// 24 -aaa()-main
// 25 -aaa()-main
// 26 -aaa()-main
// 27 -aaa()-main
// 28 -aaa()-main
// 29 -aaa()-main
// 0-main()-main
// 1-main()-main
// 2-main()-main
// 3-main()-main
// 4-main()-main
// 5-main()-main
// 6-main()-main
// 7-main()-main
// 8-main()-main
// 9-main()-main
// 10-main()-main
// 11-main()-main
// 12-main()-main
// 13-main()-main
// 14-main()-main
// 15-main()-main
// 16-main()-main
// 17-main()-main
// 18-main()-main
// 19-main()-main
// 20-main()-main
// 21-main()-main
// 22-main()-main
// 23-main()-main
// 24-main()-main
// 25-main()-main
// 26-main()-main
// 27-main()-main
// 28-main()-main
// 29-main()-main

     