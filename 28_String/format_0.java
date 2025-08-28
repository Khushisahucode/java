public class format_0 {
 public static void main(String[] args) {
      System.out.println(args.length);
      String x = "my name is =  " + args[0] + " and my age is = " + args[1] + " and my marks is  = " + args[2];
      System.out.println(x);
   }
}
// PS C:\Users\sahuj\java coaching code\28_String> java format_0 " rishabh tiwari " , "21  " , "98"
// 3
// my name is =   rishabh tiwari  and my age is = 21   and my marks is  = 98

// PS C:\Users\sahuj\java coaching code\28_String> java format_0 " rishabh tiwari " ,  21 , 80                                                                   
// 3
// my name is =   rishabh tiwari  and my age is = 21 and my marks is  = 80