import java.util.regex.Matcher;
import java.util.regex.Pattern;
class T{
public static void main(String[] args) {
        Pattern p = Pattern.compile("0[xX][a-fA-F0-9]{2,}");
        Matcher m = p.matcher("my hexanumber is 990x25ahk*$^#% 0xkdh$%$#!24 0x7354f7687jkjj");
        while(m.find())
        System.out.println( m.start()+ "..."+ m.end()+ " ..."+m.group());
          }
    }
//     19...24 ...0x25a
// 45...56 ...0x7354f7687