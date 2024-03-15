import java.util.ArrayList;
public class ClassRosterDriver {
	public static void main(String[]args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
			studentList.add(new Student("Justin", "Pongos", 12, 4.0, 4.0, 4.0, 4.0, 3.0));
			studentList.add(new Student("Noe", "Martinez", 12, 2.0, 4.0, 3.5, 2.0, 2.0));
			studentList.add(new Student("Jeansley", "Baptiste", 12, 2.2, 2.7, 4.0, 4.0, 3.5));
			studentList.add(new Student("Johnny", "Castro", 12, 4.0, 4.0, 4.0, 4.0, 4.0));
			studentList.add(new Student("Matthew", "Talamantes", 12, 2.0, 3.0, 3.6, 4.0, 2.5));
			
		ClassRoster period4 = new ClassRoster("AP Spanish Lang & Culture" , studentList);
		System.out.println(period4);
		System.out.println("The Student with the highest GPA had the last name " + period4.studentWithMaxGPA());
		period4.dropStudent(3.75);
		System.out.println("\n" + period4);
	
	}//end main
}//end class
