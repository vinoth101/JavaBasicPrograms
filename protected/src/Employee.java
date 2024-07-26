
class Address{
    String houseNumber;
    String street;
    String city;
    public Address(String houseNumber, String street, String city) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        System.out.println("lalala"+houseNumber+""+street+""+city);
    }


    @Override
    public String toString() {
        return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + "]";
    }

}


public class Employee{
    String name;
    Integer id;
    Address address;

    public Employee(String name, Integer id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }


    public static void main(String[] args) {
        Address a1 = new Address("1", "First street", "Street");
        Employee e1  = new Employee("Vinoth", 1, a1 );
        System.out.println();
        System.out.println(e1);
        method1(e1);
        System.out.println(e1);
    }
    public static void method1(Employee e){
         System.out.println("\n"+e.name + " " +e.id+ " "+e.address);
        e.name = "Pushparaj";
    }


}

