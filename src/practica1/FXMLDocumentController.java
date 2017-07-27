/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author diego_fer.bolanos
 */
public class FXMLDocumentController implements Initializable {
    
   
     @FXML
    private Label labelnom;
     @FXML
    private Label labelcod;
     @FXML
    private TextField TextoNom; 
     @FXML
    private TextField Textoco;
     
    LinkedList<Estudiante> listaE;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        //accion del boton 
        /* String nombre=jTextField1.getText();
       String codigo= jTextField2.getText();
       
       Estudiante objE= new Estudiante(nombre, codigo);
       boolean guardar=listaE.add(objE);
       
       if(guardar){
           jTextField1.setText("");
           jTextField2.setText("");*/
        
        String Nombre = TextoNom.getText();
        String Codigo = Textoco.getText();
        Estudiante obj = new Estudiante(Nombre , Codigo); 
        boolean Guardado = listaE.add(obj); 
        
        if(Guardado){
        TextoNom.setText(Nombre);
        Textoco.setText(Codigo);
        
        }
    }
    
    @FXML
    private void handleButtonAction1(ActionEvent event){
    String mostrar="";
        for (int i = 0; i < listaE.size(); i++) {
            mostrar += listaE.get(i)+"\n";
            
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaE = new LinkedList<>(); 
    }    
    
}
