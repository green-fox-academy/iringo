package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        setInstrumentName("Bass Guitar");
        setNumberOfStrings(4);
    }

    public BassGuitar(int numberOfStrings) {
        setInstrumentName("Bass Guitar");
        setNumberOfStrings(numberOfStrings);
    }

    @Override
    public void sound() {
        System.out.print("Duum-duum-duum");
    }

}
