import java.util.Scanner;
import com.google.gson.JsonObject;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] moedas = {"USD", "EUR", "GBP", "JPY", "CAD", "ARS", "BRL"};
        boolean continuar = true;

        System.out.println("*****************************");
        System.out.println("*  Bem-vindo ao Conversor  *");
        System.out.println("*     de Moedas Online     *");
        System.out.println("*****************************");

        while (continuar) {
            System.out.println("\n*****************************");
            System.out.println("*      Nova Conversão       *");
            System.out.println("*****************************");

            // Escolher moeda de origem
            System.out.println("Escolha a moeda de ORIGEM:");
            for (int i = 0; i < moedas.length; i++) {
                System.out.printf("%d - %s%n", i + 1, moedas[i]);
            }
            int origemIndex = scanner.nextInt();
            if (origemIndex < 1 || origemIndex > moedas.length) {
                System.out.println("Opção inválida.");
                continue;
            }
            String moedaOrigem = moedas[origemIndex - 1];

            // Escolher moeda de destino
            System.out.println("Escolha a moeda de DESTINO:");
            for (int i = 0; i < moedas.length; i++) {
                System.out.printf("%d - %s%n", i + 1, moedas[i]);
            }
            int destinoIndex = scanner.nextInt();
            if (destinoIndex < 1 || destinoIndex > moedas.length) {
                System.out.println("Opção inválida.");
                continue;
            }
            String moedaDestino = moedas[destinoIndex - 1];

            // Entrada do valor
            System.out.printf("Digite o valor em %s: ", moedaOrigem);
            double valor = scanner.nextDouble();

            try {
                JsonObject rates = ExchangeRateService.getRates(moedaOrigem);

                if (!rates.has(moedaDestino)) {
                    System.out.println("Moeda de destino não encontrada na resposta da API.");
                    continue;
                }

                double taxa = rates.get(moedaDestino).getAsDouble();
                double convertido = valor * taxa;

                System.out.println("\n*****************************");
                System.out.println("*       Resultado:          *");
                System.out.println("*****************************");
                System.out.printf("* %.2f %s = %.2f %s%n", valor, moedaOrigem, convertido, moedaDestino);
                System.out.println("*****************************");

            } catch (Exception e) {
                System.out.println("Erro ao acessar a API: " + e.getMessage());
            }

            // Perguntar se deseja continuar
            System.out.print("\nDeseja fazer outra conversão? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
                System.out.println("\n*****************************");
                System.out.println("*  Obrigado por usar! Até!  *");
                System.out.println("*****************************");
            }
        }

        scanner.close();
    }
}
