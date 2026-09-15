package src.Associacao;

public class Escola01 {
    public static void main(String[] args) {
        
        Professor professor = new Professor ("Jiraya");
        Professor[] professores = {professor};
        Escola escola = new Escola("tt",professores);


        escola.imprime();
    }

}
