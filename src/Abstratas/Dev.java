package src.Abstratas;

public class Dev extends Funcionario {

    public Dev(String nome, double salario) {
        super(nome, salario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

}
