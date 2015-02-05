import org.apache.commons.lang3.*;
import java.util.regex.*;

public class Principal extends javax.swing.JFrame
{
    public Principal()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jta_textarea = new javax.swing.JTextArea();
        lb_total_lineas = new javax.swing.JLabel();
        bt_total_lineas = new javax.swing.JButton();
        bt_mejorar = new javax.swing.JButton();
        bt_ejemplo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jta_textarea.setColumns(20);
        jta_textarea.setRows(5);
        jta_textarea.setTabSize(4);
        jScrollPane1.setViewportView(jta_textarea);

        lb_total_lineas.setText("0");

        bt_total_lineas.setText("Lineas");
        bt_total_lineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_total_lineasActionPerformed(evt);
            }
        });

        bt_mejorar.setText("Mejorar");
        bt_mejorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mejorarActionPerformed(evt);
            }
        });

        bt_ejemplo.setText("Ejemplo");
        bt_ejemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ejemploActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bt_ejemplo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_mejorar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bt_total_lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(lb_total_lineas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_total_lineas)
                            .addComponent(bt_total_lineas))
                        .addGap(25, 25, 25)
                        .addComponent(bt_ejemplo)
                        .addGap(18, 18, 18)
                        .addComponent(bt_mejorar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_total_lineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_total_lineasActionPerformed
        int lineas = jta_textarea.getLineCount();
        lb_total_lineas.setText(""+lineas);
    }//GEN-LAST:event_bt_total_lineasActionPerformed

    private void bt_mejorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mejorarActionPerformed
        String patron = "[0-9]+[%][\\t\\n\\r\\f]?";
        String cadena = StringUtils.replacePattern(jta_textarea.getText(), patron, "");
        jta_textarea.setText(cadena);
    }//GEN-LAST:event_bt_mejorarActionPerformed

    private void bt_ejemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ejemploActionPerformed
        jta_textarea.setText("android-cc4b4030204205af	192.168.0.94	D0:7A:B5:BC:F0:70	2	\n" +
"0%\n" +
"android-437bffd8306ad1c7	192.168.0.86	CC:3A:61:7C:46:EE	7	\n" +
"0%\n" +
"android_cadf013067302cfa	192.168.0.89	0C:BD:51:C3:78:F6	2	\n" +
"0%\n" +
"android-5a311b8f97ddc2f9	192.168.0.67	58:C3:8B:6F:DD:28	4	\n" +
"0%\n" +
"android-e715e27f88e57fd1	192.168.0.80	B8:64:91:7A:D3:B8	4	\n" +
"0%\n" +
"android-b66c9ba2ef3de7dd	192.168.0.81	BC:44:86:DB:15:06	2	\n" +
"0%\n" +
"android-8c7eb8eba44a66cc	192.168.0.42	00:66:4B:21:F7:64	7	\n" +
"0%\n" +
"android-2bc522c9b107be4a	192.168.0.8	9C:C1:72:3B:85:85	2	\n" +
"0%\n" +
"android-fabde1343508208d	192.168.0.12	00:66:4B:0B:08:4F	21	\n" +
"1%\n" +
"BLACKBERRY-0444	192.168.0.14	40:6F:2A:5A:A6:7F	2	\n" +
"0%\n" +
"android-8c7e61093d4e4192	192.168.0.37	98:0C:82:4C:0A:F7	7	\n" +
"0%\n" +
"android-97cbc82bf6f30aaf	192.168.0.13	68:05:71:54:FB:58	3	\n" +
"0%\n" +
"android-a3114fbf968ade23	192.168.0.77	28:CC:01:0F:B0:50	11	\n" +
"0%\n" +
"android_82a0a4a74420b9aa	192.168.0.10	C4:05:28:6B:10:1F	2	\n" +
"0%\n" +
"android-fb8570a69bdb3ce5	192.168.0.91	00:07:88:D7:8F:EB	2	\n" +
"0%\n" +
"android-5e492ce5c4a48875	192.168.0.62	10:30:47:57:94:0E	3	\n" +
"0%\n" +
"*	192.168.0.39	BC:72:B1:4A:FC:48	2	\n" +
"0%\n" +
"android-203ee77eae1b2493	192.168.0.82	84:38:38:0E:8F:5A	8	\n" +
"0%\n" +
"android-e200ff22eb360dba	192.168.0.58	E4:32:CB:EE:33:22	6	\n" +
"0%\n" +
"android-d4b393a6f4f59c82	192.168.0.33	D0:C1:B1:28:70:93	15	\n" +
"0%\n" +
"android-ffe3a0ce5dd84e41	192.168.0.73	20:6E:9C:41:54:E5	6	\n" +
"0%\n" +
"SuperDell	192.168.0.27	50:3F:56:00:FB:88	120	\n" +
"3%\n" +
"Angela	192.168.0.72	70:73:CB:00:DF:DA	2	\n" +
"0%\n" +
"android-b3c4f2c6452a7a94	192.168.0.56	0C:BD:51:71:E5:87	7	\n" +
"0%\n" +
"android-e1d89b0618c2ec7f	192.168.0.98	3C:DF:BD:46:34:CC	25	\n" +
"1%\n" +
"*	192.168.0.78	D0:DB:32:09:A9:DD	1	\n" +
"0%\n" +
"machina	192.168.0.44	00:E0:7D:FB:B9:CF	6	\n" +
"0%");
    }//GEN-LAST:event_bt_ejemploActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() ->{
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ejemplo;
    private javax.swing.JButton bt_mejorar;
    private javax.swing.JButton bt_total_lineas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta_textarea;
    private javax.swing.JLabel lb_total_lineas;
    // End of variables declaration//GEN-END:variables
}
