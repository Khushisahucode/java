import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
class A {
    public static void main(String[] args) throws IOException {
        
        
        Student s1 = new Student("yamraj", 10000, new Address(new City("yamnagari"), new State("yamlok")));
        Student s2 = new Student("indra", 100, new Address(new City("swargnagari"), new State("Swarglok")));
        Student s3 = new Student("yudhishtir", 35, new Address(new City("indraprasth"), new State("new Delhi")));

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bheem.txt"));

        oos.writeObject(students);

        oos.close();
    }
}

