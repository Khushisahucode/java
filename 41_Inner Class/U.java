public class U {
private  int y=98;
    static void pro(){
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
// U.java:6: error: non-static variable y cannot be referenced from a static context
//                 System.out.println(y);
//                                    ^
// 1 error