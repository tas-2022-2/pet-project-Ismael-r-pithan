package model;

public class Batalha {
    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja) {

        if (primeiroNinja.getNome().equals("Itachi")) {
            return primeiroNinja;
        }

        if (segundoNinja.getNome().equals("Itachi")) {
            return segundoNinja;
        }

        int rodadaDeAtaque = 0;
        while (rodadaDeAtaque < 6) {
            if (rodadaDeAtaque < 3) {
                primeiroNinja.atacar(segundoNinja);
            } else {
                segundoNinja.atacar(primeiroNinja);
            }
            rodadaDeAtaque++;
        }

        if (primeiroNinja.getChakra() == segundoNinja.getChakra()) {
            return primeiroNinja;
        }

        return primeiroNinja.getChakra() > segundoNinja.getChakra() ? primeiroNinja : segundoNinja;
    }
}

/*

Modele uma classe Batalha na qual o único método público deverá ser o lutar que receberá como parâmetro os dois nijas da luta.
Segue exemplo de assinatura do método: public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja).

No método lutar, cada Ninja ataca o seu oponente 3 vezes.

O método lutar deve retornar como Ninja vencedor aquele que possuir o maior chakra ao final da luta.

Se houver empate, o Ninja do primeiro parâmetro deve ser retornado como vencedor.
 */