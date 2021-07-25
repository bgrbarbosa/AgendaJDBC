package br.com.agendajdbc.principal;

import br.com.agendajdbc.classes.Contatos;
import br.com.agendajdbc.dao.ContatoDao;

public class ListarContatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContatoDao dao = new ContatoDao();
		for(Contatos reg : dao.listarContatos()) {
			System.out.println("-----------------------------------");
			System.out.println("Código: " + reg.getId_contato());
			System.out.println("Nome: " + reg.getNm_contato());
			System.out.println("Telefone: " + reg.getTel_contato());
			System.out.println("Celular: " + reg.getCel_contato());
			System.out.println("Email: " + reg.getEmail_contato());
			System.out.println("-----------------------------------");
		}

		
		
		


	}

}
