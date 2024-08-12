/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pgt_javesalud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lina María Sáenz
 */


public class PGT_Javesalud {

    public static void main(String[] args) {
        
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/pgtjavesalud 1.0";
        Connection conexion = null;
        Statement statement;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PGT_Javesalud.class.getName()).log(Level.SEVERE, null, ex);
        }
    
            //REGISTRO DE PACIENTES
            
            try {
            conexion = DriverManager.getConnection(url,usuario,password);
//                statement = conexion.createStatement();
//                statement.executeUpdate("INSERT INTO REGISTRO_PACIENTE(ID_PACIENTE,TIPO_DOCUMENTO,PRIMER_NOMBRE,SEGUNDO_NOMBRE,PRIMER_APELLIDO,SEGUNDO_APELLIDO,FECHA_NACIMIENTO,EMAIL,NUM_TELEFONICO) VALUES('00033','CC','LILIANA','MARIA','OTALORA','DIAZ','1980-01-12','PRE@HOTMAIL.COM','6677')");
//                rs = statement.executeQuery("SELECT * FROM registro_paciente");
//                rs.next();
//                do {
//                    System.out.println(rs.getInt("id_paciente")+" : "+rs.getString("tipo_documento")+" : "+rs.getString("primer_nombre")+" : "+rs.getString("segundo_nombre")+" : "+rs.getString("primer_apellido")+" : "+rs.getString("segundo_apellido")+" : "+rs.getString("fecha_nacimiento")+" : "+rs.getString("email")+" : "+rs.getString("num_telefonico"));
//                    }while (rs.next());
//
//REGISTRO DE EMPLEADOS
           
//              statement = conexion.createStatement();
//                statement.executeUpdate("INSERT INTO REGISTRO_EMPLEADOS(ID_EMPLEADO,TIPO_DOCUMENTO,PRIMER_NOMBRE,SEGUNDO_NOMBRE,PRIMER_APELLIDO,SEGUNDO_APELLIDO,ROL,EMAIL,TIPO_PERMISO,CONTRASEÑA) VALUES('1018494272','CC','LINA','','SAENZ','LOPEZ','SISTEMAS','ADMIN@JAVE.COM','ADMINISTRADOR','1qazVFR4*')");
//                rs = statement.executeQuery("SELECT * FROM REGISTRO EMPLEADOS");
//                rs.next();
//                do {
//                    System.out.println(rs.getInt("id_empleado")+" : "+rs.getString("tipo_documento")+" : "+rs.getString("primer_nombre")+" : "+rs.getString("segundo_nombre")+" : "+rs.getString("primer_apellido")+" : "+rs.getString("segundo_apellido")+" : "+rs.getString("rol")+" : "+rs.getString("email")+" : "+rs.getString("tipo_permiso")+" : "+rs.getString("contraseña"));
//                    }while (rs.next());
////        } catch (SQLException ex) {
////            Logger.getLogger(PGT_Javesalud.class.getName()).log(Level.SEVERE, null, ex);
////        }
            
                
          //INGRESO PACIENTES
          
                //conexion = DriverManager.getConnection(url,usuario,password);
//           statement = conexion.createStatement();
//                statement.executeUpdate("INSERT INTO INGRESO_PACIENTES(ID_PACIENTE,CONTRASEÑA) VALUES('101235189','48ujKILJ**')");
//                rs = statement.executeQuery("SELECT * FROM INGRESO_PACIENTES");
//                rs.next();
//                do {
//                    System.out.println(rs.getInt("id_paciente")+" : "+rs.getString("contraseña"));
//                    }while (rs.next());
                        
                
                
           //INGRESO ASESORES
           
           
//           statement = conexion.createStatement();
//                statement.executeUpdate("INSERT INTO INGRESO_ASESOR(ID_EMPLEADO,CONTRASEÑA) VALUES('11112000','conTRAE00/')");
//                rs = statement.executeQuery("SELECT * FROM INGRESO_ASESOR");
//                rs.next();
//                do {
//                    System.out.println(rs.getInt("id_empleado")+" : "+rs.getString("contraseña"));
//                    }while (rs.next());
                
                // INGRESO ADMINISTRADOR
                
               statement = conexion.createStatement();
                statement.executeUpdate("INSERT INTO INGRESO_ADMINISTRADOR(ID_EMPLEADO,CONTRASEÑA) VALUES('11112000','conTRAE00/')");
                rs = statement.executeQuery("SELECT * FROM INGRESO_ADMINISTRADOR");
                rs.next();
                do {
                    System.out.println(rs.getInt("id_empleado")+" : "+rs.getString("contraseña"));
                    }while (rs.next());
//                
                //ACTUALIZACIÓN DATOS
                
//                 statement = conexion.createStatement();
//                statement.executeUpdate("UPDATE `ingreso_administrador` SET `id_empleado` = '333444555', `contraseña` = 'PRUEBa2023$' WHERE `ingreso_administrador`.`id_empleado` = 7888999;");
//                rs = statement.executeQuery("SELECT * FROM INGRESO_ADMINISTRADOR");
//                rs.next();
//                do {
//                    System.out.println(rs.getInt("id_empleado")+" : "+rs.getString("contraseña"));
//                    }while (rs.next());
                
                
                //ELIMINACIÓN O Borrado de Datos
                
                
////                  statement = conexion.createStatement();
////                statement.executeUpdate("DELETE FROM ingreso_administrador WHERE `ingreso_administrador`.`id_empleado` = 11112000;");
////                rs = statement.executeQuery("SELECT * FROM INGRESO_ADMINISTRADOR");
////                rs.next();
////                do {
////                    System.out.println(rs.getInt("id_empleado")+" : "+rs.getString("contraseña"));
////                    }while (rs.next());
////                
            } catch (SQLException ex) {
                Logger.getLogger(PGT_Javesalud.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
