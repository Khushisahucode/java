import java.util.ArrayList;

public class P2 {
    public static void main(String[] args) {
        ArrayList<  ? super dog >list=new ArrayList<Object>();
        ArrayList<  ? super dog >list2=new ArrayList<Animal>();
        ArrayList<  ? super dog >list3=new ArrayList<livingbeing>();
        ArrayList<  ? super dog >list4=new ArrayList<dog>();
         list.add(new bdog());
          list.add(new dog());
            list.add(new livingbeing());
              list.add(new Object()); 
    }
}
// P2.java:11: error: incompatible types: livingbeing cannot be converted to CAP#1
//             list.add(new livingbeing());
//                      ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: dog from capture of ? super dog
// P2.java:12: error: incompatible types: Object cannot be converted to CAP#1
//               list.add(new Object()); 
//                        ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Object super: dog from capture of ? super dog
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors