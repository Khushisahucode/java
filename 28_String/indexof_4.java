class indexof_4{

    public static void main(String[]args){
String str="internationalisation";
int index= str.indexOf('i');
while(index!=-1){
  System.out.println( index++);
  index=str.indexOf('i',index);
    }
 }
}
// 0
// 8
// 13
// 17