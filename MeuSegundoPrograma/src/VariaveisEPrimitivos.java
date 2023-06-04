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

        // looping
        double somaA = 0;
        int contador = 0;
        boolean resultadoBaixo = somaA < 150;
        boolean resultadoAlto = somaA >= 2000;

        for (int i = 0; i < 35; i++){
            double valorDoLivro = 59.90;
            somaA+= valorDoLivro;
        }

//        while (contador < 35) {
//            double valorDoLivro = 59.90;
//            somaA += valorDoLivro;
//            contador++;
////            System.out.println("Loop");
//        }

        System.out.println("O total em estoque é: R$"+ somaA);

        if (resultadoBaixo){
            System.out.println("O estoque está baixo!");
        } else if (resultadoAlto){
            System.out.println("O estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está ok!");
        }
        for(int i = 0; i <= 10; i++){
            if (i == 7)
                continue;
            System.out.println(i);
        }

        System.out.println("\nOutro loop abaixo\n");

        for(int i = 0; i <= 10; i++){
            if (i == 7)
                break;
            System.out.println(i);
        }
    }
}