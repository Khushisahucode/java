
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class matches_2 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher m = p.matcher("my email: hitesh_234.32@gmail.com and your email: golu_23@altavista.com and his email is: raju007@tcs.com");

        System.out.println(m.find());
        System.out.println(m.matches());
    }
}
// true
// false