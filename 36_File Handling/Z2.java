import java.io.File;

class Z2 {
    public static void main(String[] args) {
        File file = new File("semo");

        String[] arr = file.list();
     //   File[] arr = file.listFiles();

        for(String next : arr) {
            System.out.println(next);
        }
    }
}
// 1.txt
// rrr.txt
// sss.txt
// xxx.txt