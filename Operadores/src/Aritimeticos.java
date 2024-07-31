/*Aritméticos
O operador aritmético é utilizado para realizar operações matemáticas entre valores numéricos, 
podendo se tornar ou não uma expressão mais complexa.
Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
Quando usada a adição em strings ele concatena as mesmas*/

public class Aritimeticos {
    public static void main(String[] args) throws Exception {
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (multiplicacao * divisao) + (soma / subtração);

        // classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        concatenacao = 1 + "1" + 1 + 1;
        concatenacao = 1 + "1" + 1 + "1";
        concatenacao = "1" + 1 + 1 + 1;
        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(soma);
        System.out.println(subtração);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);
        System.out.println(nomeCompleto);
        System.out.println(concatenacao);
    }
}
