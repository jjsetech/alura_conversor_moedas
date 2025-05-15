import model.ConversionType;
import service.ExchangeRateService;
import util.InputUtil;

public class Main {
    public static void main(String[] args) {
        ExchangeRateService exchangeService = new ExchangeRateService();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Seja Bem-Vindo(a) ao Conversor de Moedas ===");
            ConversionType.listOptions();
            System.out.println("0 - Sair");

            int option = InputUtil.readInt("Escolha uma opção: ", 0, ConversionType.values().length);

            if (option == 0) {
                running = false;
                System.out.println("Obrigado por utilizar nossos serviços. Encerrando...");
                continue;
            }

            ConversionType selectedConversion = ConversionType.fromOption(option);
            double amount = InputUtil.readDouble("Digite o valor em " + selectedConversion.getFromCurrency() + ": ");

            try {
                double converted = exchangeService.convertCurrency(
                        selectedConversion.getFromCurrency(),
                        selectedConversion.getToCurrency(),
                        amount
                );
                System.out.printf("Resultado da Conversão: %.2f %s equivale a %.2f %s%n",
                        amount,
                        selectedConversion.getFromCurrency(),
                        converted,
                        selectedConversion.getToCurrency()
                );
            } catch (Exception e) {
                System.out.println("Erro ao realizar conversão: " + e.getMessage());
            }
        }
    }
}