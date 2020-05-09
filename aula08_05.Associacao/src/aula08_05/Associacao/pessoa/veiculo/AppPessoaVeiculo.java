package aula08_05.Associacao.pessoa.veiculo;

import java.util.ArrayList;

public class AppPessoaVeiculo {

	public static void main(String[] args) {
		Pessoa amikel = new Pessoa("70.845.972-46","Amikel Maxi");
		
		Veiculo fiat = new Veiculo("4587-PAH","Fiat Sienna",2018);
		Veiculo gol = new Veiculo("87087-DEH","Gol Full Flex",2018);
		
		amikel.adicionarCarro(fiat);
		amikel.adicionarCarro(gol);
		System.out.println(amikel.getNome() + " tem "+ amikel.getCarro().size()+" carro (s)");
		
		Endereco casa = new Endereco("Ver. Joaquim Pereira de Castro", "239-A");
		Endereco trabalho = new Endereco("Gino Merigo", "912");
		amikel.setEndereco(casa);
		amikel.setEndereco(trabalho);
		for( int i=0; i<amikel.getEndereco().size();i+=1) {
			System.out.println("Rua "+amikel.getEndereco().get(i).getLogaduro()+", "+
								amikel.getEndereco().get(i).getNumero());
		}
		for(int i=0;i < amikel.getCarro().size();i+=1) {
			String p = amikel.getCarro().get(i).getPlaca();
			String m = amikel.getCarro().get(i).getModelo();
			int a = amikel.getCarro().get(i).getAno();
			System.out.println(i+1+"- \nModelo: "+ m +" \nPlaca: "+ p +" \nAno: "+a);
		}
	}

}
