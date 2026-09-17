package src.Herança;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("dentro static");
    }

    {
        System.out.println("dentro do no static");
    }

     {
        System.out.println("dentro do no static 2");
    }

    public Pessoa (String nome) {
        this.nome = nome;
        System.out.println("Construtor pessoa");
    }

    public Pessoa (String nome, String cpf){
        this(nome);
        this.cpf = cpf;

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
