public class VariaveisEPrimitivos {
    public static void main(String[] args){
        byte inteiro1 = 10;
        short inteiro2 = 20;  // suporta até 2 bytes
        int inteiro3 = 30;
        long inteiro4 = 40;  // suporta 8 bytes

        int numero = 4;
        int outroNumeroIgual = numero;
        numero = numero + 5;

        System.out.println(numero);
        System.out.println(outroNumeroIgual);

        String luiz = "Eu sou o Luiz!";
        System.out.println(luiz);

        double livroJava8 = 59.90;
        int numeroInteiro = (int) livroJava8; // no javascript é chamado de coerção de tipo, em java é chamada de casting
        double livroTDD = 59.90;
        double soma = livroJava8 + livroTDD;
        boolean resultadoBaixo = soma < 150;
        boolean resultadoAlto = soma >= 2000;

        System.out.println("O total em estoque é: R$"+ soma);

        if (resultadoBaixo){
            System.out.println("O estoque está baixo!");
        } else if (resultadoAlto){
            System.out.println("O estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está ok!");
        }
    }
}