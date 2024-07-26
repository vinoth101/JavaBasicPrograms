public class student {

            int rollno;
            String name;
            String city;

            student(int rollno, String name, String city){
                this.rollno=rollno;
                this.name=name;
                this.city=city;
            }

            public void mm(){//overriding the toString() method
                System.out.println( rollno+" "+name+" "+city);
            }
            public static void main(String args[]){
                student s1=new student(101,"Raj","lucknow");
                student s2=new student(102,"Vijay","ghaziabad");
                  s2.mm();
               s1.mm();
                //compiler writes here s2.toString()
            }

}
