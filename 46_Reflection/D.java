
class D{
    public static void main(String[]args){
        Class<coffemugsize> klass=coffemugsize.class;
        coffemugsize[]arr=klass.getEnumConstants();
       for(coffemugsize next:arr)
        System.out.println(next);
      }
    }
    enum coffemugsize{
small,medium,large
    }
//     small
// medium
// large