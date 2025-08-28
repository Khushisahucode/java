//constructor overloading 
//not same outcome or idea

class shape{
int length;
int width;
int height;
shape(int length){
    this.length=length;
     System.out.println(" here is  a Line......");
}

shape(int length,int width){
    this.length=length;
    this.width=width;
     System.out.println(" here is Rectangle ......."); 
}

shape(int length,int width,int height){
    this.length=length;
    this.width=width;
    this.height=height;
    System.out.println(" here is cuboid .....");
}
public static void main(String[] args) {
    shape s1=new shape(5);
    shape s2=new shape(5,8);
    shape s3=new shape(5,67,8);
}


}



