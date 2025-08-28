import java.io.File;

class Z1 {
    public static void main(String[] args) {
        File file = new File("semo");

        //String[] arr = file.list();
        File[] arr = file.listFiles();

        for(File next : arr) {
            System.out.println(next);
        }
    }
}
// semo\1.txt
// semo\rrr.txt
// semo\sss.txt
// semo\xxx.txt