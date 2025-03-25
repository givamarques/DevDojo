import java.util.Scanner;

public class Porcentagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salario: ");

        double salarioBruto = scanner.nextDouble();
        //ao declarar double pode-se usar 0.20D e float 0.20F

        System.out.println("Salario bruto: R$" + salarioBruto);

        scanner.close();

        double salarioLiquido = salarioBruto * 0.18;

        double resto = salarioBruto - salarioLiquido;

        System.out.println("18% do salario bruto equivale a: R$" + salarioLiquido + "\nrestando: R$" + resto);
    }
}
