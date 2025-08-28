import java.io.File;

class V {
    public static void main(String[] args) {
        File file = new File("semo/xxx.txt");

        File dest = new File("C:/Users/sahuj/daya.txt");

        System.out.println(file.renameTo(dest));//false
    }
}