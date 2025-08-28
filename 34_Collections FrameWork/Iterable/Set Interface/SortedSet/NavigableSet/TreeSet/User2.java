
class User2 implements Comparable<User2>{
   int age;
    String name;

    User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "-" + this.age;
    }
    public int hashCode() {
        int code = 0;
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < name.length(); i++) {
            code += str.indexOf(name.charAt(i));
        }
        code = code + age;
        System.out.println(code + "........" + this);
        return code;
    }
    public int compareTo(User2 obj){
        System.out.println(this+"....compareTo...." +obj);

        return this.name.compareTo(obj.name);
    }
}

