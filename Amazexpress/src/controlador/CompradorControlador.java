package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class CompradorControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button cerrarSesion;
    
    @FXML
    private AnchorPane root;
    
    @FXML
    private Button perfilBoton;

    @FXML
    private Button mensajesBoton;

    @FXML
    private Button balanceBoton;

    @FXML
    private Button tiendaBoton;

    @FXML
    private Button productosBoton;

    @FXML
    private Button historialBoton;

    @FXML
    void initialize() {
    	inicializarBotones();
    }

	private void inicializarBotones() {
		cerrarSesion.setOnAction(new EventHandler<ActionEvent>() {
    	    @Override public void handle(ActionEvent e) {    	        
					try {
						//app.getAdmin(getUsername()).setLogged(false);
						cargarVentana("/vista/LoginUI.fxml"); 
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}					
    	    }
    	});
		
		perfilBoton.setOnAction(new EventHandler<ActionEvent>() {
    	    @Override public void handle(ActionEvent e) {    	        
					try {
						//app.getAdmin(getUsername()).setLogged(false);
						cargarVentana("/vista/CompradorPerfil.fxml"); 
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}					
    	    }
    	});
		
		mensajesBoton.setOnAction(new EventHandler<ActionEvent>() {
    	    @Override public void handle(ActionEvent e) {    	        
					try {
						//app.getAdmin(getUsername()).setLogged(false);
						cargarVentana("/vista/CompradorMensajesUI.fxml"); 
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}					
    	    }
    	});
		
		balanceBoton.setOnAction(new EventHandler<ActionEvent>() {
    	    @Override public void handle(ActionEvent e) {    	        
					try {
						//app.getAdmin(getUsername()).setLogged(false);
						cargarVentana("/vista/CompradorBalanceUI.fxml"); 
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}					
    	    }
    	});
		
		productosBoton.setOnAction(new EventHandler<ActionEvent>() {
    	    @Override public void handle(ActionEvent e) {    	        
					try {
						//app.getAdmin(getUsername()).setLogged(false);
						cargarVentana("/vista/CompradorProductosUI.fxml"); 
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}					
    	    }
    	});
		historialBoton.setOnAction(new EventHandler<ActionEvent>() {
    	    @Override public void handle(ActionEvent e) {    	        
					try {
						//app.getAdmin(getUsername()).setLogged(false);
						cargarVentana("/vista/CompradorHistorialUI.fxml"); 
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}					
    	    }
    	});
	}
	
	private void cargarVentana(String ruta) throws IOException {
		Parent ventana = FXMLLoader.load(getClass().getResource(ruta));
		root.getChildren().removeAll();
    	root.getChildren().setAll(ventana);
    }
}