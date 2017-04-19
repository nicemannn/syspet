/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Cliente;

/**
 *
 * @author Bad Block
 */
public class secretariaDAO extends ExecuteSQL{

    public secretariaDAO(Connection con) {
        super(con);
    }
    
    
    public String Inserir_Cliente(Cliente f){
        String sql = "INSERT INTO `cad`.`user` (`nome`) VALUES ('marcos');";
       
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, f.getNome());
            ps.setString(2, f.getEmail());
            ps.setString(3, f.getCPF());
            ps.setString(4, f.getTelefone());
            ps.setString(5, f.getEndereco());
            
            if(ps.executeUpdate() > 0){
                return "Cliente Cadastrado com Sucesso!";
            }else{
                return "Erro ao Cadastrar Cliente!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
