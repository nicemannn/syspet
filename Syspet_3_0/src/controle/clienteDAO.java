/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Cliente;
import visao.login;

/**
 *
 * @author Bad Block
 */
public class clienteDAO extends ExecuteSQL {

    public clienteDAO(Connection con) {
        super(con);
    }

    
    
    public void logar(String nome, String senha){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
       String sql = "select * from cliente where email_Cliente=? AND senha_Cliente=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            if(rs.next()){
            String perfil = rs.getString(2);
            if(perfil.equals("admin")){
               //telaLogin.setVisible(true);
                //dispose();
               JOptionPane.showMessageDialog(null, "Seja bem vindo admin");
           }else{
               login telaLogin = new login();
               //telaLogin.setVisible(true);
               telaLogin.dispose();
               JOptionPane.showMessageDialog(null, "Usuário correto, seja bem vindo " + nome);
           }            
            }else{
            JOptionPane.showMessageDialog(null, "Usuário inválido");
            }        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }
}

