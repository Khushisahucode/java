import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Greedy Qunatifier
class Z{
public static void main(String[] args) {
        Pattern p = Pattern.compile(".+xx");
        Matcher m = p.matcher("a7krxx 9i 12exx");
        while(m.find())
        System.out.println( m.start()+ "..."+ m.end()+ " ..."+m.group());
          }
    }
//0...15 ...a7krxx 9i 12exx