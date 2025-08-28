   import java.util.regex.Matcher;
import java.util.regex.Pattern;
class M {
public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d\\d");
        Matcher m = p.matcher("khushi got 89 marks in pcm and 468in over all ");
        System.out.println(m.find()+ "..."+ m.start()+ "..."+ m.end()+ " ..."+m.group());
         
           System.out.println(m.find()+ "..."+ m.start()+ "..."+ m.end()+ " ..."+m.group());
           
        }
    }
// true...11...13 ...89
// true...31...33 ...46