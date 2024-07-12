package objectiveobjective2;
class Car {
    private int seats;
    private int speed;

    public Car() {
    System.out.print("This Is Car ");
    }
}

class Audi extends Car {
    Audi() {
    	super();
    System.out.print("This Is Audi ");
  //  super();
    }
} 

class Main {
    public static void main(String args[]) {
    Audi a = new Audi();
    }         
}
