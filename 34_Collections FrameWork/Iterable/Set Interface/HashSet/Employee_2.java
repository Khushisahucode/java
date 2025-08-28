class Employee_2{
    int age;
    String name;

    Employee_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "-" + this.age;
    }
    public boolean equals(Object obj){
        boolean flag=false;
        if(obj instanceof Employee_2){
        Employee_2 a=this;
        Employee_2 b= (Employee_2)obj;
         String nm= a.name;
        String nm2= b.name;
        flag=nm.equals(nm2);}
        return flag;
    }
}

