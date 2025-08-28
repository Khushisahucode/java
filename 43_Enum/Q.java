enum coffemugsize{
    large(200,12),medium(500,45),small(700,87);
    private int size;
     private int label;
    coffemugsize(int size ,int label){
      this.size=size;
      this.label=label;
    }
    int getsize(){
        return size;
    }
    // public String toString(){
    //     return this+ "...."+ size;
    // }
    public String toStringify(){
         return this + "......"+ size;
    }
    public int getlabel(){
        return label;
    }
}
class Q{
    public static void main(String[] args) {
        coffemugsize x=coffemugsize.small;
        System.out.println(x);
        System.out.println(x.getsize());
        System.out.println(x.toStringify());
        System.out.println(x.getlabel());
    }
}
// small
// 700
// small......700
// 87