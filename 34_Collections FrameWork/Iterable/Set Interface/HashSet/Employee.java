  class Employee{
    int age;
    String name;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "-" + this.age;
    }
    public boolean equals(Object obj){
        Employee a=this;
        Employee b= (Employee)obj;
         String nm= a.name;
        String nm2= b.name;
        return nm.equals(nm2);
    }
}
