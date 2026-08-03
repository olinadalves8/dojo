package src.introducao.metodosDominio;

public class Calculadora02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //calculadora.multiplicaDoisNumeros(2, 2);
        //double result = calculadora.divideDoisNumeros(20, 2);

        //System.out.println(result);

        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2);

        System.out.println("dentro do teste");
        System.out.println(num1);
        System.out.println(num2);

        int [] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(numeros);

    }

    
}
