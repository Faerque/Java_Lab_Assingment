package Lab_Static;

public class StaticTest {

    public static void main(String[] args) {

        Static object1 = new Static();
        System.out.println("Static variable value: "+object1.displayStatic());
        System.out.println("Non Static Variable value: "+object1.displayNonStatic()+"\n\n");

        Static object2 = new Static();
        System.out.println("Static variable value: "+object2.displayStatic());
        System.out.println("Non Static Variable value: "+object2.displayNonStatic()+"\n\n");
        Static object3 = new Static();
        System.out.println("Static variable value: "+object3.displayStatic());
        System.out.println("Non Static Variable value: "+object3.displayNonStatic()+"\n\n");

    }
}
