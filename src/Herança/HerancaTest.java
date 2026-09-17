package src.Herança;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Toyota");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda");
        funcionario.setSalario(200);
        funcionario.setCpf("01545");
        funcionario.setEndereco(endereco);


        funcionario.imprime();
        


        
    }

}
