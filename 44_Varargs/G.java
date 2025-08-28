class G {
    static void mno(String x) {
    }   
    
    public static void main(String[] args) {
        G.mno();
       
        

        
    }
}
// PS D:\Java Coaching Code\44_Varargs> cd "d:\Java Coaching Code\44_Varargs\" ; if ($?) { javac G.java } ; if ($?) { java G }
// G.java:6: error: method mno in class G cannot be applied to given types;
//         G.mno();
//          ^
//   required: String
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// // 1 error