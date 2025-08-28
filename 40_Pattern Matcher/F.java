import java.util.regex.Matcher;
import java.util.regex.Pattern;

class F {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("ram");
        Matcher m = p.matcher("ram is very good guy and ram is very intelligent ram got 8 cgpa in class");
          
          System.out.println(m.find()+ "..."+ m.start()+ "..."+ m.end()+ " ..."+m.group());
          System.out.println(m.find()+ "..."+ m.start()+ "..."+ m.end()+ " ..."+m.group());
          System.out.println(m.find()+ "..."+ m.start()+ "..."+ m.end()+ " ..."+m.group());
          System.out.println(m.find()+ "..."+ m.start()+ "..."+ m.end()+ " ..."+m.group());  
        }
    }
//     true...0...3 ...ram
// true...25...28 ...ram
// true...49...52 ...ram
// Exception in thread "main" java.lang.IllegalStateException: No match found
//         at java.base/java.util.regex.Matcher.checkMatch(Matcher.java:1850)
//         at java.base/java.util.regex.Matcher.start(Matcher.java:493)
//         at F.main(F.java:13)