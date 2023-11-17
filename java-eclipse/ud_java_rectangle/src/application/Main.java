package application;

import java.util.Scanner;

import entity.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		System.out.printf("AREA = %.2f\n",rec.area());
		System.out.printf("PERIMETER = %.2f\n",rec.perimeter());
		System.out.printf("DIAGONAL = %.2f\n",rec.diagonal());
		
		sc.close();
	}

}
