class name{
     private String name;
     private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        name n=new name();
        n.setAge(21);
        n.setName("vino");
        System.out.println("age\n"+n.getAge());
        System.out.println("name\n"+n.getName());
    }
}
