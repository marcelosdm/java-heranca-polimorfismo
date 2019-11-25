package com.bank.heranca;

public class Gerente extends Funcionario {
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	private boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	
}
