package concrete;

import icomponent.SmartComponent;

public class AirConditioner implements SmartComponent {
    public void turnon() {
        System.out.println("Air Conditioner is now ON");
    }

    public void turnoff() {
        System.out.println("Air Condtioner is now OFF");
    }
}
