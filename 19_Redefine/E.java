class car{

}
class sportscar extends car{

}//no runtime polymorphism

public class E {
    static void show(car a){
       System.out.println("car........"); 
    }
    static void show(sportscar a){
      System.out.println("sportscar......");  
    }
    public static void main(String[] args) {
       car x=new  sportscar();
       show(x) ;
    }
}

