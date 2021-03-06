package BNU.data.database;

import java.util.ArrayList;

import BNU.data.Course;
import BNU.data.Message;
import BNU.data.Professor;
import BNU.data.Review;

/**
 * 
 * @author Kevin
 * 
 * FACADE GoF Design Pattern
 * Structural
 * 
 * This class follows the facade design pattern. This class works as
 * a facad because it hides the complexity of the database
 * implementation from the program. Using this facade, the program
 * does not need to know all the detail regarding CRUD operation
 * involving the database. The program simply needs to know what
 * these methods return and trust the methods to do the secret
 * backend work.
 */

public interface dbWrapper {
	boolean validateUser(String userName, String password); //new
	
	String[] getAllProfessors();
	
	String[] getAllClasses();
	
	String[] getAllProfessorsForClass(String className);

	Professor getProfessor(String Prof);

	String[] getAllClassesForProfessor(String professorName);

	Course getCourse(String course);
	

	String[][] getAllCoursesByProf(String[] courses); //new

	String[][] getAllTeachersByCourse(String[] professorNames); //new
		
	boolean submitCredentials(String userName, String password); //new
	
	//return array of review content,score,reviewerID
	String[][] getAllReviewsForTeacherClass(String professorName,String className);
	
	// return in this order: overall score, helpfulness, teaching ability, workload
	String[] getOverallProfessorRatings(String professorName);
	
	// return review content, score, reviewerID, course name
	String[][] getAllReviewsForUser(String userName);

	// my added functions 
	String[][] getAllMessages(String sender, String receiver);
	
	String[] getAllFlagged();
	
	String getReceiver();
	
	String getSender();
	
	String[] getAllUserMessagers(String receiver);
	
	void upvote();
	
	void downvote();
	
	void sendMessage(Message m);
	
	ArrayList<Review> getReviews(String prof, String c);
	
	Boolean isUpvoteValid();
	
	Boolean isDownvoteValid();

	void setNewReview(String userName, String professorName, String className, String content, String tA, String h,
			String wL);

	boolean isAdmin(String userName);


}
