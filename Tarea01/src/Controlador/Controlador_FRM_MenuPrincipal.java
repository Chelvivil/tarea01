/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_MantenimientoCursos;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author chelvivil
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener{
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    FRM_MantenimientoCursos mantenimientoCursos;
    
    public Controlador_FRM_MenuPrincipal(){
        mantenimientoEstudiantes = new FRM_MantenimientoEstudiantes();
        mantenimientoCursos = new FRM_MantenimientoCursos();
    }
   
    
    public void actionPerformed(ActionEvent e){
       if(e.getActionCommand().equals("Salir")){
           System.exit(0);
       }
         if(e.getActionCommand().equals("Estudiantes")){
           this.mantenimientoEstudiantes.setVisible(true);
       }
           if(e.getActionCommand().equals("Cursos")){
           this.mantenimientoCursos.setVisible(true);
       }
   } 
}
