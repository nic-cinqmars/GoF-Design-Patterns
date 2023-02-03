package builder;

import builder.builder.Contract;
import builder.builder.ContractBuilder;
import builder.builder.HTMLContractBuilder;
import builder.builder.PDFContractBuilder;
import builder.director.Salesman;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ContractBuilder contractBuilder;
        System.out.print("Do you want to build HTML (1) or PDF (2) contracts? : ");
        String choice = sc.next();
        if (choice.compareTo("1") == 0)
            contractBuilder = new HTMLContractBuilder();
        else
            contractBuilder = new PDFContractBuilder();

        Salesman salesman = new Salesman(contractBuilder);

        Contract contract = salesman.build("Eric");
        contract.print();

        sc.close();
    }
}
