package aula08_05.Associacao.pessoa.veiculo;

import java.util.ArrayList;

public class Pessoa {
	private String cpf;
	private String nome;
	private ArrayList<Veiculo> veiculos = new ArrayList();
	private ArrayList <Endereco> enderecos = new ArrayList();
	public Pessoa(String cpf,String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setEndereco(Endereco ender) {
		this.enderecos.add(ender);
	}
	public ArrayList <Endereco> getEndereco(){
		return enderecos;
		
	}
	public void adicionarCarro(Veiculo ve) {
		this.veiculos.add(ve);		
	}
	public ArrayList <Veiculo> getCarro() {
		return this.veiculos;
		
	}
	

}
