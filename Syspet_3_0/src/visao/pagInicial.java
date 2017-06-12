/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.Conexao;
import controle.secretariaDAO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author Bad Block
 */
public class pagInicial extends javax.swing.JFrame {

    /**
     * Creates new form pagInicial
     */
    public pagInicial() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        cpassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        celular = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel7.setText("jLabel7");

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 204, 102));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("CADASTRAR");
        jLabel1.setAlignmentX(0.5F);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 30, 220, 53);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Nome:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 110, 50, 23);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome);
        nome.setBounds(260, 110, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("Senha:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 230, 53, 23);

        jToggleButton1.setText("ENVIAR ");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(170, 410, 120, 30);

        jToggleButton2.setText("CANCELAR");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(300, 410, 120, 30);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(260, 230, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("Confirmar senha:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 270, 144, 32);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 0));
        jLabel9.setText("Email:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(210, 150, 45, 23);
        getContentPane().add(email);
        email.setBounds(260, 150, 130, 30);
        getContentPane().add(cpassword);
        cpassword.setBounds(260, 270, 130, 30);

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 0));
        jLabel13.setText("CPF:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(210, 190, 35, 23);

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setText("     .       .       -  ");
        cpf.setToolTipText("");
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });
        getContentPane().add(cpf);
        cpf.setBounds(260, 190, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("Celular:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 310, 61, 23);
        getContentPane().add(celular);
        celular.setBounds(260, 310, 130, 30);

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 0));
        jLabel12.setText("Endereço:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(170, 350, 78, 23);

        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });
        getContentPane().add(endereco);
        endereco.setBounds(260, 350, 130, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 580, 480);

        setBounds(0, 0, 597, 519);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        String nomecliente = nome.getText();
        String celularcliente = celular.getText();        
        String enderecocliente = endereco.getText();        
        String cpfcliente = cpf.getText();        
        String senhacliente = password.getText();
        String csenhacliente = cpassword.getText();
        String emailcliente = email.getText();

        
        if(nome.equals("") || password.equals("") || cpassword.equals("")){
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!", "sispet", JOptionPane.WARNING_MESSAGE);
        }else{
          
            Connection con = Conexao.AbrirConexao();
            secretariaDAO sql = new secretariaDAO(con);
           
            Cliente f = new Cliente();
            
            f.setNome(nomecliente);
            f.setTelefone(celularcliente);
            f.setEndereco(enderecocliente);
            f.setCPF(cpfcliente);
            f.setSenha(senhacliente);            
            f.setEmail(emailcliente);

            
            sql.Inserir_Cliente(f);
            Conexao.FecharConexao(con);
            
            nome.setText("");
            password.setText("");
            cpassword.setText("");
            
            JOptionPane.showMessageDialog(null, "Cadastro Realizado ","sispet2", JOptionPane.INFORMATION_MESSAGE );
            dispose();
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(pagInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField celular;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField nome;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
