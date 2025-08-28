class I3{
    static void pro(Animal...x) {
        for(Animal next:x)
        System.out.println(next);
    }   
    
    public static void main(String[] args) {
        
       Livingbeing l=new Livingbeing();
       Cat c=new Cat();
       Cow c2=new Cow();
       Livingbeing l2=c;
       Dog d=new Dog();
       Bdog b=new Bdog();
        
        I3.pro((Animal)l2);
        I3.pro((Animal)l);

        
    }
}
// Cat@2ff4acd0
// Exception in thread "main" java.lang.ClassCastException: class Livingbeing cannot be cast to class Animal (Livingbeing and Animal are in unnamed module of loader 'app')
//         at I3.main(I3.java:17)