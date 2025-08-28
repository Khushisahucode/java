public class H {

    public static void main(String[] args) {
        Animal x=new cat();
        try{
        dog b= (dog)x;
    }catch(ClassCastException e){
        System.out.println("some problm ");
    }

    }
    }
//some problm
