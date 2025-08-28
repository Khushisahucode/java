import java.io.File;

class V2{
    public static void main(String[] args) {
        File file = new File("kk");//empty folder

        File dest = new File("C:/Users/sahuj/srk");

        System.out.println(file.renameTo(dest));//false
    }
}