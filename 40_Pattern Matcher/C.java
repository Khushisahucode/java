import java.util.regex.Matcher;
import java.util.regex.Pattern;
class C{
    public static void main(String[]args){
        Pattern p= Pattern.compile("is");
        Matcher m=p.matcher("khushi is carrier oriented girl");
        boolean flag=m.find();
        if(flag){
            int st=m.start();
            int end=m.end();
            String grp=m.group();
        System.out.println(st);
        System.out.println(end);
        System.out.println(grp);
    }
    }
}
// 7
// 9
// is