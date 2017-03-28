package softwaremanagementtool.agile.dashboardview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BurndownChart extends Application{

    @Override
    public void start(Stage stage) throws Exception {

      Parent root = FXMLLoader.load(this.getClass().getResource("BurndownChart.fxml"));
      Scene scene = new Scene(root);
      
      scene.getStylesheets().addAll(this.getClass().getResource("BurndownChart.css").toExternalForm());

      stage.setTitle("Burndown Chart");

      stage.setScene(scene);
      stage.show();
    }

    public static void main(String[] args) {
      launch(args);
    }
}
