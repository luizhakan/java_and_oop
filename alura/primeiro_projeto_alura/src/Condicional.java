public class Condicional {
    public static void main(String args[]){
        // variável
        int anoDeLancamento = 2022;        // camelCase
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";
        int dia = 3;
        String nomeDia;

        // condicional
        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        // prints
        System.out.printf("O dia %d é %s", dia, nomeDia);
    }
}
