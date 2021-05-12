package br.com.victor.heranca;

public class Cachorro extends Animal {
	
	private String som;
	
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
		System.out.println("O cachorro late");
	}
	
	
	
	private int velocidadecorrida;

	public int getVelocidadecorrida() {
		return velocidadecorrida;
	}

	public void setVelocidadecorrida(int velocidadecorrida) {
		this.velocidadecorrida = velocidadecorrida;
	}
	
	
	
	
}

