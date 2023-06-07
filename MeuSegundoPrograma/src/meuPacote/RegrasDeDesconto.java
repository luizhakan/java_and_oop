package meuPacote;
public class RegrasDeDesconto {
    public static void main(String[] args){
      Livro livro = new Livro();
      livro.valor = 59.90;

      System.out.printf("Valor atual: %s", livro.valor);

      if (!livro.aplicaDescontoDe(0.1)){
        System.out.println("\nDesconto não pode ser maior do que 30%");
      } else {
          System.out.printf("\nValor com desconto: R$%.2f", livro.valor);
      }
    };
}
