package softwaremanagementtool;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SoftwareManagementToolMain extends Application {

  private Stage primaryStage;
  private BorderPane mainLayout;
	
  /**
   *  History - Initials, Date, Description
   *  sm  12/17/17  Creation
   *
   */
  @Override
  public void start(Stage primaryStage) throws IOException {
    this.primaryStage = primaryStage;
    this.primaryStage.setTitle("Software Management Tool"); 	
    showWindow();
  }
	
	
	/**
	 *  History - Initials, Date, Notes
	 *  sm  12/17/17  Creation
	 *  
	 */
	private void showWindow() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(SoftwareManagementToolMain.class.getResource("smtmainview/SmtMainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	
	
	/**
	 *  History - Initials, Date, Notes
	 *  sm  12/17/17  Creation
	 *
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
