package entity;

public class Employee {
	public static String name;
	public static double grossSalary;
	public static double tax;
	
	public static double netSalary() {
		return grossSalary - tax;
	}
	
	public static void increaseSalary( double percentage) {
		grossSalary += grossSalary * percentage/100;
	}
}
