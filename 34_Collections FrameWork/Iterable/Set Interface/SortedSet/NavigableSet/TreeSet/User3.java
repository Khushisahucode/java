class User3 implements Comparable{
   int age;
    String name;
User3(String name, int age) {
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
    public int compareTo(Object obj){
        System.out.println(this+"....compareTo...." +obj);

        return this.name.compareTo(((User3)obj).name);
    }
}

