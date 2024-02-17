package homework1.part3;

public class CourseCreator {

	public static void main(String[] args) {
		Course advSoftwareEng = new Course("CS 5800: Advanced Software Engineering");
		advSoftwareEng.addInstructor("Nima", "Davarpanah", "3-2636");
		advSoftwareEng.addTextbook("Clean Code", "Robert C. Martin", "Pearson");
		
		advSoftwareEng.addInstructor("Yu", "Sun", "8-302");
		advSoftwareEng.addTextbook("Good Book", "Author McAuthorson", "Best Publisher");
		
		advSoftwareEng.print();
	}
}
