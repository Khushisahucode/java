
public class string1 {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("hello");  //mutable string
        str.append("hii");
        System.out.println(str.length());
        System.out.println(str);
        System.out.println(str);
    }
}

//output
//8
//hellohii
//hellohii
