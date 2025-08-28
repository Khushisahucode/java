public class employee {
    String name;
    int age;
    employee(String name,int age){

        this.name=name;
        this.age=age;
    }
     public boolean equals(Object obj ){
           employee a=this;
           employee b=(employee)obj;
           String nm1=a.name;
           String nm2=b.name;
           int ag1=a.age;
           int ag2=b.age;
           return nm1.equals(nm2)&&ag1==ag2;
     }

}
