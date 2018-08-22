package main.java.music;

abstract public class StringedInstrument extends Instrument {

    private int numberOfStrings;

    abstract public void sound();

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.print(getInstrumentName() + ", " + "a " + numberOfStrings + " stringed instrument that goes ");
        sound();
        System.out.println();
    }

}
