package entities;

public class StudentsNotes {
	
	public String name;
	public double note1, note2, note3;
	
	
	public double totalNotes() {
		return note1+note2+note3;
	}
	
	public boolean finalGrade() {
		if(note1+note2+note3 < 60) {
			return false;
		} else {
			return true;
		}
	}

}
