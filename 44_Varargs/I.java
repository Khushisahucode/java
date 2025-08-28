class I {
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
        I.pro(c,d,b,c2);
        I.pro(l2);
        I.pro(l);

        
    }
}
// Cat@2ff4acd0
// Dog@54bedef2
// Bdog@5caf905d
// Cow@27716f4