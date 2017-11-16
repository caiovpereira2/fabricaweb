package br.com.fabricadeprogramador.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.model.Usuario;

public class UsuarioDAOImpl implements IUsuarioDAO {

	private Connection conexao = ConexaoFactory.getConnection();

	// criado string com comando sql
	// colocado 3 parametros que são as interrogacoes que são variaveis do
	// objeto usuario
	@Override
	public void cadastrar(Usuario usuario) {
		
		String sql = "insert into usuario (nome, login, senha) values(?, ?, ?)";

		// prepareStatement extensao do statement que vai substituir os pontos
		// de interrogacao
		try {

			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());// substituindo o ponto
														// de interrogacao pelo
														// dado do usuario
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			// executando o comando sql no banco
			preparador.execute();
			// fechando o preparador
			preparador.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Usuario usuario) {
		
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";

		// prepareStatement extensao do statement que vai substituir os pontos
		// de interrogacao
		try {

			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());// substituindo o ponto
														// de interrogacao pelo
														// dado do usuario
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4, usuario.getId());
			// executando o comando sql no banco
			preparador.execute();
			// fechando o preparador
			preparador.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Usuario usuario) {
		
		String sql = "delete from usuario where id=?";

		// prepareStatement extensao do statement que vai substituir os pontos
		// de interrogacao
		try {

			PreparedStatement preparador = conexao.prepareStatement(sql);
			// substituindo o ponto de interrogacao pelo dado do usuario
			preparador.setInt(1, usuario.getId());
			// executando o comando sql no banco
			preparador.execute();
			// fechando o preparador
			preparador.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
