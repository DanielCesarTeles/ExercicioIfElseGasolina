import java.util.Scanner;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 20:12
 * @category View
 */
public class Principal {

    public static void main(String args[]) {

        System.out.print("\f");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de combustivel desejado");
        String tipoCombustivel = scanner.nextLine();
        System.out.print("Digite a quantidade de litros");
        double litros = scanner.nextDouble();

        Combustivel combustivel = new Combustivel(litros, tipoCombustivel);

        System.out.print(combustivel);
    }
}