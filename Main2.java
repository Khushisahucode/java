
    class employee{
        private int salary;
        private String name;
        private String id;
      void getdetails(String name,int salary,String id){//getter function
          this.name=name;
          this.salary=salary;
          this.id=id;
      }
      void setdetails(){   //setter function
          System.out.println("employee marks = "+salary);
          System.out.println("employee name = "+name);
          System.out.println("employee id = "+id);
           }}
      class Main2{
      public static void main(String[] args) {
          employee x=new employee();
          x.getdetails("khushi sahu ",650000,"24458");
          x.setdetails();
      }
      }

    //   employee marks = 650000
    //   employee name = khushi sahu
    //   employee id = 24458