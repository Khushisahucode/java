import java.util.regex.Matcher;
import java.util.regex.Pattern;
class J {
public static void main(String[] args) {
        Pattern p = Pattern.compile("om");
        Matcher m = p.matcher("om is good guy");
          
          System.out.println(p.pattern());
         
          System.out.println(m.pattern());  
        }
    }
    //om
    //om