public class student implements Comparable<student> {
    int age;
    String name;
student(String name,int age) {
        this.name = name;
        this.age = age;}
 public String toString() {
        return this.name + "-" + this.age; }
        public int compareTo(student obj){
            student a=this;
            student b=obj;
            return a.name.compareTo(b.name);
        }
}
