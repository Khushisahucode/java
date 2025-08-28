import java.util.regex.Matcher;
import java.util.regex.Pattern;
class L {
public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher("khushi got 9 marks in pcm ");
        System.out.println(m.find()+ "..."+ m.start()+ "..."+ m.end()+ " ..."+m.group());
         
           
        }
    }
   // true...11...12 ...9