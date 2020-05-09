package aula08_05.Associacao.pessoa.veiculo;

public class Veiculo {
	private String placa;
	private String modelo;
	private int ano;
	public Veiculo(String placa, String modelo, int ano) {
		this.ano = ano;
		this.placa = placa;
		this.modelo =  modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getPlaca() {
		return placa;
	}

}
