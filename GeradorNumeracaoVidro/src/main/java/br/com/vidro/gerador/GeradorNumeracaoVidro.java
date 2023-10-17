package br.com.vidro.gerador;

public class GeradorNumeracaoVidro {
	
	
	public String geraNumeracao(String numeroChassi) {
		
		String numero = "123456789";
		
		String VIN = "";
		
		String[] split = numeroChassi.split("");
		
		System.out.println(split[numeroChassi.length()-1]);
		
		for (int i = numeroChassi.length()-1; i >= numeroChassi.length() - 7; i--) {
			
			VIN = split[i] + VIN;
		
		} 
		
		
		return numero + VIN;
		
	}
	
	public static void main(String[] args) {
		System.out.println(new GeradorNumeracaoVidro().geraNumeracao("LVVDA11A75D029813"));
	}
	
}
