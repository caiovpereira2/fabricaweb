package br.com.fabricadeprogramador.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	//criando conexao com o banco de dados com DriverManager que vai me dar o objeto
	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricawebf", "postgres", "postgres");
		} catch (SQLException e) {
			//relancando a exeption o dao nao precisa saber
			throw new RuntimeException(e);
		}
	}

}
