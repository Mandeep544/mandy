/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Mandeep Kaur
 */
@Path("k")
public class mm {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of mm
     */
    public mm() {
    }

    /**
     * Retrieves representation of an instance of m.mm
     * @return an instance of java.lang.String
     */
  
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() throws ClassNotFoundException{
       
         ResultSet rs=null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
              Connection con = DriverManager.getConnection("jdbc:mysql://198.71.227.97:3306/cpl", "mahesh", "eQa2j#78");
              
     
        } catch (SQLException ex) {
           System.out.println("SQLException: " + ex.getMessage());
           System.out.println("SQLState: " + ex.getSQLState());
           System.out.println("VendorError: " + ex.getErrorCode());
           
        } catch (InstantiationException ex) {
            Logger.getLogger(mm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(mm.class.getName()).log(Level.SEVERE, null, ex);
        }
       return  rs.toString();
             
    }

}
