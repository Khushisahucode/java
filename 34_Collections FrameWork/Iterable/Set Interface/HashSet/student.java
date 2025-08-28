class student{
    int age;
    String name;
    student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return this.name+"-"+this.age;
    }
   
}