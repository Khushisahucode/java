import java.io.File;

class P{
    public static void main(String[] args) {
        File file = new File("aaa/bbb/ccc");

        System.out.println("aaa/bbb/ccc exists?: " + file.exists());
        
        boolean flag = file.mkdirs();

        System.out.println("aaa/bbb/ccc created ? : " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("aaa/bbb/ccc ?: " + file.exists());
    }
}