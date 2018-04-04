/*
 * The purpose of this program is to inform the user of the 5 categories of 
 * hurricanes based on their input 
 */

/**
 * April 4, 2018
 * @author seden0957
 */
public class DisplayPanel extends javax.swing.JFrame {

    /**
     * Creates new form DisplayPanel
     */
    public DisplayPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Display = new javax.swing.JPanel();
        hurricaneScale = new javax.swing.JLabel();
        hurricaneCategoryLabel = new javax.swing.JLabel();
        categoryInput = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hurricaneScale.setText("Hurricane Scale");

        hurricaneCategoryLabel.setText("Enter hurricane category (1-5):");

        categoryInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        categoryInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryInputActionPerformed(evt);
            }
        });

        enterButton.setText("Select");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout DisplayLayout = new javax.swing.GroupLayout(Display);
        Display.setLayout(DisplayLayout);
        DisplayLayout.setHorizontalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DisplayLayout.createSequentialGroup()
                        .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hurricaneScale)
                            .addComponent(hurricaneCategoryLabel))
                        .addGap(18, 18, 18)
                        .addComponent(categoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enterButton)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        DisplayLayout.setVerticalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(hurricaneScale)
                .addGap(34, 34, 34)
                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hurricaneCategoryLabel)
                    .addComponent(categoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryInputActionPerformed
      
    }//GEN-LAST:event_categoryInputActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
         int category;
       category = Integer.parseInt(categoryInput.getText()); //extracting the users input
        switch(category)
        {
            case 1:
                outputLabel.setText("Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr"); //Each case represents which category it is 
                break;
            case 2:
                outputLabel.setText("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr");
                break;
            case 3:
                outputLabel.setText("Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr");
                break;
            case 4:
                outputLabel.setText("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr");
                break;
            case 5:
                outputLabel.setText("Category 5: greater than 155 mph or 135 kt or 249 km/hr.");
                break;
            default:
                outputLabel.setText("That is not a category of a hurricane.");
                break;
        }
    }//GEN-LAST:event_enterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display;
    private javax.swing.JTextField categoryInput;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel hurricaneCategoryLabel;
    private javax.swing.JLabel hurricaneScale;
    private javax.swing.JLabel outputLabel;
    // End of variables declaration//GEN-END:variables
}
