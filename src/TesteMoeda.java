import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();

        System.out.print("Informe o valor em reais: R$");
        moeda.valorReal = leitor.nextDouble();

        System.out.print("Informe a cotação do dólar hoje: $");
        moeda.cotacaoDolar = leitor.nextDouble();

        moeda.calcularConversao();
        System.out.println("$" + moeda.quantidadeDolar= );




    }
}
