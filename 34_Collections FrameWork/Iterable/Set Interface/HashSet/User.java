
class User {

    int age;
    String name;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "-" + this.age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;
        if (obj instanceof User) {
            User a = this;
            User b = (User) obj;
            System.out.println(a + "....compare To...." + b);
            String nm = a.name;
            String nm2 = b.name;
            int ag1 = a.age;
            int ag2 = b.age;
            flag = nm.equals(nm2) && ag1 == ag2;
        }
        return flag;
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
}
