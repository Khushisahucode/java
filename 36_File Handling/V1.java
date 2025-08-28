import java.io.File;

class V1 {
    public static void main(String[] args) {
        File file = new File("bb.txt");

        File dest = new File("C:/Users/sahuj/pp.txt");

        System.out.println(file.renameTo(dest));//true
    }
}