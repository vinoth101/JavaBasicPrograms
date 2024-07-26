public class strictfpkeyword {
    public strictfp void add(double a, double b) {
       System.out.println(a+b);
    }

    public static void main(String[] args) {
        strictfpkeyword example = new strictfpkeyword();
          example.add(1.0, 2.0);

    }
}
