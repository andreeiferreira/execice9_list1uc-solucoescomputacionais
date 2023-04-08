import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperaturaFahrenheit, temperaturaCelsius;

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        temperaturaFahrenheit = scanner.nextDouble();

        temperaturaCelsius = 5 * ((temperaturaFahrenheit - 32) / 9);

        System.out.printf("A temperatura em graus Celsius é %.2f", temperaturaCelsius);
    }
}
