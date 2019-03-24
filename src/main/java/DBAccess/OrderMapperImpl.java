/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.house;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stoff
 */
public class OrderMapperImpl implements OrderMapper{
    
    @Override
    public void saveOrder(house house) throws SQLException
    {
     try
     {
         Connection con = Connector.connection();
         con.setAutoCommit(false);
         String query = "Insert INTO 'useradmin' . 'previousorders' ('userID' VALUES(?)";
         PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
         
         
     }  catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderMapperImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
