import java.util.regex.Matcher;
import java.util.regex.Pattern;
class I {
public static void main(String[] args) {
        Pattern p = Pattern.compile("om");
        Matcher m = p.matcher("om is good guy");
          
          System.out.println(m); 
          System.out.println(p);  
        }
    }
    //java.util.regex.Matcher[pattern=om region=0,14 lastmatch=]
//om