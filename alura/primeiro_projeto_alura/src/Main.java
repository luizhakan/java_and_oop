public class Main {
    public static void main(String[] args) {
        /*
        * Operadores aritméticos:
        * "+" - adição
        * "-" - subtração
        * "*" - multiplicação
        * "/" - divisão
        * "%" - resto de divisão
        *
        * Operadores relacionais:
        * "==" - igual a
        * "!=" - diferente de
        * ">"  - maior que
        * ">=" - maior ou igual a
        * "<"  - menor que
        * "<=" - menor ou igual a
        *
        * Operadores lógicos:
        * "&&" - e
        * "||" - ou
        * "!"  - não
        *
        * Convenções -
        * Nomes de classe     = PascalCase
        * Nomes de métodos    = camelCase
        * Nomes de constantes = CONSTANTE_MAIUSCULA_SEPARADA_POR_UNDERLINE
        * Nome de variáveis   = camelCase
        *
        * Java possui 8 tipos primitivos: boolean, byte, char, short, int, long, float e double
        * boolean - valores lógicos
        * byte   - valores inteiros de 8 bits. Entre -128 a 127
        * char   - um único caracter
        * short  - inteiros de 16 bits. de -32.768 a 32.767
        * int    - inteiros de 32 bits. de -2.147.483.648 a 2.147.483.647
        * long   - numeros de 64 bits.  de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        * flot   - numeros com casas decimais. tem 32 bits. tem precisão limitada
        * double - similar ao float, mas com 64 bits
        *
        * Formatação de textos:
        *
        * %s - string
        * %d - inteiro
        * %f - floats
        * */

        // variáveis
        int anoDeLancamento = 2022;        // camelCase
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        String sinopse;
        sinopse = "Filme de aventura com Tom Cruise";
        String senha = "123456";
        int classificacao = (int) (media / 2); // casting (coerção de tipo em javascript)
        double temperaturaCelsius = 26;
        double farenheit = (temperaturaCelsius * 1.8) + 32;

        // prints
        System.out.println("Esse é o Screen Match!\n");
        System.out.printf("Filme: Top Gun: Maverick\n");
        System.out.printf("Ano de lançamento: %d\n", anoDeLancamento);
        System.out.printf("A média é: %.2f\n", media);
        System.out.println(sinopse);
        System.out.println(classificacao);
        System.out.printf("Temperatura inteira em farenheit: %.2f\n", farenheit);

        // condições
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}