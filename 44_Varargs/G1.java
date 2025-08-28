class G1 {
    static void mno(String x,int...y) {
    }   
    
    public static void main(String[] args) {
        G1.mno();
       
        

        
    }
}
// PS D:\Java Coaching Code\44_Varargs> cd "d:\Java Coaching Code\44_Varargs\" ; if ($?) { javac G1.java } ; if ($?) { java G1 }
// G1.java:6: error: method mno in class G cannot be applied to given types;
//         G.mno();
//          ^
//   required: String
//   found:    no arguments
//   reason: actual and formal argument lists differ in length