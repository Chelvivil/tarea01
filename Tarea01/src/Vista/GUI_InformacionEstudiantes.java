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
public class GUI_InformacionEstudiantes extends javax.swing.JPanel {

    
    
    public GUI_InformacionEstudiantes() {
        initComponents();
    }
    public String[] devolverInformacion(){
        String arreglo[];
        arreglo= new String[3];
        arreglo[0]=this.jt_Cedula.getText();
        arreglo[1]=this.jt_NombreCompleto.getText();
        arreglo[2]= this.jt_Direccion.getText();
        return arreglo;
    }
    public String devolverCedula()
    {
    return this.jt_Cedula.getText();
    }
    public void mostrarInformacion(String arreglo[]){
        this.jt_NombreCompleto.setText(arreglo[0]);
        this.jt_Direccion.setText(arreglo[1]);
    }
    public void limpiar(){
        
        this.jt_Direccion.setText("");
        this.jt_NombreCompleto.setText("");
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Cedula = new javax.swing.JLabel();
        jl_NombreCompleto = new javax.swing.JLabel();
        jl_Direccion = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        jt_NombreCompleto = new javax.swing.JTextField();
        jt_Direccion = new javax.swing.JTextField();
        btn_ConsultaRapida = new javax.swing.JButton();

        jl_Cedula.setText("Cedula");

        jl_NombreCompleto.setText("Nombre completo");

        jl_Direccion.setText("Direccion");

        btn_ConsultaRapida.setText("Consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_NombreCompleto)
                    .addComponent(jl_Cedula)
                    .addComponent(jl_Direccion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_Direccion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jt_Cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ConsultaRapida))
                    .addComponent(jt_NombreCompleto))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Cedula)
                    .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ConsultaRapida))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreCompleto)
                    .addComponent(jt_NombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Direccion)
                    .addComponent(jt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ConsultaRapida;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Direccion;
    private javax.swing.JLabel jl_NombreCompleto;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Direccion;
    private javax.swing.JTextField jt_NombreCompleto;
    // End of variables declaration//GEN-END:variables
}
