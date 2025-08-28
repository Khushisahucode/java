public class T {
 int y=98;
    void pro(){
        class ss{
            void info(){
                System.out.println(y);
            }
        }
        ss x=new ss();
        x.info();
        
    }

    public static void main(String[] args) {
        T t=new T();
        t.pro();
    }
}
//98