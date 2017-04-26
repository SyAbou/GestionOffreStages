package gestionoffrestages;
import java.sql.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Class.forName;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


/**
 *
 * @author abou
 */
public class GestionOffreStages {
Connection con;
public GestionOffreStages(){
    try{
        Class.forName("com.mysql.jdbc.Driver");}
    catch(ClassNotFoundException e){
                                    System.err.println(e);
    }
    try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_gestionoffrestages","root","");
    }catch(SQLException e){
                            System.err.println(e);
    }
    }
    Connection obtenirconnexion(){return con;}

}
 