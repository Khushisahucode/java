class student3{
    int age;
    String name;
    student3(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return this.name+"-"+this.age;
    }
    public boolean equals (Object obj){
        return this.name.equals(((student3)obj). name);
    }
}