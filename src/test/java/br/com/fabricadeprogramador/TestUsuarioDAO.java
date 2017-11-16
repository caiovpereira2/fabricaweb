package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.dao.UsuarioDAOImpl;
import br.com.fabricadeprogramador.model.Usuario;

public class TestUsuarioDAO {

	public static void main(String[] args) {

		excluir();
	}

	public static void cadastrar() {
		Usuario usuario = new Usuario();
		usuario.setNome("Caio");
		usuario.setLogin("caiovpereira");
		usuario.setSenha("12345");

		// objeto que vai levar para o bd =fzendo as manipulacoes
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		dao.cadastrar(usuario);

		System.out.println("Sucesso");
	}
	
	public static void alterar(){
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNome("Marcos Bezerra");
		usuario.setLogin("mbezerra");
		usuario.setSenha("bezerra");
		
		//alterando usuario
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		dao.alterar(usuario);
		
		System.out.println("alterado");
		
	}
	
	public static void excluir(){
		Usuario usuario = new Usuario();
		usuario.setId(3);
		
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		dao.excluir(usuario);
		
		System.out.println("Excluido");
	}

}
