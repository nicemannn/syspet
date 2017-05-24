/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Animais;
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
    public String Inserir_Animal(Animais f){
        String sql = "INSERT INTO animais VALUES (0,?,?,?,?,?,?)";
       
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, f.getNome());
            ps.setString(2, f.getTipo());
            ps.setString(3, f.getRaca());
            ps.setString(4, f.getPeso());
            ps.setString(5, f.getTamanho());
            ps.setString(6, f.getIdade());
            
            
            if(ps.executeUpdate() > 0){
                return "Animal Cadastrado com Sucesso!";
            }else{
                return "Erro ao Cadastrar Animal!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<Animais> Listar_Animais(){
        String sql = "SELECT `id_animal`, `tipo_animal`, `raca_animal`, `tamanho_animal`, `peso_animal`, `idade_animal`, `nome_animal` FROM `animais`";
        List<Animais> lista = new ArrayList<Animais>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Animais f = new Animais();
                    f.setId(rs.getString(1));
                    f.setNome(rs.getString(7));
                    f.setRaca(rs.getString(3));
                    f.setIdade(rs.getString(6));
                    
                    lista.add(f);
                    
                }
            return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
        
    }
    
    /*public Animais Consulta_Animais(int cod){
        
        Animais f = new Animais();
         
        try {
            
            String sql = "SELECT * FROM funcionario WHERE codigo =  " + cod + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            
            if(rs != null){
                while(rs.next()){
                                      
                    f.setCod(rs.getInt(1));
                    f.setNome(rs.getString(2));
                    f.setLogin(rs.getString(3));
                    f.setSenha(rs.getString(4));
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if(f.getCod() == cod){
            JOptionPane.showMessageDialog(null, "Funcionário encontrado com sucesso!");
        }else{
        JOptionPane.showMessageDialog(null, "Funcionário Não encontrado com sucesso!");    
        }
        return f;
    }
*/
}