   import java.util.regex.Matcher;
import java.util.regex.Pattern;
class N {
public static void main(String[] args) {
        Pattern p = Pattern.compile("[mno]");
        Matcher m = p.matcher(" -mshb3448^%$^*##^*@$o");
        while(m.find())
        System.out.println( m.start()+ "..."+ m.end()+ " ..."+m.group());
          }
    }
    //2...3 ...m
   // true...21...22 ...o