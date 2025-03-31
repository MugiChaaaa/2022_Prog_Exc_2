package kadai3;

import java.io.*;

class Prefecture implements Serializable{
    private String pref;
    private int population;

    Prefecture(String pref, int population) {
        this.pref = pref;
        this.population = population;
    }

    public String toString() {
        return pref + " : " + population;
    }
}