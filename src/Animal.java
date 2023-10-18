public class Animal extends Exercise {
     int ears=2;
    public Animal(){
        System.out.println("Animal is born!!!");
    }

   public Animal(int ears){
       System.out.println("Inside parametrized constructor");
        this.ears=ears;
   }

    public void setEars(int ears){
        this.ears=ears;
    }
    public int getEars(){
        return this.ears;
    }
    public static void hello(){
        System.out.println("Hello from Animal...");
    }

    @Override
    public void walking() {
        System.out.println("I am walking....");
    }
}
