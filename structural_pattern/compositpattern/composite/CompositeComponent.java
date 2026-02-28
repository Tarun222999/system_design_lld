package composite;

import java.util.ArrayList;
import java.util.List;

import icomponent.SmartComponent;

public class CompositeComponent implements SmartComponent {
    private List<SmartComponent> components = new ArrayList<>();

    public void addComponent(SmartComponent component) {
        components.add(component);
    }

    public void removeComponent(SmartComponent component) {
        components.remove(component);
    }

    public void turnon() {
        for (SmartComponent component : components) {
            component.turnon();
        }
    }

    public void turnoff() {
        for (SmartComponent component : components) {
            component.turnoff();
        }
    }
}
