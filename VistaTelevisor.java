import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;
/**
 * Write a description of class VistaTelevisor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VistaTelevisor extends Application
{
   public void start(Stage stage)throws IOException{
       FXMLLoader loader = new FXMLLoader();
       String path = "vistaTelevisor.fxml";
       FileInputStream fxStream = new FileInputStream(path);
       
       Pane root = (Pane) loader.load(fxStream);
       
       Scene scene = new Scene(root);
       
       stage.setScene(scene);
       stage.setTitle("Tv control");
       stage.show();
       
    }
   
}
