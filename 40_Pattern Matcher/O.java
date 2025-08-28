import java.util.regex.Matcher;
import java.util.regex.Pattern;
class O {
public static void main(String[] args) {
        Pattern p = Pattern.compile("[m-s0-8]");
        Matcher m = p.matcher("my name is aaditya bhallaa 879");
        while(m.find())
        System.out.println( m.start()+ "..."+ m.end()+ " ..."+m.group());
          }
    }
// 0...1 ...m
// 3...4 ...n
// 5...6 ...m
// 9...10 ...s
// 27...28 ...8
// 28...29 ...7