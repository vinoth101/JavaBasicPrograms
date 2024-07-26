

    class Ae
    {
        Ae foo()
        {
            return this;
        }

        void print()
        {
            System.out.println("Inside the class A1");
        }
    }


    // A2 is the child class of A1
    class At extends Ae
    {
        @Override
        At foo()
        {
            return this;
        }

        void print()
        {
            System.out.println("Inside the class At");
        }
    }

    // A3 is the child class of A2
    class Ay extends At
    {
        @Override
        Ay foo()
        {
            return this;
        }

        @Override
        void print()
        {
            System.out.println("Inside the class Ay");
        }
    }

    public class hire
    {
        // main method
        public static void main(String argvs[])
        {
            Ae a1 = new Ae();

            a1.foo().print();

            At a2 = new At();

            a2.foo().print();

            Ay a3 = new Ay();

            a3.foo().print();

        }
    }