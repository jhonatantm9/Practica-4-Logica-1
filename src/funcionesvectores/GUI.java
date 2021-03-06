/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesvectores;

import java.awt.event.KeyEvent;

/**
 *
 * @author usuario
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        numeroUsuario.setTransferHandler(null);/*No permite pegar elementos en
                                        el espacio designado para el número*/
    }
    public static Vector arregloNumeros =new Vector();//vector de referencia para
                                        //Ventana1 y CrearVector

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numeroUsuario = new javax.swing.JTextField();
        yesB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        noB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel1.setText("Por favor ingrese la cantidad de posiciones que desea que tenga el vector");

        numeroUsuario.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        numeroUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numeroUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroUsuarioKeyTyped(evt);
            }
        });

        yesB.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        yesB.setText("Sí");
        yesB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yesBMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel2.setText("¿Desea introducir los datos del vector?");

        noB.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        noB.setText("No");
        noB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel3.setText("Creador de vectores");

        error.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(yesB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noB)
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(104, 104, 104))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(numeroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(error)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesB)
                    .addComponent(noB))
                .addGap(18, 18, 18)
                .addComponent(error)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Al presionar el botón No, se crea un vector con números aleatorios
     * con el tamaño especificado por el usuario. Si el tamaño es 0 o no se
     * escribe ningún número en el textField, no se ejecuta el código
     * @param evt Se ejecuta al hacer click sobre el botón No
     */
    private void noBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBActionPerformed
        try {/*Primero revisa que el textField contenga un elemento y no sea
               0, si esto ocurre, crea un vector con el número dado y lo llena
            con números aleatorios
            */
            error.setText("");
            int tamaño = Integer.parseInt(numeroUsuario.getText());
            if(tamaño == 0){
                error.setText("No se puede mostrar un vector vacío");
            }
            else{
                Vector arregloNumeros = new Vector(tamaño);//nuevo vector
                for (int i = 0; i < tamaño; i++) {//se llena el vector con números aleatorios
                    arregloNumeros.agregarRandomFin();
                }
                this.arregloNumeros=arregloNumeros;
                /*Se muestra una nueva ventana con el vector y se oculta la ventana
                actual
                */
                Ventana1 resultado = new Ventana1();
                resultado.setVisible(true);
                resultado.setLocationRelativeTo(this);
                this.setVisible(false);
                this.dispose();
            }            
        } catch (NumberFormatException e) {
            error.setText("Por favor ingrese un número entero para continuar");
        }
    }//GEN-LAST:event_noBActionPerformed

    private void numeroUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroUsuarioKeyPressed
    
    }//GEN-LAST:event_numeroUsuarioKeyPressed

    private void numeroUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroUsuarioKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_numeroUsuarioKeyTyped

    /**
     * Al presionar el botón Sí, se  envía al usuario a un nuevo JFrame donde
     * creará un vector con el tamaño especificado. Si el tamaño es 0 o no se
     * escribe ningún número en el textField, no se ejecuta el código
     * @param evt Se ejecuta al hacer click en el botón Sí
     */
    private void yesBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesBMouseClicked
        try {/*Primero revisa que el textField contenga un elemento y no sea
            0, si esto ocurre, crea un vector con el número dado y abre una nueva
            ventana en la que el usuario creará el vector
            */
            error.setText("");
            int tamaño = Integer.parseInt(numeroUsuario.getText());
            if(tamaño ==0){
                error.setText("No se puede mostrar un vector vacío");
            }
            else{
                Vector arregloNumeros = new Vector(tamaño);
                this.arregloNumeros=arregloNumeros;
                /*
                Abre una nueva ventana, con una tabla, para ingresar los valores
                del vector
                */
                CrearVector crear = new CrearVector();
                crear.setVisible(true);
                crear.setLocationRelativeTo(this);
                this.setVisible(false);
                this.dispose();
            }
            
        } catch (NumberFormatException e) {
            error.setText("Por favor ingrese un número entero para continuar");
        }
    }//GEN-LAST:event_yesBMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton noB;
    private javax.swing.JTextField numeroUsuario;
    private javax.swing.JButton yesB;
    // End of variables declaration//GEN-END:variables
}
