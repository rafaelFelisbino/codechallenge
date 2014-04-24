/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dev.rest.dao;

import com.dev.rest.beans.LineDefinitions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Felisbino
 */
public class LineDefinitionsDAO {
    
    public boolean InserirLineDefinitions(LineDefinitions ldf) {

		Connection con = null;
		PreparedStatement pstmt = null;

		System.out.println("InserirLineDefinitions");
		con = Conexao.getInstance().getConnection();
		System.out.println("Conectado e Preparando para Inserir");

		try {

			pstmt = con.prepareStatement("INSERT INTO tb_linedefinitions(ldf_station1, ldf_station2, ldf_line) VALUES (?,?,?)");

			pstmt.setInt(1, ldf.getStation1());
			pstmt.setInt(2, ldf.getStation2());
                        pstmt.setInt(3, ldf.getLine());
			

			pstmt.execute();
			pstmt.close();

			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}

	}
    
}
