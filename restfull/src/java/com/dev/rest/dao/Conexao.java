/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dev.rest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felisbino
 */
public class Conexao {
    
    Connection con = null;
	private static Conexao instance = null;

	public Conexao() {
		loadDriver();
	}

	public static void loadDriver() {
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			System.out.println("Driver carregado com sucesso !!!!");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver nâo pode ser carregado!!!!");
		}
	}

	public static Conexao getInstance() {
		if (instance == null) {
			instance = new Conexao();
		}
		return instance;
	}

	public Connection getConnection() {
		String banco = "webservice";
		String url = "jdbc:mysql://localhost:3306/" + banco;
		try {
			System.out.println(url);
			if (con == null || con.isClosed()) {
				con = DriverManager.getConnection(url, "","");
				System.out.println("Conectado ao banco!!!!\nUsuario : " + "mySql");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}

	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
    
}
