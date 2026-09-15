package src.Associacao;

public class jogador02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("CAFU");
        Time time = new Time("Suiça");
        Jogador[] jogadores = { jogador };

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("------------------ jogador------------------");

        jogador.imprime();

        System.out.println("------------------ time------------------");

        time.imprime();

    }

}
