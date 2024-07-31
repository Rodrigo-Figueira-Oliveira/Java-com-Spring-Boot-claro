public class MyClass {
    public static void main(String[] args) throws Exception {
        String firstName = "Rodrigo";
        String secondName = "Oliveira";
        String nomeCompleto = nomeCompleto(firstName, secondName);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String firstName, String secondName) {
        return "Resultado do método é: " + firstName.concat(" ").concat(secondName);
    }
}
