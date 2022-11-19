package model;

public class Ninja {
    private String nome;
    private Jutsu jutsuPrincipal;
    private int chakra;

    public Ninja(String nome, Jutsu jutsuPrincipal) {
        this.chakra = 100;
        this.nome = nome;
        this.jutsuPrincipal = jutsuPrincipal;
    }

    public Jutsu getJutsuPrincipal() {
        return jutsuPrincipal;
    }

    public int getChakra() {
        return chakra;
    }

    public String getNome() {
        return nome;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    public void atacar(Ninja ninjaOponente) {
        setChakra(getChakra() - getJutsuPrincipal().getChakra());
        ninjaOponente.receberGolpe(getJutsuPrincipal().getDano());
    }

    public void receberGolpe(int dano) {
        setChakra(getChakra() - dano);
    }

    @Override
    public String toString() {
        return getNome();
    }
}
