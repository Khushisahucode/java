
//widely coversion child --->parent
public class F {
    public static void main(String[] args) {
         Dog x= new Dog();
         animal y=x;//implicitly (animal)x by compilor
        animal []arr={ new animal(), new cow(),y,new cat(),new bdog()};
        for(animal i:arr){
            System.out.println(i);
        }

    }
}
/*
 * animal@2ff4acd0
cow@54bedef2
Dog@5caf905d
cat@27716f4
bdog@8efb846

 */