package br.com.agendajdbc.principal;

import br.com.agendajdbc.dao.ContatoDao;

public class DeletarContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContatoDao dao = new ContatoDao();		
		dao.deletaRegistro(5);


	}

}
