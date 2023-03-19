package classes;

import forms.Form1;

public class teste extends javax.swing.JFrame {

    private static teste main;
    private final UndoRedo<MasterForm> forms = new UndoRedo<>();
    
    public static teste getMain() {
        return main;
    }
    
    public void showForm(MasterForm form) {
        forms.add(form);
        body.removeAll();
        body.add(form);
        body.revalidate();
        body.repaint();
        checkButton();
    }
    
    public void undo() {
        body.removeAll();
        body.add(forms.undo());
        body.revalidate();
        body.repaint();
        checkButton();
    }
    
    public void redo() {
        body.removeAll();
        body.add(forms.redo());
        body.revalidate();
        body.repaint();
        checkButton();
    }
    
    public void refresh() {
        MasterForm form = forms.getCurrent();
        if(form != null){
            form.formRefresh();
        }
    }
    
    public teste() {
        initComponents();
        //inicia Form1
        showForm(new Form1 ());
    }
    
    private void checkButton(){
        cmdUndo.setEnabled(forms.isUndoAble());
        cmdRedo.setEnabled(forms.isRedoAble());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        header = new javax.swing.JPanel();
        cmdRedo = new javax.swing.JButton();
        cmdUndo = new javax.swing.JButton();
        cmdRefresh = new javax.swing.JButton();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdRedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/redo.png"))); // NOI18N
        cmdRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRedoActionPerformed(evt);
            }
        });

        cmdUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/undo.png"))); // NOI18N
        cmdUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUndoActionPerformed(evt);
            }
        });

        cmdRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        cmdRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cmdUndo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdRedo)
                .addContainerGap(655, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmdRedo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cmdRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cmdUndo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void cmdUndoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        undo();
    }                                       

    private void cmdRefreshActionPerformed(java.awt.event.ActionEvent evt) {                                           
        refresh();
    }                                          

    private void cmdRedoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        redo();
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
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                main = new teste();
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel body;
    private javax.swing.JButton cmdRedo;
    private javax.swing.JButton cmdRefresh;
    private javax.swing.JButton cmdUndo;
    private javax.swing.JPanel header;
    // End of variables declaration                   

}
