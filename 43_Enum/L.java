
enum Day3{
 sunday,monday,tuesday,wednesday,thursday,friday,saturday,
} 
   class L{
public static void main(String[]args){
    Day3 [] all=Day3.values();
    for(Day3 next:all){
        System.out.println(next);
    }
       }
    }
// sunsunday
// monday
// tuesday
// wednesday
// thursday
// friday
// saturday