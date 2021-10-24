package Codigo;

public class Exame {
	private String tipoExame;
	private String nomeExame;

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}
	public String getNomeExame() {
		return nomeExame;
	}
	public String getTipoExame() {
		return tipoExame;
	}

	public Exame (String tipoExame, String nomeExame){
		setNomeExame(nomeExame);
		setTipoExame(tipoExame);
	}
}
