class I2 {
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
        
        I2.pro(l2);
        I2.pro(l);

        
    }
}
// I2.java:16: error: method pro in class I2 cannot be applied to given types;
//         I2.pro(l2);
//           ^
//   required: Animal[]
//   found:    Livingbeing
//   reason: varargs mismatch; Livingbeing cannot be converted to Animal
// I2.java:17: error: method pro in class I2 cannot be applied to given types;
//         I2.pro(l);
//           ^
//   required: Animal[]
//   found:    Livingbeing
//   reason: varargs mismatch; Livingbeing cannot be converted to Animal
// 2 errors