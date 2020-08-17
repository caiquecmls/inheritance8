/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class Program {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char opcoes = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();
            if (opcoes == 'i') {
                System.out.print("Health expenditures: ");
                double gastoSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
            } else {
                System.out.print("Number of employees: ");
                int numeroFuncionario = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionario));
            }
        }
        System.out.println("");
        System.out.println("TAXES PAID: ");
        double soma = 0.0;
        for (Pessoa elemento : list) {
            System.out.println(elemento.getNome() + ": $" + String.format("%.2f", elemento.calculoImposto()));
            soma += elemento.calculoImposto();
            System.out.printf("TOTAL TAXES: $ %.2f", soma);

        }
    }
}
