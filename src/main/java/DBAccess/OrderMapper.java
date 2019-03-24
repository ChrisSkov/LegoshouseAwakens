/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import java.util.ArrayList;

/**
 *
 * @author stoff
 */

public interface OrderMapper
{
    public void saveOrder(Order order);
    
    public Order getOrder(int id);
    
    public Order getOrderWithDetails(int id);
    
    public ArrayList<Order> getAllOrdersByUserID(int id);
}
