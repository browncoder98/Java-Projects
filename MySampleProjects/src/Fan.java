public class Fan {
    public static void main(String[] args) {
        final int SLOW = 1;		// Fan speed slow
        final int MEDIUM = 2;	// Fan speed medium
        final int FAST = 3;		// Fan speed fast

        // Create two Fan objects
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        // Assign maximum speed, radius 10, color yellow,
        // and turn it on to the first object
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();

        // Assign medium speed, radius 5, color blue,
        // and turn it off to the second object
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();

        // Display the objects by invoking their toString method
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    /** Constructor that creates a default fan */
    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    /** Mutator methods */
    /** Sets speed */
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    /** Sets fan on */
    public void turnOn() {
        on = true;
    }

    /** Sets fan off */
    public void turnOff() {
        on = false;
    }

    /** Sets color */
    public void setColor(String newColor) {
        color = newColor;
    }

    /** Sets radius */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    /** Accessor methods */
    /** Return speed */
    public String getSpeed() {
        String s = "";
        switch (speed) {
            case SLOW: s = "SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST";
        }
        return s;
    }

    /** Return on */
    public boolean isOn() {
        return on;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Returns a string description for the fan */
    public String toString() {
        if (on == true) {
            return "\nFan speed: " + getSpeed() + ", color: " + color +
                    ", radius: " + radius + "\n";
        }
        else{
            return "\nFan color: " + color + ", radius: " + radius +
                    "\nFan is off\n";
        }
    }
}
