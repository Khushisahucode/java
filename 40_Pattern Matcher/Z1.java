import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Reluctant Qunatifier
class Z1{
public static void main(String[] args) {
        Pattern p = Pattern.compile(".+?xx");
        Matcher m = p.matcher("a7krxx 9i 12exx");
        while(m.find())
        System.out.println( m.start()+ "..."+ m.end()+ " ..."+m.group());
          }
    }
//     0...6 ...a7krxx
// 6...15 ... 9i 12exx