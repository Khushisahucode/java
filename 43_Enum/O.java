enum coffemugsize{
    large(200),medium(500),small(700);
    private int size;
    coffemugsize(int size ){
      this.size=size;
    }
    int getsize(){
        return size;
    }
}
class O{
    public static void main(String[] args) {
        coffemugsize x=coffemugsize.small;
        System.out.println(x);
        System.out.println(x.getsize());
    }
}