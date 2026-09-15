package src.Associacao;

public class jogador01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pedro");
        Jogador jogador2 = new Jogador("Pedro2");
        Jogador jogador3 = new Jogador("Pedro3");

        Jogador[] jogadores = {jogador1, jogador2 ,jogador3};
        
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }



        Jogador jogador4 = new Jogador("Pedro4");
        Time time = new Time("BR");

        jogador4.setTime(time);

        jogador4.imprime();
    }




}
