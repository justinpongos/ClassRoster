import java.util.ArrayList;
public class ClassRoster {
	private String courseName;
	private ArrayList<Student> studentList;

public ClassRoster(String courseName , ArrayList<Student> studentList) {
	this.courseName = courseName;
	this.studentList = studentList;
	}//end two argument constructor
	
public String studentWithMaxGPA() {
	String x = " ";
		for (int index = 0; index < studentList.size(); index++) {
			for (int indexx = 0; indexx < studentList.size(); indexx++) {
			if (studentList.get(index).calcGPA() < studentList.get(indexx).calcGPA()) {
				x = studentList.get(indexx).getLastName();
				return x;
			}//end if
			if (studentList.get(index).calcGPA() > studentList.get(indexx).calcGPA()) {
				x = studentList.get(index).getLastName();
				}//end if 2
			}//end for 2
		}//end for 1
		return x;
}//end studentWithMaxGPA method
	
public int dropStudent( double minGPA ) {
	int count = 0;
	for (int index = 0; index < studentList.size(); index++ ) {
		if (studentList.get(index).calcGPA() < minGPA) {
			studentList.remove(studentList.get(index));
			index--;
			count++;
		}//end if
	}//end for
	return count;
}//end dropStudent method
	
public void addStudent (Student newStudent) {
	studentList.add(newStudent);
}//end addStudent

public String toString() {
	String output = " ";
	output += courseName + "Roster: \n";
		for (int index = 0; index < studentList.size(); index++) {
			output += " Student " + (index + 1) + ": " + studentList.get(index) + "\n" + "\n";
		}//end for
		return output;
}//end toString
}//end class
