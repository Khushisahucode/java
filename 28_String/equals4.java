public class equals4 {
    
        public static void main(String[] args) {
            String a= new String("om");
            String b=new String("om");
            String c=new String("om");
            System.out.println(a==b);
            System.out.println(b==c);
            System.out.println(a==c);
            System.out.println(a.equals(c));
        }
    }
   /*false
    false
    false
    true */
