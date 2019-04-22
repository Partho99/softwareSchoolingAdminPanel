/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.jdbc.module;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author partho
 */
public class BlogDashBoard extends DataBaseConnection {

    public int countPosts() {

        try {
            openConnection();

            String sql = "select count(*) from contents;";

            ps = connection.prepareStatement(sql);
            resultSet = ps.executeQuery();
            
            if(resultSet.next()){
                
                int count = resultSet.getInt("count(*)");
                
                return count;
            }
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BlogDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

       return 0;
    }
    
    public int countComments(){
        
        
         try {
            openConnection();

            String sql = "select count(*) from comment;";

            ps = connection.prepareStatement(sql);
            resultSet = ps.executeQuery();
            
            if(resultSet.next()){
                
                int count = resultSet.getInt("count(*)");
                
                return count;
            }
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BlogDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int countViews(){
        
        
         try {
            openConnection();

            String sql = "select sum(views_count) from postviews;";

            ps = connection.prepareStatement(sql);
            resultSet = ps.executeQuery();
            
            if(resultSet.next()){
                
                int count = resultSet.getInt("sum(views_count)");
                
                return count;
            }
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BlogDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
