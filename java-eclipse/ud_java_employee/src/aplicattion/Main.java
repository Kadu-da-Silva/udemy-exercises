package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entity.Employee;

//Ex-01 -> 
/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
 */
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		Employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		Employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		Employee.tax = sc.nextDouble();
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f\n",Employee.name,Employee.netSalary());
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		Employee.increaseSalary(percentage);
		System.out.printf("Update data: %s, %.2f", Employee.name,Employee.netSalary());
		
		sc.close();
	}

}
