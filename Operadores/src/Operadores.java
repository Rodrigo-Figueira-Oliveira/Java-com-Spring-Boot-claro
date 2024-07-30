/*O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.
 em Java definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição.
  Exemplos abaixo:*/

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        // classe Operadores.java

        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();
        System.out.println(dataNascimento);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(sexo);
        System.out.println(doadorOrgao);
        System.out.println(dataNascimento);
    }
}