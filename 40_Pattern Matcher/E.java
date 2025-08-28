import java.util.regex.Matcher;
import java.util.regex.Pattern;

class E {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");
        Matcher m = p.matcher("khushi is carrier oriented girl");
          m.find();
            int st = m.start();
            int end = m.end();
            String grp = m.group();
            System.out.println(st);
            System.out.println(end);
            System.out.println(grp);
        }
    }
    // Exception in thread "main" java.lang.IllegalStateException: No match found
    //     at java.base/java.util.regex.Matcher.checkMatch(Matcher.java:1850)
    //     at java.base/java.util.regex.Matcher.start(Matcher.java:493)
    //     at E.main(E.java:10)