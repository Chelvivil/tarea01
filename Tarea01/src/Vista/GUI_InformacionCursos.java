/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author chelvivil
 */
public class GUI_InformacionCursos extends javax.swing.JPanel {

    /**
     * Creates new form GUI_InformacionCursos
     */
    public GUI_InformacionCursos() {
        initComponents();
    }
     public String[] devolverInformacion(){
        String arreglo[];
        arreglo= new String[3];
        arreglo[0]=this.jt_NombreCurso.getText();
        arreglo[1]=this.jt_SiglasCurso.getText();
        arreglo[2]= this.jt_CantidadCreditos.getText();
        return arreglo;
    }
    
public void mostrarInformacion(String arreglo[]){
        this.jt_NombreCurso.setText(arreglo[0]);
        this.jt_CantidadCreditos.setText(arreglo[1]);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NombreCurso = new javax.swing.JLabel();
        jl_SiglasCurso = new javax.swing.JLabel();
        jl_CantidadCreditos = new javax.swing.JLabel();
        jt_NombreCurso = new javax.swing.JTextField();
        jt_SiglasCurso = new javax.swing.JTextField();
        jt_CantidadCreditos = new javax.swing.JTextField();

        jl_NombreCurso.setText("Nombre del curso");

        jl_SiglasCurso.setText("Siglas del Curso");

        jl_CantidadCreditos.setText("Cantidad de creditos ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_CantidadCreditos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_CantidadCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_NombreCurso)
                            .addComponent(jl_SiglasCurso))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_NombreCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                            .addComponent(jt_SiglasCurso))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_SiglasCurso)
                    .addComponent(jt_SiglasCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreCurso)
                    .addComponent(jt_NombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CantidadCreditos)
                    .addComponent(jt_CantidadCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_CantidadCreditos;
    private javax.swing.JLabel jl_NombreCurso;
    private javax.swing.JLabel jl_SiglasCurso;
    private javax.swing.JTextField jt_CantidadCreditos;
    private javax.swing.JTextField jt_NombreCurso;
    private javax.swing.JTextField jt_SiglasCurso;
    // End of variables declaration//GEN-END:variables
}
