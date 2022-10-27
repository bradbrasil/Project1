import java.io.IOException;
import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite o código do Produto: ");
        int cod1 = leitor.nextInt();
        System.out.println("Digite a quantidade do Produto: ");
        int n1 = leitor.nextInt();
        System.out.println("Digite o valor do Produto: ");
        Double valor1 = leitor.nextDouble();

        System.out.println("Digite o código do do Produto: ");
        int cod2 = leitor.nextInt();
        System.out.println("Digite a quantidade do Produto: ");
        int n2 = leitor.nextInt();
        System.out.println("Digite o valor do Produto: ");
        Double valor2 = leitor.nextDouble();


        Double total = (valor1 * n1) + (valor2 * n2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f  ", total));

    }

}
