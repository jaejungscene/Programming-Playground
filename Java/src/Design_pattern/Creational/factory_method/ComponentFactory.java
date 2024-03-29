package Design_pattern.Creational.factory_method;

public class ComponentFactory {
    public Component getComp (Usage usage) {
        if (usage == Usage.PRESS) {
            return new Button();
        } else if (usage == Usage.TOGGLE) {
            return new Switch();
        } else {
            return new Dropdown();
        }
    }
}
