package com.bank.heranca.testa;

import com.bank.heranca.Gerente;

public class TestaGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Vinícius");
		gerente.setSenha(1234);
		
		System.out.println(String.format("Gerente %s, sua senha foi definida com sucesso!", gerente.getNome()));
		
		gerente.setSalario(8000);
		System.out.println(gerente.getBonificacao());
	}

}
