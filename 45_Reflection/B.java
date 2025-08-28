class B {
public static void main(String[]args){

    Class klass=Class.forName("Golu");
    System.out.println(klass);
}
}
// B.java:4: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
//     Class klass=Class.forName("Golu");
//                              ^
// 1 error