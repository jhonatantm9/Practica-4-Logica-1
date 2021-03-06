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
public class Editor extends javax.swing.JFrame {

    //vector de referencia para vistaPrevia y Ventana1
    public static Vector vFinal= new Vector (Ventana1.arreglo.getTamano());
    
    /**
     * Creates new form Ventana2
     */
    public Editor() {
        initComponents();
        //las cuatro primeras líneas evitan pegar elementos en los textFields
        posUsuario.setTransferHandler(null);
        posUsuario1.setTransferHandler(null);
        posUsuario2.setTransferHandler(null);
        numeroUsuario.setTransferHandler(null);
        //se pasan los elementos del vector de Ventana1 a vFinal manualmente,
        //para evitar fallos
        for (int i = 0; i < vFinal.getTamano(); i++) {
            vFinal.agregarDato(Ventana1.arreglo.obtenerElemento(i), i);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        posUsuario1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        posUsuario2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        posUsuario = new javax.swing.JTextField();
        numeroUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cambiarPos = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cambiarNum = new javax.swing.JButton();
        vistaPrev = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        invertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel2.setText("A continuación se muestran las formas en que puede editar el vector.");

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel3.setText("El botón de vista previa, le permite ver cómo quedará el vector final");

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel4.setText("Cambiar los elementos de dos posiciones");

        posUsuario1.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        posUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                posUsuario1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel5.setText("Posición 1:");

        jLabel6.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel6.setText("Posición 2:");

        posUsuario2.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        posUsuario2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                posUsuario2KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel7.setText("Cambiar el elemento de una posición");

        jLabel8.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel8.setText("Posición:");

        jLabel9.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel9.setText("Número:");

        posUsuario.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        posUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                posUsuarioKeyTyped(evt);
            }
        });

        numeroUsuario.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        numeroUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroUsuarioKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel1.setText("Invertir el orden de los elementos del vector");

        cambiarPos.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        cambiarPos.setText("Cambiar");
        cambiarPos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarPosMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel10.setText("Nota: Para cambiar el valor que tiene el vector en una posición específica por un número");

        jLabel11.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        jLabel11.setText("aleatorio, deje en blanco la casilla Número");

        cambiarNum.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        cambiarNum.setText("Cambiar");
        cambiarNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarNumMouseClicked(evt);
            }
        });

        vistaPrev.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        vistaPrev.setText("Vista Previa");
        vistaPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vistaPrevMouseClicked(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        guardar.setText("Aplicar Cambios");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });

        error1.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N

        error2.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N

        invertir.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        invertir.setText("Invertir");
        invertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invertirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cambiarPos)
                                        .addGap(62, 62, 62)
                                        .addComponent(error1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(posUsuario1)
                                        .addComponent(posUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cambiarNum)
                                        .addGap(57, 57, 57)
                                        .addComponent(error2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(posUsuario)
                                        .addComponent(numeroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel11)))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addComponent(invertir)
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(vistaPrev)
                .addGap(36, 36, 36)
                .addComponent(guardar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(posUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambiarPos)
                    .addComponent(error1))
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(posUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(numeroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambiarNum)
                    .addComponent(error2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(invertir))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vistaPrev)
                    .addComponent(guardar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void posUsuario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_posUsuario1KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_posUsuario1KeyTyped

    private void posUsuario2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_posUsuario2KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_posUsuario2KeyTyped

    private void posUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_posUsuarioKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_posUsuarioKeyTyped

    private void numeroUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroUsuarioKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE
                || c == KeyEvent.VK_MINUS)) {
            evt.consume();
        }
    }//GEN-LAST:event_numeroUsuarioKeyTyped

    /**
     * Este método intercambia las posiciones de dos elementos en el vector.
     * Las posiciones son dadas por el usuario en dos textFields y deben estar entre
     * 1 y n, donde n es el tamaño del vector
     * @param evt Se ejecuta al hacer click en Cambiar(botón de arriba)
     */
    private void cambiarPosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarPosMouseClicked
        if(posUsuario1.getText().equals("")|| posUsuario2.getText().equals("")){
            error1.setText("Por favor ingrese las dos posiciones que desea cambiar");
        }
        else{
            int pos1= Integer.parseInt(posUsuario1.getText());
            int pos2= Integer.parseInt(posUsuario2.getText());
            if(pos1>vFinal.getTamano() || pos2>vFinal.getTamano() || 
                    pos1 == 0 || pos2 == 0){
                error1.setText("Los números deben ser posiciones válidas");
            }else{
                /*elimina los datos que están en el el label de error
                y los textFields con las posiciones dadas por el usuario
                */
                error1.setText("");
                posUsuario1.setText("");
                posUsuario2.setText("");
                if (pos1 != pos2){
                    vFinal.intercambiarPosiciones((pos1-1), (pos2-1));
                }
            }
        }
        //vFinal.mostrarElementos();
    }//GEN-LAST:event_cambiarPosMouseClicked

    /**
     * Envía los cambios realizados en el editor al vector de referencia de Ventana1
     * y ejecuta el método para cambiar la tabla
     * @param evt Se ejecuta al hacer click en el botón Aplicar Cambios
     */
    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        Ventana1 ventana = new Ventana1();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        Ventana1.pasarEditor();
        this.setVisible(false);
    }//GEN-LAST:event_guardarMouseClicked

    /**
     * Muestra a la derecha una ventana con una vista previa de cómo se verá
     * la tabla con los cambios que se han realizado
     * @param evt Se ejecuta al hacer click en Vista Previa
     */
    private void vistaPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vistaPrevMouseClicked
        vistaPrevia vPrev = new vistaPrevia();
        vPrev.setLocation(this.getX()+this.getWidth(), this.getY());
        vPrev.setVisible(true);
    }//GEN-LAST:event_vistaPrevMouseClicked

    /**
     * Cambia el número en una posición específica por un dato dado por el usuario
     * o un dato aleatorio
     * @param evt Se ejecuta al hacer click en Cambiar(segundo botón)
     */
    private void cambiarNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarNumMouseClicked
        if(posUsuario.getText().equals("")){
            error2.setText("Por favor ingrese una posición para cambiar el número");
        }
        else{
            int pos = Integer.parseInt(posUsuario.getText());
            if(pos==0 || pos>vFinal.getTamano()){
                error2.setText("Por favor ingrese una posición válida");
            }
            else{                
                //si la casilla de Número se deja vacía, se cambia el dato
                //por un número aleatorio
                if(numeroUsuario.getText().isEmpty()){
                    vFinal.agregarRandomEn(pos-1);
                    //se eliminan los datos de error y las casillas
                    error2.setText("");
                    posUsuario.setText("");
                    numeroUsuario.setText("");
                }
                else{
                    //si la casilla no se deja vacía, se verifica que contenga un
                    //número válido y, si es así, se cambia el dato por este
                    try{
                        int num = Integer.parseInt(numeroUsuario.getText());
                        vFinal.agregarDato(num,(pos-1));
                        //se eliminan los datos de error y las casillas
                        error2.setText("");
                        posUsuario.setText("");
                        numeroUsuario.setText("");
                    }
                    catch(NumberFormatException e){//el dato ingresado no es un entero
                        error2.setText("Por favor ingrese un número válido");
                    }
                }
                
            }
        }
        // vFinal.mostrarElementos();
    }//GEN-LAST:event_cambiarNumMouseClicked

    /**
     * Este método, invierte el orden en que aparece el vector.
     * El elemento en la primera posición se cambia con la última, el segundo
     * con la penúltima, y así sucesivamente
     * @param evt Se ejecuta al hacer click en el botón Invertir
     */
    private void invertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invertirMouseClicked
        int fin =vFinal.getTamano()-1;
        for (int i = 0; i < (vFinal.getTamano()/2); i++) {
            vFinal.intercambiarPosiciones(i, fin);
            fin--;
        }
        //vFinal.mostrarElementos();
    }//GEN-LAST:event_invertirMouseClicked

    
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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarNum;
    private javax.swing.JButton cambiarPos;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JButton guardar;
    private javax.swing.JButton invertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numeroUsuario;
    private javax.swing.JTextField posUsuario;
    private javax.swing.JTextField posUsuario1;
    private javax.swing.JTextField posUsuario2;
    private javax.swing.JButton vistaPrev;
    // End of variables declaration//GEN-END:variables
}
