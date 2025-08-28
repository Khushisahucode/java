class User4 implements Comparable<User4>{
   Integer age;
    String name;

    User4(String name, Integer age) {
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
    public int compareTo(User4 obj){
        System.out.println(this+"....compareTo...." +obj);

        return this.age.compareTo(obj.age);
    }
}

