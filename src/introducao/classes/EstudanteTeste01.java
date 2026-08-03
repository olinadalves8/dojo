package src.introducao.classes;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        //ImpressoraEstudante impressa = new ImpressoraEstudante();
        

        estudante.nome = "Luffy";
        estudante.idade = 25;
        estudante.sexo = 'M';

        estudante02.nome = "chibiu";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

       /*  impressa.imprime(estudante);
        impressa.imprime(estudante02);

        System.out.println("------------------------");

        impressa.imprime(estudante);
        impressa.imprime(estudante02);*/

        estudante.imprime();
        estudante02.imprime();






    }
}
