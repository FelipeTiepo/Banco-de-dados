package br.com.fiap.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.repository.UsuarioDAO;
import br.fiap.model.Usuario;

public class Teste {

	public static void main(String[] args) throws SQLException {
		
		UsuarioDAO dao = new UsuarioDAO();
		Usuario felipe = new Usuario(1, "Gostoso", "ftiepo20@gmail.com", "123456");
		Usuario igor = new Usuario(2, "Igor", "igor@gmail.com", "654321");
		Usuario murilo = new Usuario(3, "Murilo", "murilo@gmail.com", "223552");
		Usuario tiepo = new Usuario(4, "Tiepo", "tiepo@gmail.com", "468543");
		Usuario vitinho = new Usuario(5, "Vitinho", "vitinho@gmail.com", "204850");
		
		//dao.insert(felipe);
		//dao.insert(igor);
		//dao.insert(murilo);
		//dao.insert(tiepo);
		//dao.insert(vitinho);
		
		/*List<Usuario> lista = dao.selectAll();
		
		for(Usuario usuario: lista) {
			System.out.println("Controle: " + usuario.getId());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Email: " + usuario.getEmail());
			System.out.println("Senha: " + usuario.getSenha());
			System.out.println("Data: " + usuario.getData());
			System.out.println("-------------");	
		}
		*/
		
		
		Usuario usuarioselecionado = dao.selectById(5);
		if(usuarioselecionado!=null)
		System.out.println("nome:" + usuarioselecionado.getNome());
		else
			System.out.println("Usuario não encontrado");
		
	}

}
