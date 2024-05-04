
public class MVCPatternDemo {

	public static void main(String[] args) {
	      //create a model
	      StudentModel model = new StudentModel();

	      //create a view that shows the model
	      StudentView view = new StudentView();

		  //create a controller for this MVC
		  StudentController controller = new StudentController(model, view);

		  //load the model and display the record
		  controller.setStudentName("Robert");
	      controller.setStudentRollNo("10");
	      controller.updateView();

	      //update the model and display the record
	      controller.setStudentName("John");
	      controller.setStudentRollNo("9");
	      controller.updateView();
	   }
}
