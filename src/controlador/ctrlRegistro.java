/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.frmRegistro;

/**
 *
 * @author Estudiante
 */
public class ctrlRegistro implements MouseListener{
    
    //llamar vista
    frmRegistro vista;
    
    //constructor
    public ctrlRegistro(frmRegistro Vista){
    
        this.vista = Vista;
        vista.btnRegistrar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.btnRegistrar){
        
            //validaciones
            //campos vacios
            if(vista.txtNombre.getText().isEmpty()){
            
                JOptionPane.showMessageDialog(vista, "Llene el campo de nombre");
            }
            
            if(vista.txtCorreo.getText().isEmpty()){
            
                JOptionPane.showMessageDialog(vista, "Llene el campo de correo electrónico");
            }
            
            if(vista.txtContrasena.getText().isEmpty()){
            
                JOptionPane.showMessageDialog(vista, "Llene el campo de contraseña");
            }
            
            if(vista.txtEdad.getText().isEmpty()){
            
                JOptionPane.showMessageDialog(vista, "Llene el campo de edad");
            }
            //validación de correo
            if(!vista.txtCorreo.getText().contains("@") || !vista.txtCorreo.getText().contains(".")){
            
                JOptionPane.showMessageDialog(vista, "Ingrese un correo válido");
            }
            
            //validación contraseña
            if(vista.txtContrasena.getText().length() < 6){
            
                JOptionPane.showMessageDialog(vista, "La contraseña debe de tener más de 6 carácteres");
            }
            
            //longitud edad
            
            if(vista.txtEdad.getText().length() > 2){
            
                JOptionPane.showMessageDialog(vista, "El límite de edad es 99 años");
            }
            
            //edad
            try{
            
                int edadNumerica = Integer.parseInt(vista.txtEdad.getText());
            }catch(Exception ex){
            
                JOptionPane.showMessageDialog(vista, "Ingrese números");
                return;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) { 

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
