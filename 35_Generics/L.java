public class L {
    public static void main(String[]args){
      //ok
    ArrayList<Number>x= new ArrayList<>();
    ArrayList<Number>x3= new ArrayList();
      ArrayList x4= new ArrayList<Integer>();
       ArrayList<Number>x5= new ArrayList<>();
        ArrayList<Number>x6= new ArrayList<>();
        //ArrayList<Number>x2= new ArrayList<Integer>();//Not Ok
    }

}
// L.java:10: error: incompatible types: ArrayList<Integer> cannot be converted to ArrayList<Number>
//         ArrayList<Number>x2= new ArrayList<Integer>();//Not Ok
//                              ^
// Note: L.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error