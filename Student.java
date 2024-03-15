public class Student
   {
   private String firstName;
   private String lastName;
   private int gradeLevel;
   private double[] grades;
   private double calculatedGPA;
   
   public Student()
      {
      firstName = null;
      lastName = null;
      gradeLevel = 0;
      grades = new double[5];     
      for( int index = 0; index < grades.length; index++ )
         {
         grades[index] = 0.0;    
         } // end for
      calculatedGPA = 0.0;
      } // end zero-argument constructor
      
   public Student( String firstName, String lastName, int gradeLevel, 
                      double english,
                      double math,
                      double science,
                      double fineArts,
                      double socialScience )
      {
      this.firstName = firstName;
      this.lastName = lastName;
      this.gradeLevel = gradeLevel;
      
      grades = new double[5]; 
      grades[0] = english;    
      grades[1] = math;
      grades[2] = science;
      grades[3] = fineArts;
      grades[4] = socialScience;
      
      } // end constructor Student
   
   public String getFirstName()
      {
      return firstName;    
      } // end method getFirstName
      
   public String getLastName()
      {
      return lastName;    
      } // end method getFirstName
   public double calcGPA()   
      {                      
      double calculatedGPA = 0.0;
      
      for( int index = 0; index < grades.length; index++ )
         {
          calculatedGPA += grades[index];
         } // end for
          
      calculatedGPA /= grades.length;
      return calculatedGPA;
      } // end method calcGPA
      
   public int getGradeLevel()
      {
      return gradeLevel;    
      } // end method getGradeLevel
        
   public String toString()
      {
      String currentGrades = new String();
      for( int index = 0; index < grades.length; index++ )
         {
         // currentGrades = currentGrades + grades[index] + " ";
         currentGrades += grades[index] + " ";
         } // end for
      
      return firstName + " " + lastName + ", " +
             "Grade:" + gradeLevel + " " +
             "(" + currentGrades + ")," +
             "GPA is: " + calcGPA();
          
      } // end method toString
       
   } // end class Student