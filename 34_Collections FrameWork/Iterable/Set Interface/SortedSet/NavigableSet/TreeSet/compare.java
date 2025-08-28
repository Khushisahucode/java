
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
class compare {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Press 1 for AgeAscsort\n 2 for AgeDscsort \n 3 for  NameAscsort \n 4 for NameDscsort   : ");
        int val =sc.nextInt();  sc.close();
       Comparator<User1> com=null;
       if(val==1){
   com=new age_asc();
       }else if(val==2){
     com= new age_Dsc();
       }else if(val==3){
com= new name_asc();
       }else if (val==4){
com= new name_Dsc();
       }
       else{
            System.exit(0); }
        TreeSet<User1>x=new TreeSet<User1>(com);
        x.add(new User1("khushi",12));
        x.add(new User1("om",176));
       x.add(new User1("madhu",10));
       x.add(new User1("riya",111));
          x.add(new User1("arju",123));
          System.out.println("TreeSet is : "+ x);
 }} 

class age_asc implements Comparator<User1>{
       public int compare(User1 a,User1 b){
             return a.age.compareTo(b.age);
              }
}
class age_Dsc implements Comparator<User1>{
      public int compare(User1 a,User1 b){
              return b.age.compareTo(a.age);
              }
}
class name_asc implements Comparator<User1>{
     public int compare(User1 a,User1 b){
        return a.name.compareTo(b.name);
              }
}

class name_Dsc implements Comparator<User1>{
      public int compare(User1 a,User1 b){
             return b.name.compareTo(a.name);
              }
}

//  Press 1 for AgeAscsort
//  2 for AgeDscsort 
//  3 for  NameAscsort 
//  4 for NameDscsort   : 3
// TreeSet is : [arju-123, khushi-12, madhu-10, om-176, riya-111]