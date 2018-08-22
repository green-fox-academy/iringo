package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        setInstrumentName("Electric Guitar");
        setNumberOfStrings(6);
    }

    public ElectricGuitar(int numberOfStrings) {
        setInstrumentName("Electric Guitar");
        setNumberOfStrings(numberOfStrings);
    }

    @Override
    public void sound() {
        System.out.print("Twang");
    }

}
