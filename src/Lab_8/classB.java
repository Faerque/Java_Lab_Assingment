package Lab_8;

public class classB {

    public static void main(String[] args) {

        System.out.println("Before creating object " +classA.show());

        classA myClass1 = new classA();
        classA myClass2 = new classA();
        classA myClass3 = new classA();
        System.out.println("After creating object " +classA.show());

    }

}
