//Class Castic Exception

//Runtime error
//narrowing coversion parent ----> child
public class F2 {
    public static void main(String[] args) {
         livingbeing x= new livingbeing();
         animal y=(animal)x;
         //explicitly (animal)x by programmer
        animal []arr={ new animal(), new cow(),(animal)y,new cat(),new bdog()};
        for(animal i:arr){
            System.out.println(i);
        }

    }
}
/*
 * Exception in thread "main" java.lang.ClassCastException: class livingbeing cannot be cast to class animal (livingbeing and animal are in unnamed module of loader 'app')
        at F2.main(F2.java:6)

 */