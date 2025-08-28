

class student  {
   Integer age;
    String name;

    student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "-" + this.age;
    }
    // public int compareTo(student obj){
    //     System.out.println(this+"....compareTo...." +obj);
    //  return this.name.compareTo(obj.name);}
}
