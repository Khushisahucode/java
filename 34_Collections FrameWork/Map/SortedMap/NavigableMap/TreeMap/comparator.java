import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
class comparator {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Press 1 for AgeAscsort\n 2 for AgeDscsort \n 3 for  NameAscsort \n 4 for NameDscsort   : ");
        int val =sc.nextInt();  sc.close();
       Comparator<User> com=null;
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
        TreeMap<User,Double>x=new TreeMap<User,Double>(com);
        x.put(new User("khushi", 12), 12.56);
        x.put(new User("om", 10), 112.56);
        x.put(new User("riya", 18), 186.56);
        x.put(new User("madhu", 23), 136.6);
        x.put(new User("bhoomi", 45), 120.56);
        x.put(new User("ashvi", 62), 132.56);
          System.out.println("TreeMap is : "+ x);
 }} 

class age_asc implements Comparator<User>{
       public int compare(User a,User b){
             return a.age.compareTo(b.age);
              }
}
class age_Dsc implements Comparator<User>{
      public int compare(User a,User b){
              return b.age.compareTo(a.age);
              }
}
class name_asc implements Comparator<User>{
     public int compare(User a,User b){
        return a.name.compareTo(b.name);
              }
}

class name_Dsc implements Comparator<User>{
      public int compare(User a,User b){
             return b.name.compareTo(a.name);
              }
}
//  Press 1 for AgeAscsort
//  2 for AgeDscsort 
//  3 for  NameAscsort 
//  4 for NameDscsort   : 4
// TreeMap is : {riya-18=186.56, om-10=112.56, madhu-23=136.6, khushi-12=12.56, bhoomi-45=120.56, ashvi-62=132.56}

//  Press 1 for AgeAscsort
//  2 for AgeDscsort
//  3 for  NameAscsort
//  4 for NameDscsort   : 3
// TreeMap is : {ashvi-62=132.56, bhoomi-45=120.56, khushi-12=12.56, madhu-23=136.6, om-10=112.56, riya-18=186.56}

//  Press 1 for AgeAscsort
//  2 for AgeDscsort
//  3 for  NameAscsort
//  4 for NameDscsort   : 2
// TreeMap is : {ashvi-62=132.56, bhoomi-45=120.56, madhu-23=136.6, riya-18=186.56, khushi-12=12.56, om-10=112.56}

//  Press 1 for AgeAscsort
//  2 for AgeDscsort
//  3 for  NameAscsort
//  4 for NameDscsort   : 1
// TreeMap is : {om-10=112.56, khushi-12=12.56, riya-18=186.56, madhu-23=136.6, bhoomi-45=120.56, ashvi-62=132.56}
 