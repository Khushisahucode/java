import java.util.regex.Matcher;
import java.util.regex.Pattern;

class H {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("aaa");
        Matcher m = p.matcher("aaaaaaa");
          
          while(m.find())
          System.out.println(m.start()+ "..."+ m.end()+ " ..."+m.group());  
        }
    }
// 0...3 ...aaa
// 3...6 ...aaa