import java.util.regex.Matcher;
import java.util.regex.Pattern;
class K {
public static void main(String[] args) {
        Pattern p = Pattern.compile("\d");
        Matcher m = p.matcher("khushi got 9 marks in pcm ");
          
          System.out.println(p.pattern());
         
          System.out.println(m.pattern());  
        }
    }
// K.java:5: error: illegal escape character
//         Pattern p = Pattern.compile("\d");
//                                       ^
// 1 error