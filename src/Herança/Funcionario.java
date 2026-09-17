package src.Herança;

public class Funcionario extends Pessoa {
   
    private double salario;

      static {
        System.out.println("dentro static funcionario");
    }

    {
        System.out.println("dentro do no static funcionario");
    }

     {
        System.out.println("dentro do no static 2 funcionario");
    }

   

    public Funcionario(String nome) {
        super(nome);
        System.out.println("dentro do construtor de funcionario");
        
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " +this.nome + " e recebi o salario de " + this.salario);
    }

    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    

    

}
