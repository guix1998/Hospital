package Interface;
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        f_Principal = new javax.swing.JDesktopPane();
        BarraMenu = new javax.swing.JMenuBar();
        b_Arquivos = new javax.swing.JMenu();
        b_CFuncionario = new javax.swing.JMenuItem();
        b_CPaciente = new javax.swing.JMenuItem();
        b_Sair = new javax.swing.JMenuItem();
        b_Controle = new javax.swing.JMenu();
        b_Ferramentas = new javax.swing.JMenu();
        b_Ajuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital");
        getContentPane().setLayout(null);

        javax.swing.GroupLayout f_PrincipalLayout = new javax.swing.GroupLayout(f_Principal);
        f_Principal.setLayout(f_PrincipalLayout);
        f_PrincipalLayout.setHorizontalGroup(
            f_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        f_PrincipalLayout.setVerticalGroup(
            f_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(f_Principal);
        f_Principal.setBounds(0, 0, 650, 400);

        b_Arquivos.setText("Arquivos");

        b_CFuncionario.setText("Cadastrar Funcionario");
        b_CFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_CFuncionarioActionPerformed(evt);
            }
        });
        b_Arquivos.add(b_CFuncionario);

        b_CPaciente.setText("Cadastrar Paciente");
        b_CPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_CPacienteActionPerformed(evt);
            }
        });
        b_Arquivos.add(b_CPaciente);

        b_Sair.setText("Sair");
        b_Arquivos.add(b_Sair);

        BarraMenu.add(b_Arquivos);

        b_Controle.setText("Controle");
        BarraMenu.add(b_Controle);

        b_Ferramentas.setText("Ferramentas");
        BarraMenu.add(b_Ferramentas);

        b_Ajuda.setText("Ajuda");
        BarraMenu.add(b_Ajuda);

        setJMenuBar(BarraMenu);

        setSize(new java.awt.Dimension(659, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_CPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_CPacienteActionPerformed
        CadastroPaciente obj=new CadastroPaciente();
        f_Principal.add(obj);
        obj.setVisible(true);
        
    }//GEN-LAST:event_b_CPacienteActionPerformed

    private void b_CFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_CFuncionarioActionPerformed
        CadastroFuncionario obj=new CadastroFuncionario();
        f_Principal.add(obj);
        obj.setVisible(true);
        
    }//GEN-LAST:event_b_CFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu b_Ajuda;
    private javax.swing.JMenu b_Arquivos;
    private javax.swing.JMenuItem b_CFuncionario;
    private javax.swing.JMenuItem b_CPaciente;
    private javax.swing.JMenu b_Controle;
    private javax.swing.JMenu b_Ferramentas;
    private javax.swing.JMenuItem b_Sair;
    private javax.swing.JDesktopPane f_Principal;
    // End of variables declaration//GEN-END:variables
}
