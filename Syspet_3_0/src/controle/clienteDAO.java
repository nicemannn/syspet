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

/**
 *
 * @author Bad Block
 */
public class clienteDAO extends ExecuteSQL {

    public clienteDAO(Connection con) {
        super(con);
    }
    
    public clienteDAO Consulta_cliente(Cliente email){
        
         Cliente f = new Cliente();
         
        try {
            
            String sql = "SELECT email_Cliente, senha_Cliente FROM cliente WHERE email_Cliente =  " + email + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            
            if(rs != null){
                while(rs.next()){
                                      
                    
                    f.setNome(rs.getString(2));
                    
                    f.setSenha(rs.getString(4));
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if(f.getEmail() == email){
            JOptionPane.showMessageDialog(null, "FuncionÃ¡rio encontrado com sucesso!");
        }else{
        JOptionPane.showMessageDialog(null, "FuncionÃ¡rio NÃ£o encontrado com sucesso!");    
        }
        return f;
    }
}
