// Abstract Factory interface
interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete factories for Windows and macOS
class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacOSFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

// Abstract product classes
interface Button {
    void render();
}

interface Checkbox {
    void render();
}

// Concrete product classes for Windows
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a Windows button");
    }
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Render a Windows checkbox");
    }
}

// Concrete product classes for macOS
class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a macOS button");
    }
}

class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Render a macOS checkbox");
    }
}

public class AbstractFactoryExample {
    public static void main(String[] args) {
        // Create a UI factory for Windows
        UIFactory windowsFactory = new WindowsFactory();

        // Create UI components for Windows
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        windowsButton.render();
        windowsCheckbox.render();

        // Create a UI factory for macOS
        UIFactory macosFactory = new MacOSFactory();

        // Create UI components for macOS
        Button macosButton = macosFactory.createButton();
        Checkbox macosCheckbox = macosFactory.createCheckbox();

        macosButton.render();
        macosCheckbox.render();
    }
}
