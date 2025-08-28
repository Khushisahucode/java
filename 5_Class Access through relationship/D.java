class D{
    public static void main(String[] args) {
        D x=new D();
        x.pro();
        x.age =34;
        x.name ="khushi";
        D1.name ="riya";
    }
    class D1{
        int age;
        static  String name;
        void pro(){
            age =67;
            System.out.print(age);
        }
    }
}
/*
 * D.java:4: error: cannot find symbol
        x.pro();
         ^
  symbol:   method pro()
  location: variable x of type D
D.java:5: error: cannot find symbol
        x.age =34;
         ^
  symbol:   variable age
  location: variable x of type D
D.java:6: error: cannot find symbol
        x.name ="khushi";
         ^
  symbol:   variable name
  location: variable x of type D
3 errors
 */