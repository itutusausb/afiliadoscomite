/**
 * Sample Skeleton for 'Login.fxml' Controller Class
 */

package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.Notification;

import org.controlsfx.control.Notifications;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class LoginController {

    @FXML // fx:id="btnLogin"
    private JFXButton btnLogin; // Value injected by FXMLLoader

    @FXML // fx:id="txtPassword"
    private JFXPasswordField txtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtUser"
    private JFXTextField txtUser; // Value injected by FXMLLoader

    @FXML // fx:id="userImage"
    private ImageView userImage; // Value injected by FXMLLoader

    @FXML // fx:id="passwordImage"
    private ImageView passwordImage; // Value injected by FXMLLoader
  
    @FXML
    void clickLogin(ActionEvent event) {
    	
    	
    	String getUser = txtUser.getText();
    	String getPassw = txtPassword.getText();
    	String selectUser ="select usuario,password,privilegios from afiliadoscomite.usuarios where usuario='"+getUser+"'";
    	
    	try {
    		
			Connection conn = Conexion.getConection();
			PreparedStatement pstat = conn.prepareStatement(selectUser);
			ResultSet rs = pstat.executeQuery();
			
			if(rs.next()) {
				String userBD = rs.getString("usuario");
				String passwBD = rs.getString("password");
				String privilegiosBD = rs.getString("privilegios");
				
				if(getPassw.equals(passwBD)) {
					if(privilegiosBD.equals("administrador")) {
						System.out.println("Admin");
						//propiedades para arrancar con admin
					}else if(privilegiosBD.equals("usuario")){
						System.out.println("usuario");
						//propiedades para arrancar con usuario
					}
					
					
					
					
					
				}else {
					// contraseña incorrecta
					Notifications notificacion = Notifications.create()
							.title("Contraseña incorrecta")
							.text("Verifique que la contraseña es correcta")
							.graphic(null)
							.hideAfter(Duration.seconds(5))
							.position(Pos.BOTTOM_RIGHT);
				
					notificacion.showError();
					System.out.println("contrseña incorrecta");
				}
				
				
			}else {
				// usuario no existe
				System.out.println("Usuario no existe");
				Notifications notificacion = Notifications.create()
						.title("Usuario desconocido")
						.text("El Usuario introducido no existe")
						.graphic(null)
						.hideAfter(Duration.seconds(5))
						.position(Pos.BOTTOM_RIGHT);
				notificacion.showError();
			}
			
			
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
    	
    	
    }

    
}


