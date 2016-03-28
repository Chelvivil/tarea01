/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author chelvivil
 */
public class MetodosEstudiantes {

    ArrayList<Estudiante> arrayEstudiantes;

    public MetodosEstudiantes() {
        arrayEstudiantes = new ArrayList<Estudiante>();
    }

    public void agregarEstudiante(String informacion[]) {
        Estudiante temporal = new Estudiante();
        temporal.setCedula(informacion[0]);
        temporal.setNombreCompleto(informacion[1]);
        temporal.setDireccion(informacion[2]);
        arrayEstudiantes.add(temporal);
        JOptionPane.showMessageDialog(null, "El estudiante fué agregado de forma correcta");
    }
   /* public void mostrarInformacionEstudiantes(){
        Estudiante temp;
        temp = arrayEstudiantes.get(0);
        System.out.println(temp.getInformacion());
    }*/
    public void eliminarEstudianDelArray(String informacion[])
    {
        
         
              for (int i = 0; i < arrayEstudiantes.size(); i++) {
            if (arrayEstudiantes.get(i).getCedula().equals(informacion[0]))
            { 
                arrayEstudiantes.remove(i);
                 JOptionPane.showMessageDialog(null, "El estudiante fué eliminado de forma correcta");
          
            }
        }
    }
      public void ModificarEstudiantes(String informacion[]) {
         
          
        for (int i = 0; i < arrayEstudiantes.size(); i++) {
            if (arrayEstudiantes.get(i).getCedula().equals(informacion[0])) {
                
               
                arrayEstudiantes.get(i).setNombreCompleto(informacion[1]);
                arrayEstudiantes.get(i).setDireccion(informacion[2]);
                
            }
            
        }
    JOptionPane.showMessageDialog(null, "El estudiante fué modificado de forma correcta");
      }
public String[] buscarEstudiante(String cedula)
{
String arregloDatos[]=new String[2];
    for(int i=0;i<arrayEstudiantes.size();i++){
    if (arrayEstudiantes.get(i).getCedula().equals(cedula)){
     arregloDatos[0]=arrayEstudiantes.get(i).getNombreCompleto();
     arregloDatos[1]=arrayEstudiantes.get(i).getDireccion();
    }
}
return arregloDatos;
}
             
        
    
    }
   

