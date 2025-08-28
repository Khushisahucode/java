
class x1{
    int x=90;
}

public class G extends x1 {
    int x=111;//member varible
     void pro(){
        System.out.println("value of x = "+x);
    }
      
           public static void main(String[]args){
           G x=new G();
          x.pro();
     }
}
//value of x = 111