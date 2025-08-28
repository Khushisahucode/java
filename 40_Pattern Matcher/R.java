import java.util.regex.Matcher;
import java.util.regex.Pattern;
class R{
public static void main(String[] args) {
        Pattern p = Pattern.compile("[6-9][0-9]{9}");
        Matcher m = p.matcher("my phone numbe is 9907383932  and my father's no is 8770875527");
        while(m.find())
        System.out.println( m.start()+ "..."+ m.end()+ " ..."+m.group());
          }
    }
// 18...28 ...9907383932
// 52...62 ...8770875527