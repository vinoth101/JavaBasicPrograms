public class wrapper {
    public static void main(String[] args) {
        int a=20;
        Integer i=Integer.valueOf(a); //covert int into object expilicty
        Integer j=a;// auto boxing ,now compile automatically primitive data(variable) type into object
        System.out.println(a+""+j+""+i);
    }

}

//converting  Integer into int.
  //Integer a =new Integer(3);
//int i=a;converting integer to int explicty
//int j=a.int.value(); now compiler will write a.int value()internally