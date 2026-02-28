import adapter.AirConditionerAdapter;
import adapter.SmartLightAdapter;
import concrete.AirConditioner;
import concrete.SmartLight;
import idevice.IDevice;

public class Main {
    public static void main(String[] args) {
        IDevice airConditoner = new AirConditionerAdapter(new AirConditioner());
        IDevice smartLight = new SmartLightAdapter(new SmartLight());

        airConditoner.turnon();
        smartLight.turnon();

        smartLight.turnoff();
        airConditoner.turnoff();
    }
}
