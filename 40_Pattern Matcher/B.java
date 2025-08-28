import java.util.regex.Pattern;
class B{
    public static void main(String[]args){
        Pattern p= new Pattern("khushi",9);
    }
}
// B.java:4: error: Pattern(String,int) has private access in Pattern
//         Pattern p= new Pattern("khushi",9);
//                    ^
// 1 error