/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.*;
/**
 *
 * @author CLAUDIO
 */
public class ExecuteSQL {
    
    protected Connection con;
    
    public ExecuteSQL(Connection con){
        setCon(con);
    }
    
    public Connection getCon(){
        return con;
    }
    
    public void setCon(Connection con){
        this.con = con;
    }
}
