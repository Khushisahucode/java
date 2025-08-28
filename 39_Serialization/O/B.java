import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
class B {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ArrayList<Student> al = (ArrayList<Student>)(new ObjectInputStream(new FileInputStream("arjun.txt")).readObject());

        for(Student x : al) {
            System.out.println(x.name);
            System.out.println(x.age);
            System.out.println(x.address.city.cityname);
            System.out.println(x.address.state.statename);
            System.out.println("~~~~~~~~~~~~~~ x ~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
// yamraj
// 10000
// yamnagari
// yamlok
// ~~~~~~~~~~~~~~ x ~~~~~~~~~~~~~~~~~~~~
// indra
// 100
// swargnagari
// Swarglok
// ~~~~~~~~~~~~~~ x ~~~~~~~~~~~~~~~~~~~~
// yudhishtir
// 35
// indraprasth
// new Delhi
// ~~~~~~~~~~~~~~ x ~~~~~~~~~~~~~~~~~~~~