import java.util.regex.Matcher;
import java.util.regex.Pattern;

class G {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("ram");
        Matcher m = p.matcher("ram is very good guy and ram is very intelligent ram got 8 cgpa in class");
          
          while(m.find())
          System.out.println(m.start()+ "..."+ m.end()+ " ..."+m.group());  
        }
    }
// 0...3 ...ram
// 25...28 ...ram
// 49...52 ...ram