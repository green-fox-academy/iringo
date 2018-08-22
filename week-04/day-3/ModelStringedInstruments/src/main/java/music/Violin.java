package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        setInstrumentName("Violin");
        setNumberOfStrings(4);
    }

    public Violin(int numberOfStrings) {
        setInstrumentName("Violin");
        setNumberOfStrings(numberOfStrings);
    }

    @Override
    public void sound() {
        System.out.print("Screech");
    }

}
