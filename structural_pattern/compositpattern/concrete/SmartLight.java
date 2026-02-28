package concrete;

import icomponent.SmartComponent;

public class SmartLight implements SmartComponent {
    public void turnon() {
        System.out.println("SmartLight is now ON");
    }

    public void turnoff() {
        System.out.println("SmartLight is now OFF");
    }
}
