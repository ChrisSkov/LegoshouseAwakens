/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.User;
import FunctionLayer.house;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stoff
 */
public class OrderMapper {
        public static void createOrder(User user, house house) throws SQLException, ClassNotFoundException {
            try {
                Connector connect = new Connector();

                String addOrder
                        = "INSERT INTO legoDB.Orders (`id`, `length`, `width`, 'heigth') "
                        + "VALUES(?,?,?,?);";

                PreparedStatement ps = connect.connection().prepareStatement(addOrder);
                ps.setInt(1, user.getId());
                ps.setInt(2, house.getLength());
                ps.setInt(3, house.getWidth());
                ps.setInt(4, house.getHeight());
                
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    /**
     * getOrders returns all orders from one user.
     * @param user
     * @return 
     */
    public static List<Order> getOrders(User user) {
        List<Order> orders = new ArrayList<>();
        
        
        
        return orders;
    }
}
