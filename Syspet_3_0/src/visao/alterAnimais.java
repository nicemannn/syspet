/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.Conexao;
import controle.clienteDAO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import modelo.Animais;

/**
 *
 * @author Lucas Nascimento
 */
public class alterAnimais extends javax.swing.JFrame {

    /**
     * Creates new form alterAnimais
     */
    public alterAnimais() {
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

        nome = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        raca = new javax.swing.JTextField();
        peso = new javax.swing.JFormattedTextField();
        tamanho = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(nome);
        nome.setBounds(270, 140, 88, 30);
        getContentPane().add(tipo);
        tipo.setBounds(270, 180, 88, 30);

        raca.setColumns(10);
        raca.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(raca);
        raca.setBounds(270, 220, 88, 30);
        getContentPane().add(peso);
        peso.setBounds(270, 260, 88, 30);
        getContentPane().add(tamanho);
        tamanho.setBounds(270, 300, 88, 30);

        idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeActionPerformed(evt);
            }
        });
        getContentPane().add(idade);
        idade.setBounds(270, 340, 88, 30);
        getContentPane().add(cod);
        cod.setBounds(270, 100, 90, 30);

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 100, 90, 30);

        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 380, 90, 30);

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 0));
        jLabel15.setText("Idade:");
        jLabel15.setToolTipText("");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(210, 333, 70, 30);

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 0));
        jLabel14.setText("Tamanho:");
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(180, 300, 90, 23);

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 0));
        jLabel13.setText("Peso:");
        jLabel13.setToolTipText("");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(220, 260, 50, 23);

        jLabel8.setBackground(new java.awt.Color(0, 204, 102));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("ALTERAR ANIMAIS");
        jLabel8.setAlignmentX(0.5F);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 0, 350, 53);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 0));
        jLabel9.setText("Código:");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 100, 70, 23);

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 0));
        jLabel12.setText("Raça:");
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(220, 220, 50, 23);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 0));
        jLabel10.setText("Tipo:");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 180, 50, 23);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Nome:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 140, 60, 23);

        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 380, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 480);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 10, 380, 370);

        setBounds(0, 0, 616, 519);
    }// </editor-fold>//GEN-END:initComponents

    private void idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String codigo = cod.getText();
        Connection con = Conexao.AbrirConexao();
        clienteDAO sql = new clienteDAO(con);
                
        if(codigo.equals("")){
            JOptionPane.showMessageDialog(null, "Digite um Código para Atualizar",
                    "Video Locadora", JOptionPane.WARNING_MESSAGE);
        }
        
        Animais f = sql.Consulta_Animais(codigo);
        
        nome.setText("");
        tipo.setText("");
        raca.setText("");
        peso.setText("");
        tamanho.setText("");
        idade.setText("");
        
        //InserirDados(cod);
     
        
        nome.setText("" + f.getNome());
        tipo.setText(f.getTipo());
        raca.setText(f.getRaca());
        peso.setText(f.getPeso());
        tamanho.setText(f.getTamanho());
        idade.setText(f.getIdade());
        
        
        Conexao.FecharConexao(con);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String codigo = cod.getText();
        
        String nomeanimal = nome.getText();
        String tipoanimal = tipo.getText();        
        String racaanimal = raca.getText();        
        String pesoanimal = peso.getText();        
        String tamanhoanimal = tamanho.getText();
        String idadeanimal = idade.getText();
        
        if(nomeanimal.equals("") || tipoanimal.equals("") || racaanimal.equals("") || pesoanimal.equals("") || pesoanimal.equals("") || idadeanimal.equals("")){
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!",
                    "Videlo Locadora", JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con = Conexao.AbrirConexao();
            clienteDAO sql = new clienteDAO(con);
            Animais f = new Animais();
            
            f.setId(codigo);
            f.setNome(nomeanimal);
            f.setTipo(tipoanimal);
            f.setRaca(racaanimal);
            f.setPeso(pesoanimal);
            f.setTamanho(tamanhoanimal);
            f.setIdade(idadeanimal);
            
            sql.Alterar_Animais(f);
            Conexao.FecharConexao(con);
            
            //cod.setText("");
            nome.setText("");
            tipo.setText("");
            raca.setText("");
            peso.setText("");
            tamanho.setText("");
            idade.setText("");
        }
            
          System.out.println(codigo + nomeanimal + tipoanimal + racaanimal + pesoanimal + tamanhoanimal + idadeanimal);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(alterAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alterAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alterAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alterAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alterAnimais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cod;
    private javax.swing.JTextField idade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nome;
    private javax.swing.JFormattedTextField peso;
    private javax.swing.JTextField raca;
    private javax.swing.JTextField tamanho;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
}
