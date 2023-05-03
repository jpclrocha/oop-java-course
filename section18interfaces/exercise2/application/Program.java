package section18interfaces.exercise2.application;

import section18interfaces.exercise2.model.entities.Contract;
import section18interfaces.exercise2.model.entities.Installment;
import section18interfaces.exercise2.model.services.ContractService;
import section18interfaces.exercise2.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");

        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), dtf);

        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();
        sc.nextLine();


        Contract contract = new Contract(number, date, value);

        System.out.print("Entre com o numero de parcelas: ");
        int intallmentNumber = sc.nextInt();
        sc.nextLine();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, intallmentNumber);
        
        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstallment()) {
            System.out.println(installment.toString());
        }

        sc.close();
    }
}
