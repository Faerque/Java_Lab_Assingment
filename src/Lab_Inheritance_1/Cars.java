package Lab_Inheritance_1;

public class Cars {

   static class Car {
        void wheel(){
            System.out.println("Car has four wheel...");
        }
    }
   static class Ford extends Car{
        void color(){
            System.out.println("Blue Ford Mostang is beautiful car");
        }
    }

    static class Toyota extends Ford{
        void various(){
            System.out.println("Toyota has various car");
        }
    }


}
