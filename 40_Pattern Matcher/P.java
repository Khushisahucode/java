import java.util.regex.Matcher;
import java.util.regex.Pattern;
class P {
public static void main(String[] args) {
        Pattern p = Pattern.compile("[^b-s0-8]");
        Matcher m = p.matcher("my name is aaditya bhallaa 879");
        while(m.find())
        System.out.println( m.start()+ "..."+ m.end()+ " ..."+m.group());
          }
    }
//     PS D:\Java Coaching Code\40_Pattern Matcher> cd "d:\Java Coaching Code\40_Pattern Matcher\" ; if ($?) { javac P.java } ; if ($?) { java P }
// 1...2 ...y
// 2...3 ...
// 4...5 ...a
// 7...8 ...
// 10...11 ...
// 11...12 ...a
// 12...13 ...a
// 15...16 ...t
// 16...17 ...y
// 17...18 ...a
// 18...19 ...
// 21...22 ...a
// 24...25 ...a
// 25...26 ...a
// 26...27 ...
// 29...30 ...9