package composicao;

public class Marca {
	
	private String nomeMarca;
	private Empresa empresa;
	
	public Marca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	
	public String getNomeMarca() {
		return nomeMarca;
	}
	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
