import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double tempF, tempC;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        tempF = sc.nextDouble();
        sc.close();

        tempC = 5 * ((tempF - 32)/9);

        System.out.format("A temperatura em Celsius é de: %.2f " , tempC);

    }
}
