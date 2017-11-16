package br.com.fabricadeprogramador.dao;

import br.com.fabricadeprogramador.model.Usuario;

public interface IUsuarioDAO {
	
	public void cadastrar(Usuario usuario);
	public void alterar(Usuario usuario);
	public void excluir(Usuario usuario);
}
