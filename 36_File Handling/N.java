import java.io.File;

class N {
    public static void main(String[] args) {
        File file = new File("bheem.txt");

        System.out.println("bheem.txt exists?: " + file.exists());
        
        boolean flag = file.delete();

        System.out.println("bheem.txt deleted ? : " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("bheem.txt exists?: " + file.exists());
    }
}
// bheem.txt exists?: true
// bheem.txt deleted ? : true
// ~~~~~~~~~~~~~~~~~~
// bheem.txt exists?: false