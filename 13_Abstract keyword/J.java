public class J {
    
    final abstract  void pro(){

    }
    private abstract void show(){

    }
    static  abstract void aaaa(){

    }
}
/*
 * J.java:3: error: illegal combination of modifiers: abstract and final
    final abstract  void pro(){
                         ^
J.java:6: error: illegal combination of modifiers: abstract and private
    private abstract void show(){
                          ^
J.java:9: error: illegal combination of modifiers: abstract and static
    static  abstract void aaaa(){
                          ^
J.java:1: error: J is not abstract and does not override abstract method aaaa() in J
public class J {
       ^
4 errors
 */
