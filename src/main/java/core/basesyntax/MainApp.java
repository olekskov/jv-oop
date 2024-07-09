package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();

        Machine[] arrayMachine = {bulldozer, excavator, truck};
        for (int i = 0; i < arrayMachine.length; i++) {
            arrayMachine[i].doWork();
            arrayMachine[i].stopWork();
        }
    }
}
