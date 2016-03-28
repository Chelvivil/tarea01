/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Curso;
import Modelo.MetodosCurso;
import Vista.FRM_MantenimientoCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author chelvivil
 */
public class Controlador_FRM_MantenimientoCursos implements ActionListener {

    FRM_MantenimientoCursos mantenimientoCursos;
    Curso curso;
    MetodosCurso metodos;

    public Controlador_FRM_MantenimientoCursos(FRM_MantenimientoCursos mantenimientoCursos) {
        this.mantenimientoCursos = mantenimientoCursos;
        metodos = new MetodosCurso();
        curso = new Curso();
    }
   

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Buscar")) {
            System.out.println("Buscar");
           mantenimientoCursos.mostrarInformacion(metodos.buscarCurso(mantenimientoCursos.devolverInformacion()));

        }
        if (e.getActionCommand().equals("Agregar")) {

            System.out.println("Agregar");
            metodos.agregarCurso(mantenimientoCursos.devolverInformacion());
        }
        if (e.getActionCommand().equals("Modificar")) {
            System.out.println("Modificar");
metodos.ModificarCurso(mantenimientoCursos.devolverInformacion());
        }
        if (e.getActionCommand().equals("Eliminar")) {
            System.out.println("Eliminarr");
            metodos.eliminarCursolArray(mantenimientoCursos.devolverInformacion());
        }
    }

}
