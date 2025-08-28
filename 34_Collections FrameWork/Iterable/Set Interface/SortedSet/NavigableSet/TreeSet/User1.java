public class User1 {
    Integer age;
    String name;

    User1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "-" + this.age;
    }
}
