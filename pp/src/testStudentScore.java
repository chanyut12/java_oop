public class testStudentScore {
    public static void main(String[] args) { 
   
        StudentScore std1 = new StudentScore("Somchai", 30.5, 50.2); 
          
        StudentScore std2 = new StudentScore("Joy", 80.8, 85.2); 
          
        System.out.println("name : " + std1.getName() + " midterm score : " + 
            std1.getMidtermScore() + " final score : " + 
            std1.getFinalScore() + " average : " + 
            std1.averageScore() + " grade : " + 
            std1.grading()); 
          
        System.out.println("name : " + std2.getName() + " midterm score : " + 
           std2.getMidtermScore() + " final score : " + 
           std2.getFinalScore() + " average : " + 
           std2.averageScore() + " grade : " + 
           std2.grading());
    }
}
