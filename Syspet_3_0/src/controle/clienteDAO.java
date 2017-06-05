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
import visao.home;
import visao.login;

/**
 *
 * @author Bad Block
 */
public class clienteDAO extends ExecuteSQL {

    public clienteDAO(Connection con) {
        super(con);
    }

    
    
    public boolean logar(String nome, String senha){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        boolean finalResult = false;
        
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
               finalResult = true;
           }else{
               login telaLogin = new login();
               //telaLogin.setVisible(true);
               telaLogin.dispose();
               JOptionPane.showMessageDialog(null, "Usuário correto, seja bem vindo " + nome);
               finalResult = true;
           }            
            }else{
            JOptionPane.showMessageDialog(null, "Usuário inválido");
            }        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        return finalResult;
    }
    
    public String Inserir_Animal(Animais f){
        String sql = "INSERT INTO animais VALUES (0,?,?,?,?,?,?)";
       
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(6, f.getNome());
            ps.setString(1, f.getTipo());
            ps.setString(2, f.getRaca());
            ps.setString(4, f.getPeso());
            ps.setString(3, f.getTamanho());
            ps.setString(5, f.getIdade());
            
            
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
    
    public Animais Consulta_Animais(String codigo){
        
        Animais f = new Animais();
         
        try {
            
            String sql = "SELECT * FROM animais WHERE codigo =  " + codigo + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            
            if(rs != null){
                while(rs.next()){
                                      
                    f.setId(rs.getString(1));
                    f.setNome(rs.getString(2));
                    f.setTipo(rs.getString(3));
                    f.setRaca(rs.getString(4));
                    f.setPeso(rs.getString(5));
                    f.setTamanho(rs.getString(6));
                    f.setIdade(rs.getString(7));
                    
    
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if(f.getId().equals(codigo)){
            JOptionPane.showMessageDialog(null, "Funcionário encontrado com sucesso!");
        }else{
        JOptionPane.showMessageDialog(null, "Funcionário Não encontrado com sucesso!");    
        }
        return f;
    }

    
    public String Excluir_Animal(Animais f){
        String sql = "DELETE FROM animais WHERE id_animal = ?";
    
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, f.getId());
            
            if(ps.executeUpdate() > 0){
                return "Funcionário Excluído com Sucesso!";
                
            }else{
                return "Erro ao Excluir!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    
    }
    public void Alterar_Animais(Animais f){
        String sql = "UPDATE animais SET nome = ?, login = ?, senha = ?"
                + "WHERE codigo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, f.getNome());
            ps.setString(2, f.getLogin());
            ps.setString(3, f.getSenha());
            ps.setString(4, "" + f.getCod());
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Funcionario Atualizado com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao Atualizar o Funcionário!");
            }
        } catch (Exception e) {
           e.getMessage();
        }
    }
    
}