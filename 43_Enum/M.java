enum coffemugsize{
Large,medium,Small;
}

class M{
    public static void main(String[]args){
       coffemugsize x=new coffemugsize();
    }
}
// M.java:7: error: enum classes may not be instantiated
//        coffemugsize x=new coffemugsize();
//                       ^
// 1 error