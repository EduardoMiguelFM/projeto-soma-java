import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        Moeda moeda = new Moeda();

        String nome, cpf;
        System.out.println("Informe o cpf do cliente: ");
        cpf = leitorTexto.nextLine();
        System.out.println("Informe o nome do cliente: ");
        nome = leitorTexto.nextLine();

        System.out.print("Informe o valor em reais: R$");
        moeda.valorReal = leitor.nextDouble();

        System.out.print("Informe a cotação do dólar hoje: $");
        moeda.cotacaoDolar = leitor.nextDouble();


        moeda.calcularConversao();
        System.out.println("$" + moeda.quantidadeDolar);
        System.out.println(moeda.comprarDolar("46609383871", "Eduardo Miguel"));
        System.out.println(moeda.comprarDolar(cpf,nome));



    }
}
