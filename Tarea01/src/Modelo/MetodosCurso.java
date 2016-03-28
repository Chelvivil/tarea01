/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.FRM_MantenimientoCursos;
import Vista.GUI_InformacionCursos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author chelvivil
 */
public class MetodosCurso {
  ArrayList<Curso> arrayCurso;
   
    public MetodosCurso() {
   
   arrayCurso = new ArrayList<Curso>();
  
    }
     public void agregarCurso(String informacion[]) {
        Curso temporal = new Curso();
       
        if (!informacion[0].equals("") && !informacion[1].equals("") && !informacion[2].equals("")){
       
       
        temporal.setNombreCurso(informacion[0]);
        temporal.setSiglaCurso(informacion[1]);
        temporal.setCantidadCreditos(informacion[2]);
        arrayCurso.add(temporal);
        JOptionPane.showMessageDialog(null, "El Curso fué agregado de forma correcta");
        }
        else{
            JOptionPane.showMessageDialog(null,"Rellene todos los campos para poder agregar");
        }
           }
           
    
       
     
     public void eliminarCursolArray(String informacion[])
    {
        
         
              for (int i = 0; i < arrayCurso.size(); i++) {
            if (arrayCurso.get(i).getSiglaCurso().equals(informacion[1]))
            { 
                arrayCurso.remove(i);
                 JOptionPane.showMessageDialog(null, "El curso fué eliminado de forma correcta");
          
            }
        }
    }
      public void ModificarCurso(String informacion[]) {
         
          if (!informacion[0].equals("") && !informacion[1].equals("") && !informacion[2].equals("")){
        for (int i = 0; i < arrayCurso.size(); i++) {
            if (arrayCurso.get(i).getSiglaCurso().equals(informacion[1])) {
                
                
                arrayCurso.get(i).setNombreCurso(informacion[0]);
                arrayCurso.get(i).setCantidadCreditos(informacion[2]);
                
            }
            
            
        } JOptionPane.showMessageDialog(null, "El estudiante fué modificado de forma correcta");
          }
          else{JOptionPane.showMessageDialog(null,"Rellene todos los campos para poder modificar");}
   
      
      }
public String[] buscarCurso(String informacion[])
{
String arregloDatos[]=new String[2];
if (!informacion[0].equals("")){    
for(int i=0;i<arrayCurso.size();i++){
    if (arrayCurso.get(i).getSiglaCurso().equals(informacion[1])){
     arregloDatos[0]=arrayCurso.get(i).getNombreCurso();
     arregloDatos[1]=arrayCurso.get(i).getCantidadCreditos();
    }
}
} else{JOptionPane.showMessageDialog(null,"Rellene la sigla para buscar");}
return arregloDatos;
}

             
     
  
}
