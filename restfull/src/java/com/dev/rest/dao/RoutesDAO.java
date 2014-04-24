/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dev.rest.dao;

import com.dev.rest.beans.Routes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Felisbino
 */
public class RoutesDAO {
    
    public boolean InserirRoutes(Routes rts) {

		Connection con = null;
		PreparedStatement pstmt = null;

		System.out.println("InserirRoutes");
		con = Conexao.getInstance().getConnection();
		System.out.println("Conectado e Preparando para Inserir");

		try {

			pstmt = con.prepareStatement("INSERT INTO tb_routes(rts_line, rts_name, rts_color, rts_stripe) VALUES (?,?,?,?)");

			pstmt.setString(1, rts.getLine());
			pstmt.setString(2, rts.getName());
                        pstmt.setString(3, rts.getColor());
                        pstmt.setString(4, rts.getStripe());
			

			pstmt.execute();
			pstmt.close();

			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}

	}
    
    
}
