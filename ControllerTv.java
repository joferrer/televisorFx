
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javafx.scene.text.*;
public class ControllerTv {

    @FXML
    private TextField txtVolumen;

    @FXML
    private TextField txtCanal;

    @FXML
    private TextField txtEntrada;
    
    private Televisor tv ;
    
    public ControllerTv(){
       
        tv=new Televisor();
        
      
    }

    @FXML
    void avanzarCanal( ) {
        tv.avanzarCanal();
        actualizarPantalla();

    }

    @FXML
    void bajarVolumen() {
        tv.bajarVolumen();
        actualizarPantalla();

    }

    @FXML
    void cambiarEntrada() {
        
        
        String opcion = (String)JOptionPane.showInputDialog(
                    null,
                    "Tipo de Entrada TV",
                    "Seleccione el tipo de entrada y pulse aceptar",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    tv.tiposDeEntrada,
                    tv.tiposDeEntrada[1]);
     for(int i=0; i<tv.tiposDeEntrada.length; i++)
      if(tv.tiposDeEntrada[i].equals(opcion))
        tv.setTipoDeEntrada(i);
        
      actualizarPantalla();

    }
    public void actualizarPantalla(){
        txtCanal.setText(Integer.toString(tv.getCanal()));
        txtEntrada.setText(tv.getTipoDeEntrada());
        txtVolumen.setText(Integer.toString(tv.getVolumen()));
        txtVolumen.setFont(Font.font("Verdana",FontWeight.BOLD,20));
        txtCanal.setFont(Font.font("Verdana",FontWeight.BOLD,20));
    }

    @FXML
    void retrocederCanal() {
        tv.retrocederCanal();
        actualizarPantalla();

    }

    @FXML
    void subirVolumen() {
        tv.subirVolumen();
        actualizarPantalla();

    }

}
