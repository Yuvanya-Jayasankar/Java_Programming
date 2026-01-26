package first;
//USE CASE(3) 20/01/26
 class Carsss {

    private boolean engine;

    private int speed;

    private int fuellevel;
 
    public void setEngine(boolean engine) {

        this.engine = engine;

    }
 
    public void setSpeed(int speed) {

        this.speed = speed;

    }
 
    public void setFuelLevel(int fuellevel) {

        this.fuellevel = fuellevel;

    }
 
    public boolean getEngine() {

        return engine;

    }
 
    public int getSpeed() {

        return speed;

    }
 
    public int getFuelLevel() {

        return fuellevel;

    }  
}

 
public class P3usecase200126 {
	public static void main(String[] args) {

		Carsss c = new Carsss();
 
        c.setEngine(true);

        c.setSpeed(50);

        c.setFuelLevel(70);
 
        System.out.println("Engine status: " + c.getEngine());

        System.out.println("Speed: " + c.getSpeed());

        System.out.println("Fuel Level: " + c.getFuelLevel());

    }


}
