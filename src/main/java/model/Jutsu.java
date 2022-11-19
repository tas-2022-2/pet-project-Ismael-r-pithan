package model;

public class Jutsu {
    private int chakra;
    private int dano;

    public Jutsu(int chakra, int dano) {
        if (chakra <= 5) {
            this.chakra = chakra;
        }
        if (dano <= 10) {
            this.dano = dano;
        }
    }

    public int getDano() {
        return dano;
    }

    public int getChakra() {
        return chakra;
    }
}
