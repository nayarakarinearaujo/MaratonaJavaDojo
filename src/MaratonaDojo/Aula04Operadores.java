package MaratonaDojo;

public class Aula04Operadores {

    public static void main(String[] args) {
        //Operadores básicos:
        // + Soma
        // - Subtração
        // / Divisão
        // * Multiplicação

        int numero1= 10;
        int numero2= 20;
        double resultado = numero1 / (double) numero2;
        System.out.println(resultado);


        //Operador de resto %

        int resto = 20 % 7;
        System.out.println(resto);


        //Operadores relacionais(sempre vão retorar valor booleano)
        // > : Utilizado quando desejamos verificar se uma variável é maior que outra.
        // >= : Utilizado quando desejamos verificar se uma variável é maior ou igual a outra
        // < : Utilizado quando desejamos verificar se uma variável é menor que outra.
        // <= : Utilizado quando desejamos verificar se uma variável é menor ou igual a outra.


        //Operadores de igualdade
        // == :Utilizado quando desejamos verificar se uma variável é igual a outra.
        //!= : Utilizado quando desejamos verificar se uma variável é diferente de outra.


        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("Dez é maior que vinte " + isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte " + isDezMenorQueVinte);
        System.out.println("Dez é igual a vinte " + isDezIgualVinte);
        System.out.println("Dez é igual a Dez " + isDezIgualDez);
        System.out.println("Dez é diferente de Dez " + isDezDiferenteDez);


        //Operadores lógicos
        // (AND) && : Utilizado quando desejamos que as duas expressões sejam verdadeiras.
        // (OR) || : Utilizado quando precisamos que pelo meno um das expressões seja verdadeira, assim o restante será verdadeiro.

        double valorTotalContaCorente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 500f;

        boolean isPlayStationCincoCompravel = valorTotalContaCorente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("PlayStation cinco Comprável " + isPlayStationCincoCompravel);


        //Operadores de incremento e decremento
        //++ incrementa
        // -- decrementa


    }
}
