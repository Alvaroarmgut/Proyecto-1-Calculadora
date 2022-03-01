/**
 * <pre>
 * Clase VistaCalculadora
 * 
 * Contiene las acciones de cada bot�n de la calculadora
 * </pre>
 */
package proyecto.calculadora;

/**
 *
 * @author Alvaro Armella, Alvaro Lopez, Jimena Rodriguez, Alejandro Carregha, Emiliano Sandoval
 */
public class VistaCalculadora extends javax.swing.JFrame {
    private String texto = "";
    /**
     * Creates new form VistaCalculadora
     */
    public VistaCalculadora() {
        initComponents();
    }
    
    /**
     * 
     * @param esto: se refiere a lo que desea escribir en la pantalla de la calculadora 
     */
    private void setBarra(String esto){
        texto += esto;
        barraTF.setText(texto);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraTF = new javax.swing.JTextField();
        parAviertoB = new javax.swing.JButton();
        ParCerradoB = new javax.swing.JButton();
        negativoB = new javax.swing.JButton();
        delB = new javax.swing.JButton();
        acB = new javax.swing.JButton();
        ochoB = new javax.swing.JButton();
        nueveB = new javax.swing.JButton();
        menosB = new javax.swing.JButton();
        sieteB = new javax.swing.JButton();
        cincoB = new javax.swing.JButton();
        seisB = new javax.swing.JButton();
        divisionB = new javax.swing.JButton();
        cuatroB = new javax.swing.JButton();
        dosB = new javax.swing.JButton();
        tresB = new javax.swing.JButton();
        multiplicacionB = new javax.swing.JButton();
        unoB = new javax.swing.JButton();
        puntoB = new javax.swing.JButton();
        masB = new javax.swing.JButton();
        igualB = new javax.swing.JButton();
        ceroB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraTF.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        parAviertoB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        parAviertoB.setText("(");
        parAviertoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parAviertoBActionPerformed(evt);
            }
        });

        ParCerradoB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ParCerradoB.setText(")");
        ParCerradoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParCerradoBActionPerformed(evt);
            }
        });

        negativoB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        negativoB.setText("+/-");
        negativoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativoBActionPerformed(evt);
            }
        });

        delB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delB.setText("Del");
        delB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBActionPerformed(evt);
            }
        });

        acB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        acB.setText("AC");
        acB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acBActionPerformed(evt);
            }
        });

        ochoB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ochoB.setText("8");
        ochoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoBActionPerformed(evt);
            }
        });

        nueveB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nueveB.setText("9");
        nueveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveBActionPerformed(evt);
            }
        });

        menosB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        menosB.setText("-");
        menosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosBActionPerformed(evt);
            }
        });

        sieteB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sieteB.setText("7");
        sieteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteBActionPerformed(evt);
            }
        });

        cincoB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cincoB.setText("5");
        cincoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoBActionPerformed(evt);
            }
        });

        seisB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        seisB.setText("6");
        seisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisBActionPerformed(evt);
            }
        });

        divisionB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        divisionB.setText("/");
        divisionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionBActionPerformed(evt);
            }
        });

        cuatroB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cuatroB.setText("4");
        cuatroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroBActionPerformed(evt);
            }
        });

        dosB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dosB.setText("2");
        dosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosBActionPerformed(evt);
            }
        });

        tresB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tresB.setText("3");
        tresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresBActionPerformed(evt);
            }
        });

        multiplicacionB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        multiplicacionB.setText("*");
        multiplicacionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionBActionPerformed(evt);
            }
        });

        unoB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        unoB.setText("1");
        unoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoBActionPerformed(evt);
            }
        });

        puntoB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        puntoB.setText(".");
        puntoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoBActionPerformed(evt);
            }
        });

        masB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        masB.setText("+");
        masB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masBActionPerformed(evt);
            }
        });

        igualB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        igualB.setText("=");
        igualB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualBActionPerformed(evt);
            }
        });

        ceroB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ceroB.setText("0");
        ceroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ceroB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(puntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(igualB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(masB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unoB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dosB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tresB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(multiplicacionB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cuatroB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cincoB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(seisB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(divisionB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(barraTF)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(parAviertoB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sieteB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ochoB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nueveB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(menosB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ParCerradoB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(negativoB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(acB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(delB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(barraTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acB))
                    .addComponent(negativoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ParCerradoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parAviertoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ochoB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(nueveB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(menosB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(sieteB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cincoB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(seisB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(divisionB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(cuatroB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(tresB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(multiplicacionB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(unoB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntoB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(masB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(igualB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(ceroB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ochoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoBActionPerformed
        // TODO add your handling code here:
        setBarra("8");
    }//GEN-LAST:event_ochoBActionPerformed
   
    private void nueveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveBActionPerformed
        // TODO add your handling code here:
        setBarra("9");
    }//GEN-LAST:event_nueveBActionPerformed

    private void menosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosBActionPerformed
        // TODO add your handling code here:
        setBarra("-");
    }//GEN-LAST:event_menosBActionPerformed
    
    private void sieteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteBActionPerformed
        // TODO add your handling code here:
        setBarra("7");
    }//GEN-LAST:event_sieteBActionPerformed
    
    private void cincoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoBActionPerformed
        // TODO add your handling code here:
        setBarra("5");
    }//GEN-LAST:event_cincoBActionPerformed
    
    private void seisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisBActionPerformed
        // TODO add your handling code here:
        setBarra("6");
    }//GEN-LAST:event_seisBActionPerformed
   
    private void divisionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionBActionPerformed
        // TODO add your handling code here:
        setBarra("/");
    }//GEN-LAST:event_divisionBActionPerformed
  
    private void cuatroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroBActionPerformed
        // TODO add your handling code here:
        setBarra("4");
    }//GEN-LAST:event_cuatroBActionPerformed
    
    private void dosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosBActionPerformed
        // TODO add your handling code here:
        setBarra("2");
    }//GEN-LAST:event_dosBActionPerformed
  
    private void tresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresBActionPerformed
        // TODO add your handling code here:
        setBarra("3");
    }//GEN-LAST:event_tresBActionPerformed
    
    private void multiplicacionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionBActionPerformed
        // TODO add your handling code here:
        setBarra("*");
    }//GEN-LAST:event_multiplicacionBActionPerformed
   
    private void unoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoBActionPerformed
        // TODO add your handling code here:
        setBarra("1");
    }//GEN-LAST:event_unoBActionPerformed
   
    private void puntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoBActionPerformed
        // TODO add your handling code here:
        setBarra(".");
    }//GEN-LAST:event_puntoBActionPerformed
    
    private void masBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masBActionPerformed
        // TODO add your handling code here:
        setBarra("+");
    }//GEN-LAST:event_masBActionPerformed
   
    private void igualBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualBActionPerformed
        // TODO add your handling code here:
        Calculadora c1 = new Calculadora(texto);
        if(!c1.iniciaMal() || !c1.operadoresRepetidos() || !c1.revParentesis()){
            barraTF.setText("ERROR");
        } else{
            try{
            texto = "" + c1.resuelve(c1.postfijo());
            barraTF.setText(texto);
            } catch(Exception e){
                texto = "";
                barraTF.setText("ERROR");
            }
        }
        
            
    }//GEN-LAST:event_igualBActionPerformed
    
    private void ceroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroBActionPerformed
        // TODO add your handling code here:
        setBarra("0");
    }//GEN-LAST:event_ceroBActionPerformed
   
    private void delBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBActionPerformed
        // TODO add your handling code here:
        if(texto.length() != 0){
            texto = texto.substring(0, texto.length()-1);
            barraTF.setText(texto);
        }
    }//GEN-LAST:event_delBActionPerformed
    
    private void acBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acBActionPerformed
        // TODO add your handling code here:
        texto = "";
        barraTF.setText(texto);
    }//GEN-LAST:event_acBActionPerformed
    
    private void negativoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativoBActionPerformed
        // TODO add your handling code here:
        int i = texto.length() - 1;
        boolean logrado = false;
        String primeraParte = "";
        String ultimaParte = "";
        while(i > 0 && !logrado){
            switch (texto.charAt(i)) {
                case '+':
                    {
                        primeraParte = texto.substring(0, i);
                        ultimaParte = texto.substring(i + 1, texto.length());
                        texto = "";
                        texto = primeraParte + "-" + ultimaParte;
                        logrado = true;
                        break;
                    }
                case '-':
                    {
                        if(texto.charAt(i-1) == '/' || texto.charAt(i-1) == '*' || texto.charAt(i-1) == '('){
                            if(texto.charAt(i-1) == '('){
                                primeraParte = texto.substring(0, i - 1);
                                ultimaParte = texto.substring(i + 1, texto.length() - 1);
                            }else{
                                primeraParte = texto.substring(0, i);
                                ultimaParte = texto.substring(i + 1, texto.length());
                            }
                            texto = "";
                            texto = primeraParte + ultimaParte;
                            logrado = true;
                            break;
                        }
                        primeraParte = texto.substring(0, i);
                        ultimaParte = texto.substring(i + 1, texto.length());
                        texto = "";
                        texto = primeraParte + "+" + ultimaParte;
                        logrado = true;
                        break;
                    }
                case '*':
                case '/':
                    {
                        primeraParte = texto.substring(0, i+1);
                        ultimaParte = texto.substring(i+1, texto.length());
                        texto = "";
                        texto = primeraParte + "(-" + ultimaParte + ")";
                        logrado = true;
                        break;
                    }
                default:
                    break;
            }
            i--;
        }
        if(!logrado && i == 0){
            if(texto.charAt(0) != '-'){
                texto = "(-" + texto + ")";
            }else{
                texto = texto.substring(1, texto.length());
            }
        }
        barraTF.setText(texto);
    }//GEN-LAST:event_negativoBActionPerformed

    private void parAviertoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parAviertoBActionPerformed
        // TODO add your handling code here:
        setBarra("(");
    }//GEN-LAST:event_parAviertoBActionPerformed

    private void ParCerradoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParCerradoBActionPerformed
        // TODO add your handling code here:
        setBarra(")");
    }//GEN-LAST:event_ParCerradoBActionPerformed

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
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ParCerradoB;
    private javax.swing.JButton acB;
    private javax.swing.JTextField barraTF;
    private javax.swing.JButton ceroB;
    private javax.swing.JButton cincoB;
    private javax.swing.JButton cuatroB;
    private javax.swing.JButton delB;
    private javax.swing.JButton divisionB;
    private javax.swing.JButton dosB;
    private javax.swing.JButton igualB;
    private javax.swing.JButton masB;
    private javax.swing.JButton menosB;
    private javax.swing.JButton multiplicacionB;
    private javax.swing.JButton negativoB;
    private javax.swing.JButton nueveB;
    private javax.swing.JButton ochoB;
    private javax.swing.JButton parAviertoB;
    private javax.swing.JButton puntoB;
    private javax.swing.JButton seisB;
    private javax.swing.JButton sieteB;
    private javax.swing.JButton tresB;
    private javax.swing.JButton unoB;
    // End of variables declaration//GEN-END:variables
}
