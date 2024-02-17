package homework1.part3;

import java.util.ArrayList;

public class Course {

	private String name;
	private ArrayList<Instructor> instructors;
	private ArrayList<Textbook> textbooks;
	
	public Course(String name) {
		this.name = name;
		instructors = new ArrayList<>();
		textbooks = new ArrayList<>();
		instructors.add(new Instructor());
		textbooks.add(new Textbook());
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addInstructor(String firstName, String lastName, String officeNumber) {
		// Replace placeholder instructor if necessary
		if (instructors.get(0).getFirstName().equals("TBA")) {
			instructors.get(0).setFirstName(firstName);
			instructors.get(0).setLastName(lastName);
			instructors.get(0).setOfficeNumber(officeNumber);
		} else {
			instructors.add(new Instructor(firstName, lastName, officeNumber));
		}
	}
	
	public void addTextbook(String title, String author, String publisher) {
		// Replace placeholder textbook if necessary
		if (textbooks.get(0).getTitle().equals("N/A")) {
			textbooks.get(0).setTitle(title);
			textbooks.get(0).setAuthor(author);
			textbooks.get(0).setPublisher(publisher);
		} else {
			textbooks.add(new Textbook(title, author, publisher));
		}
	}
	
	public void print() {
		System.out.println(name);
		printInstructors();
		printTextbooks();
	}
	
	private void printInstructors() {
		String listedInstructors = (instructors.size() > 1) ? " Instructors: " : " Instructor: ";
		
		for(Instructor instructor : instructors)
		{
			listedInstructors += instructor + "; ";
		}
		
		System.out.println(listedInstructors.substring(0, listedInstructors.length() - 2));
	}
	
	private void printTextbooks() {
		String listedTextbooks = (textbooks.size() > 1) ? " Textbooks: " : " Textbook: ";
		
		for(Textbook textbook : textbooks)
		{
			listedTextbooks += textbook + "; ";
		}
		
		System.out.println(listedTextbooks.substring(0, listedTextbooks.length() - 2));
	}
}
