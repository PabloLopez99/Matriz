package com.mycompany.matriz.UI;

import com.mycompany.matriz.model.MatrixGenerator;
import java.awt.ComponentOrientation;
import java.awt.Event;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pabloantoniolopezmartin
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private boolean spanish=true;
    private int digits;
    private MatrixGenerator matrixGen;
    private int espacios=5;
    public MainFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTextArea = new javax.swing.JTextArea();
        slicer = new javax.swing.JSlider();
        displayPick = new javax.swing.JLabel();
        resultadoSearchLabel = new javax.swing.JLabel();
        displayWarnings = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        minLabel = new javax.swing.JLabel();
        maxLabel = new javax.swing.JLabel();
        minTextField2 = new javax.swing.JTextField();
        maxTextField2 = new javax.swing.JTextField();
        dimParam1TextField = new javax.swing.JTextField();
        dimParam2TextField = new javax.swing.JTextField();
        xLabel = new javax.swing.JLabel();
        dimensionLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        searchInputTextField = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        busquedaLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        spanishIcon = new javax.swing.JLabel();
        englishIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 255, 204));

        mainTextArea.setColumns(20);
        mainTextArea.setRows(5);
        mainTextArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainTextAreaMouseDragged(evt);
            }
        });
        jScrollPane1.setViewportView(mainTextArea);

        slicer.setMinimum(-100);
        slicer.setPaintLabels(true);
        slicer.setPaintTicks(true);
        slicer.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slicerStateChanged(evt);
            }
        });

        displayWarnings.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoSearchLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(displayPick)
                            .addGap(331, 331, 331)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(slicer, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(displayWarnings)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayPick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slicer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(displayWarnings)
                .addGap(13, 13, 13)
                .addComponent(resultadoSearchLabel)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        minLabel.setText("Mínimo:");

        maxLabel.setText("Máximo:");

        minTextField2.setText("-10");
        minTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        minTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                minTextField2CaretUpdate(evt);
            }
        });

        maxTextField2.setText("10");
        maxTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                maxTextField2CaretUpdate(evt);
            }
        });

        dimParam1TextField.setText("10");
        dimParam1TextField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                dimParam1TextFieldCaretUpdate(evt);
            }
        });

        dimParam2TextField.setText("10");
        dimParam2TextField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                dimParam2TextFieldCaretUpdate(evt);
            }
        });

        xLabel.setText("x");

        dimensionLabel.setText("Dimensión:");

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchInputTextField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchInputTextFieldCaretUpdate(evt);
            }
        });

        searchLabel.setText("Introduzca Número:");

        busquedaLabel.setText("Búsqueda");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(searchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(busquedaLabel)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(busquedaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(searchInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dimensionLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxLabel)
                                    .addComponent(minLabel))))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(minTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addComponent(maxTextField2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dimParam1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dimParam2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minLabel)
                    .addComponent(minTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxLabel)
                    .addComponent(maxTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dimParam1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dimParam2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xLabel)
                        .addComponent(dimensionLabel)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        minLabel.getAccessibleContext().setAccessibleName("");
        minLabel.getAccessibleContext().setAccessibleDescription("");
        maxLabel.getAccessibleContext().setAccessibleName("");
        maxLabel.getAccessibleContext().setAccessibleDescription("");
        minTextField2.getAccessibleContext().setAccessibleName("k");
        minTextField2.getAccessibleContext().setAccessibleDescription("Valor mínimo para cada valor generado");

        titleLabel.setFont(new java.awt.Font("American Typewriter", 0, 24)); // NOI18N
        titleLabel.setText("MATRIX PICKER");

        spanishIcon.setIcon(new javax.swing.ImageIcon("/Users/pabloantoniolopezmartin/NetBeansProjects/Matriz/src/main/java/com/mycompany/matriz/media/600px-Spain_flag_icon.png")); // NOI18N
        spanishIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spanishIconMouseClicked(evt);
            }
        });

        englishIcon.setIcon(new javax.swing.ImageIcon("/Users/pabloantoniolopezmartin/NetBeansProjects/Matriz/src/main/java/com/mycompany/matriz/media/flag-button-round-250.png")); // NOI18N
        englishIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                englishIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spanishIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(englishIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(englishIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spanishIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slicerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slicerStateChanged
        displayPick.setText(Integer.toString(slicer.getValue()));
        resultadoSearchLabel.setText("");
        displayMatrix();
        
    }//GEN-LAST:event_slicerStateChanged
    
    private void genMatrix(){
         resultadoSearchLabel.setText("");
        try{
            matrixGen = new MatrixGenerator(Integer.parseInt(minTextField2.getText()),Integer.parseInt(maxTextField2.getText()),Integer.parseInt(dimParam1TextField.getText()),Integer.parseInt(dimParam2TextField.getText()));
            slicer.setMinimum(Integer.parseInt(minTextField2.getText()));
            slicer.setMaximum(Integer.parseInt(maxTextField2.getText()));
            displayMatrix();
            displayWarnings.setText("");
            resultadoSearchLabel.setText("");
        }catch(NumberFormatException e){
            if(spanish){
                displayWarnings.setText("Los valores deben ser números enteros");
            }else{
                displayWarnings.setText("Values must be integers"); 
            }
        }
    }
    
    private void search(){
        try{
            int aux=0;
            for (int i = 0; i < matrixGen.getMatrix().length; i++) {
                for (int j = 0; j < matrixGen.getMatrix()[0].length; j++) {
                    if(matrixGen.getMatrix()[i][j]==(Integer.parseInt(searchInputTextField.getText()))){
                        aux++;
                    }
                }
            }
            displayWarnings.setText("");
            if(spanish){
                resultadoSearchLabel.setText("Se han encontrado: "+Integer.toString(aux)+" coincidencias del número: "+ searchInputTextField.getText()); 
            }else{
                resultadoSearchLabel.setText(Integer.toString(aux)+" coincidences of the number "+ searchInputTextField.getText()+" have been found"); 
            }
        }catch(NumberFormatException e){
            if(spanish){
                displayWarnings.setText("Introduzca un valor numérico válido o seleccione uno de la matriz");
            }else{
               displayWarnings.setText("Insert a whole number or selecct one from the matrix");

            }
        }
    }
    private void mainTextAreaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTextAreaMouseDragged
        try{
            if(!mainTextArea.getSelectedText().contains("_")){
                searchInputTextField.setText(mainTextArea.getSelectedText().trim());
            }
             
        }catch(Exception e){}
    }//GEN-LAST:event_mainTextAreaMouseDragged

    private void spanishIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spanishIconMouseClicked
        spanish=true;
        translateToSpanish();
    }//GEN-LAST:event_spanishIconMouseClicked

    private void englishIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_englishIconMouseClicked
        spanish=false;
        translateToEnglish();
    }//GEN-LAST:event_englishIconMouseClicked

    private void maxTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_maxTextField2CaretUpdate
        try{
            genMatrix();
            dimParam1TextField.setText(dimParam2TextField.getText());
            
        }catch(Exception e){
            if(spanish){
                displayWarnings.setText("El primer número tiene que ser inferior al segundo");
            }else{
                displayWarnings.setText("The first num must be lower than the second"); 
            }
        }
    }//GEN-LAST:event_maxTextField2CaretUpdate

    private void dimParam1TextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_dimParam1TextFieldCaretUpdate
        try{
            genMatrix();
            dimParam2TextField.setText(dimParam1TextField.getText());
        }catch(Exception e){}
        genMatrix();
    }//GEN-LAST:event_dimParam1TextFieldCaretUpdate

    private void searchInputTextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchInputTextFieldCaretUpdate
        search();
    }//GEN-LAST:event_searchInputTextFieldCaretUpdate

    private void minTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_minTextField2CaretUpdate
        try{
            genMatrix();
            dimParam2TextField.setText(dimParam1TextField.getText());
        }catch(Exception e){
            if(spanish){
                displayWarnings.setText("El mínimo tiene que ser inferior al máximo");
            }else{
                displayWarnings.setText("Minimum must be lower than the maximum"); 
            }
        }
    }//GEN-LAST:event_minTextField2CaretUpdate

    private void dimParam2TextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_dimParam2TextFieldCaretUpdate
        try{
            genMatrix();
            dimParam1TextField.setText(dimParam2TextField.getText());
        }catch(Exception e){}
        genMatrix();
    }//GEN-LAST:event_dimParam2TextFieldCaretUpdate

    private void translateToSpanish(){
        minLabel.setText("Mínimo");
        maxLabel.setText("Máximo");
        dimensionLabel.setText("Dimensión");
        searchLabel.setText("Introduzca número:");
        busquedaLabel.setText("Buscar");
    }
    private void translateToEnglish(){
        minLabel.setText("Minimun");
        maxLabel.setText("Maximum");
        dimensionLabel.setText("Dimension");
        searchLabel.setText("Enter number:");
        busquedaLabel.setText("Search");
    }
     private void init() {
        setResizable(false);
        maxTextField2.setText("100");
        minTextField2.setText("-100");
        slicer.setMaximum(Integer.parseInt(maxTextField2.getText()));
        slicer.setMinimum(Integer.parseInt(minTextField2.getText()));
        initMatrix();
        displayPick.setText(Integer.toString(slicer.getValue()));
    }
  

    private void initMatrix() {
        matrixGen = new MatrixGenerator(Integer.parseInt(minTextField2.getText()),Integer.parseInt(maxTextField2.getText()),Integer.parseInt(dimParam1TextField.getText()),Integer.parseInt(dimParam2TextField.getText()));
        displayMatrix();
    }
    
    private void getInsertedInterval(){
        
        if(maxTextField2.getText().length()>minTextField2.getText().length()){
            digits=maxTextField2.getText().length();
            if(Integer.parseInt(maxTextField2.getText()) * (-1) != 1){
                digits+=1;
            }
        }else{
             digits=minTextField2.getText().length();
             if(Integer.parseInt(minTextField2.getText()) * (-1) != 1){
                digits+=1;
            }
        }
    }

    private void displayMatrix() {
        int contador=0;
        getInsertedInterval();
        espacios=digits+4;
        
        String display="";
        for (int i = 0; i < matrixGen.getMatrix().length; i++) {
            for (int j = 0; j < matrixGen.getMatrix()[0].length; j++) {
                if(slicer.getValue()<=matrixGen.getMatrix()[i][j]){
                    contador++;
                    int t= espacios - Integer.toString(matrixGen.getMatrix()[i][j]).length();
                    String aux="";
                    for (int k = 0; k < t-3; k++) {
                        aux+=" ";
                    }
                    display+=matrixGen.getMatrix()[i][j] + aux;
                }else{
                    String aux="";
                    for (int k = 0; k < digits-2; k++) {
                        aux+="_";
                    }
                    for (int k = 0; k < espacios-digits; k++) {
                        aux+=" ";
                    }
                    display+=aux;
                }
            }
             display+="\n";
        }
        mainTextArea.setText(display);
        System.out.println(display);
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel busquedaLabel;
    private javax.swing.JTextField dimParam1TextField;
    private javax.swing.JTextField dimParam2TextField;
    private javax.swing.JLabel dimensionLabel;
    private javax.swing.JLabel displayPick;
    private javax.swing.JLabel displayWarnings;
    private javax.swing.JLabel englishIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mainTextArea;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JTextField maxTextField2;
    private javax.swing.JLabel minLabel;
    private javax.swing.JTextField minTextField2;
    private javax.swing.JLabel resultadoSearchLabel;
    private javax.swing.JTextField searchInputTextField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JSlider slicer;
    private javax.swing.JLabel spanishIcon;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel xLabel;
    // End of variables declaration//GEN-END:variables

   
}