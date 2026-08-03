package src.introducao.classes;

public class PessoaT {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        
        pessoa.SetNome("Da");
        pessoa.setIdade(5);
        pessoa.imprime();

        System.out.println("-------------------------------------------------");

        System.out.println(pessoa.getNome()+ pessoa.getIdade());
        
    }

    

}
