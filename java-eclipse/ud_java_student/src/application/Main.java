package application;

import java.util.Locale;
import java.util.Scanner;

import entities.StudentsNotes;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		StudentsNotes notes = new StudentsNotes();
		
		System.out.print("Enter student name: ");
		notes.name = sc.next();
		System.out.print("Enter note first bimester: ");
		notes.note1 = sc.nextDouble();
		System.out.print("Enter note second bimester: ");
		notes.note2 = sc.nextDouble();
		System.out.print("Enter note third bimester: ");
		notes.note3 = sc.nextDouble();
		System.out.println();
		System.out.printf("Final Grade: %.2f\n",notes.totalNotes());
		
		if(notes.finalGrade() == true) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			double missing = 60 - notes.totalNotes();
			System.out.printf("MISSING %.2f POINTS",missing);
		}
		
		sc.close();
	}

}
