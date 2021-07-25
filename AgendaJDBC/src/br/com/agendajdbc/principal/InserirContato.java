package br.com.agendajdbc.principal;

import br.com.agendajdbc.classes.Contatos;
import br.com.agendajdbc.dao.ContatoDao;

public class InserirContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contatos contato = new Contatos();
		contato.setNm_contato("Bruno Gaspar");
		contato.setTel_contato("24526434");
		contato.setCel_contato("99993294");
		contato.setEmail_contato("bgrbarbosa@oi.com.br");
		
		ContatoDao contatodao = new ContatoDao();
		contatodao.adiciona(contato);
		
	}

}
