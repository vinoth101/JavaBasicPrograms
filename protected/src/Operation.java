public class Operation implements circle{
    public void area(){
        double pi=3.14,area;
        area=pi*radius*radius;
        System.out.println("Area of circle"+area);
    }

    public static void main(String[] args) {
        Operation n=new Operation();
        n.area();
    }
}
