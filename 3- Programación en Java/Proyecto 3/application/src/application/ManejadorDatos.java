package application;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class ManejadorDatos extends Application {
	
	 private Connection conn;
	 private PreparedStatement pstmt;
	 private ResultSet rset;
	 private TextField tfid= new TextField();
	 private TextField tfSalary = new TextField();
	 private Label lblResult= new Label();
	 private Label lblSalary;
	 private Button btModSalary;
	
	 @Override
	public void start(Stage primaryStage) {
		
		 try {
			 initializeDatabase();
			//create a button that will call the showResultmethod
			 Button btShowID= new Button("Show Employee Details");
			 btShowID.setOnAction(e-> showResult());
			 
			 //crear boton para limpiar 
			 Button btClearInfo = new Button("Clear");
			 btClearInfo.setOnAction(e-> clear());
			 
			 //boton para crear salario
			 btModSalary = new Button("Update Salary");
			 btModSalary.setOnAction(e-> updateSalary());
			 
			 lblSalary= new Label("New Salary");
			 updateVisilibility(false);
			 
			//crea un cuadro horizontal que muestra la etiqueta, el cuadro de texto y el botón
			 HBox hBox = new HBox(5);
			 hBox.getChildren().addAll(new Label(" Employee ID"), tfid, btShowID);
			 
			 HBox hBox2 = new HBox(5);
			 hBox.getChildren().addAll(lblSalary, tfSalary, btModSalary);		 
			
			 //crea un cuadro vertical que muestra todos los componentes en la interfaz
			 
			 VBox vBox= new VBox(10);
			 vBox.getChildren().addAll(hBox,lblResult,hBox2);
			 
			//Establezca el ancho del cuadro de texto en 6 caracteres
			 tfid.setPrefColumnCount(6);
			 tfSalary.setPrefColumnCount(6);
			 
			//crea un objeto de escena que contiene el contenido de //vBox
			 Scene scene = new Scene(vBox, 400, 100);
			 
			 //set up the primary stage
			 primaryStage.setTitle("Show Employee ID");
			 primaryStage.setScene(scene);
			 primaryStage.show(); 
			 
			 } catch(Exception e) {
			 e.printStackTrace();
			 }//end try catc
	}
	 private void updateVisilibility(boolean val) {
		lblSalary.setVisible(val);
		tfSalary.setVisible(val);
		btModSalary.setVisible(val);
		lblResult.setVisible(val);
	}
	 
	private void updateSalary() {
		try{
			int id = Integer.parseInt(tfid.getText());
		    int salary=Integer.parseInt(tfSalary.getText());
		    PreparedStatement prepstmt = conn.prepareStatement("UPDATE employees SET salary = ? WHERE employee_id =?");
		    prepstmt.setInt(1,salary);
		    prepstmt.setInt(2,id);
		    prepstmt.execute();
		    prepstmt.close();
		}catch (NumberFormatException e){ 
			displayError("Input Error", "Incorrect value entered");
		}catch(SQLIntegrityConstraintViolationException e) {
			displayError("Salary Error", "Negative value for salary entered");
			tfSalary.setText("");
		}catch (SQLException e) {
		  e.printStackTrace();
		}//end try catch
	
	}
	private void displayError(String title, String message) {
		Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
		
	}
	private void clear() {
		updateVisilibility(false);
		tfSalary.setText("");
		tfid.setText("");

	}
	private void showResult() {
		String employeeID = tfid.getText();
		String query = "SELECT email, first_name, last_name, salary " 
                +"FROM Employees "
	               +"where employee_id = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setBigDecimal(1,new BigDecimal(employeeID));
			rset = pstmt.executeQuery();
			if (rset.next()) {
				String email = rset.getString(1);
		        String firstName = rset.getString(2);
		        String lastName = rset.getString(3);
		        int empSalary = rset.getInt(4);
		        lblResult.setText(" Employee name is " + firstName
		        		        + " " + lastName 
		        		        + ", email is " + email
		        		        + ", salary: $" + empSalary);
		        updateVisilibility(true);
		    } else {
		    	lblResult.setText("Try again !No Employee information for the ID "+ employeeID);
		    	lblResult.setVisible(true);
		    }//endif
			
		} catch (SQLException e) {
			  e.printStackTrace();
		}
		catch(NumberFormatException e) {
			displayError("ID Error", "No value entered for Employee ID");
		}//end try catch
	 }//end method showResult
	 
	 public void initializeDatabase() {
		 	String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost:3306/hr?&serverTimezone=UTC";
			//String query = "SELECT email, first_name, last_name, salary " 
                   // +"FROM Employees "
		              // +"where employee_id = ?";
			try {
				this.conn = DriverManager.getConnection(url, user, password);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 public static void main(String[] args) {
			launch(args);
		
	}//end class mysqlconnection
}