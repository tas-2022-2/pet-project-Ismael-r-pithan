import org.junit.Assert;
import org.junit.Test;

import model.Batalha;
import model.Jutsu;
import model.Ninja;

public class BatalhaTest {

    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra() {
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 8);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaUm, ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Gaara", jutsuNinjaOponente);

        int nivelChakraEsperado = 90;

        ninjaAtacante.atacar(ninjaOponente);

        Assert.assertEquals(nivelChakraEsperado, ninjaOponente.getChakra());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Itachi", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Madara", jutsuNinjaOponente);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaAtacante, ninjaOponente);

        Assert.assertEquals(ninjaVencedor, ninjaAtacante);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Tobi", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Itachi", jutsuNinjaOponente);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaAtacante, ninjaOponente);

        Assert.assertEquals(ninjaVencedor, ninjaOponente);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(4, 5);
        Ninja ninjaAtacante = new Ninja("Sakura", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(4, 5);
        Ninja ninjaOponente = new Ninja("Hinata", jutsuNinjaOponente);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaAtacante, ninjaOponente);

        Assert.assertEquals(ninjaVencedor, ninjaAtacante);
    }
}
