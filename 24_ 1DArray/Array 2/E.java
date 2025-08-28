public class E {
    public static void main(String[] args) {
        
        animal []arr=new animal [5];
        arr[0] =new animal();
        arr[1] =new cow();
        arr[2] =new Dog();
        arr[3] =new cat(); 
        arr[4] =new bdog();
        for(animal i:arr){
            System.out.println(i);
        }

    }
}
/*
animal@2ff4acd0
cow@54bedef2
Dog@5caf905d
cat@27716f4
bdog@8efb846

 */