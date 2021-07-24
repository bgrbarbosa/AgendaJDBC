package br.com.agendajdbc.classes;

public class Contatos {

	private int id_contato;
	private String nm_contato;
	private String tel_contato;
	private String cel_contato;
	private String email_contato;
	
	public Contatos() {
		
	}
	
	public Contatos(int id_contato, String nm_contato, String tel_contato, String cel_contato, String email_contato) {
		super();
		this.id_contato = id_contato;
		this.nm_contato = nm_contato;
		this.tel_contato = tel_contato;
		this.cel_contato = cel_contato;
		this.email_contato = email_contato;
	}

	public int getId_contato() {
		return id_contato;
	}

	public void setId_contato(int id_contato) {
		this.id_contato = id_contato;
	}

	public String getNm_contato() {
		return nm_contato;
	}

	public void setNm_contato(String nm_contato) {
		this.nm_contato = nm_contato;
	}

	public String getTel_contato() {
		return tel_contato;
	}

	public void setTel_contato(String tel_contato) {
		this.tel_contato = tel_contato;
	}

	public String getCel_contato() {
		return cel_contato;
	}

	public void setCel_contato(String cel_contato) {
		this.cel_contato = cel_contato;
	}

	public String getEmail_contato() {
		return email_contato;
	}

	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}
	
	
	
}
