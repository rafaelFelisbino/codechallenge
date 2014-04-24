/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dev.rest.dao;
import com.dev.rest.beans.Stations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Felisbino
 */
public class StationsDAO {
    public boolean InserirStations(Stations sts) {

		Connection con = null;
		PreparedStatement pstmt = null;

		System.out.println("InserirStations");
		con = Conexao.getInstance().getConnection();
		System.out.println("Conectado e Preparando para Inserir");

		try {

			pstmt = con.prepareStatement("INSERT INTO tb_stations(sts_id, sts_latitude, sts_longitude, sts_name, sts_displayName, sts_zone, sts_totalLines, sts_rail) VALUES (?,?,?,?,?,?,?,?)");

			pstmt.setString(1, sts.getId());
			pstmt.setString(2, sts.getLatitude());
                        pstmt.setString(3, sts.getLongitude());
                        pstmt.setString(4, sts.getName());
                        pstmt.setString(5, sts.getDisplay_name());
                        pstmt.setString(6, sts.getZone());
                        pstmt.setString(7, sts.getTotal_lines());
                        pstmt.setString(8, sts.getRail());
			

			pstmt.execute();
			pstmt.close();

			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}

	}
    
}
