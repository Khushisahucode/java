import java.util.LinkedList;

class J {
    public static void main(String[] s0) {
      LinkedList s1= new LinkedList();
      student s2 = new student("khushi", 22);
      student s3 = new student("madhu", 18);
      student s4 = new student("riya", 15);
      student s5 = new student("arvi", 10);
      student s6 = new student("shresth", 5);
      s1.add(s2);
      s1.add(s3);
      s1.add(s4);
      s1.add(s5);
      s1.add(s6);
      System.out.println("student LinkedList is : " + String.valueOf(s1));
   }
}
// student LinkedList is : [student@279f2327, student@2ff4acd0, s4]tudent@54bedef2, student@5caf905d, student@27716f