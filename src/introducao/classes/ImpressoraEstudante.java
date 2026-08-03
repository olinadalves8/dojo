package src.introducao.classes;

public class ImpressoraEstudante {
    public static void imprime(Estudante estudante) {

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        estudante.nome = "texugo";

    }

}
