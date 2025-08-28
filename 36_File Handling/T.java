import java.io.File;
class T{
    public static void main(String[]args) {
     File file=new File("semo/aa.txt");
      // file.mkdir();
      File dest=new File("bb.txt");
       boolean x=file.renameTo(dest);
     System.out.println(x);
        
    
     

    }
}