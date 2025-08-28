public class D {
    public static void main(String[] args) {
        Float x= Float.valueOf(3.45);
        System.out.println(x);
    }
}
// D.java:3: error: no suitable method found for valueOf(double)
//         Float x= Float.valueOf(3.45);
//                       ^
//     method Float.valueOf(String) is not applicable
//       (argument mismatch; double cannot be converted to String)
//     method Float.valueOf(float) is not applicable
//       (argument mismatch; possible lossy conversion from double to float)
// 1 error