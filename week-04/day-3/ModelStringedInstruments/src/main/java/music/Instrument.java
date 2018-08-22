package main.java.music;

abstract public class Instrument {

    protected String instrumentName;

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    abstract public void play();


}
