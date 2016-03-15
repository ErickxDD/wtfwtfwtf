/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.ManipulaEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author estudiante
 */
public class ControladorVentanaPrincipal implements ActionListener {
    private ManipulaEstudiantes manipulaEstudiante;
    public ControladorVentanaPrincipal(){
     this.manipulaEstudiante= new ManipulaEstudiantes();   
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Salir")){
            System.exit(0);
        }
        if(e.getActionCommand().equals("Manipular Estudiantes")){
            this.manipulaEstudiante.setVisible(true);}
    }
}

