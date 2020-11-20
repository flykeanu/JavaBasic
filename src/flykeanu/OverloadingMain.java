package flykeanu;

public class OverloadingMain {
    public static void main(String[] args) {

            ApplyOverloading aol = new ApplyOverloading();
            System.out.println(aol.plus(10,11));
            System.out.println(aol.plus(10,11,13));
            System.out.println(aol.plus(10.1,10.2));



            NonOverloading nol = new NonOverloading();

            System.out.println(nol.AddIntegerTwo(10,11));
            System.out.println(nol.AddIntegerThree(10,11,13));
            System.out.println(nol.AddDoubleTwo(1.1,1.2));


        }

    }


