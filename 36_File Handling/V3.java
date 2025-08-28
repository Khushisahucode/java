import java.io.File;

class V3 {
    public static void main(String[] args) {
        File file = new File("ketu");//empty folder

        File dest = new File("C:/Users/sahuj/setu");

        System.out.println(file.renameTo(dest));//false
    }
}