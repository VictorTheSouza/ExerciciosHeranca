package br.com.victor.heranca;

public class Cavalo extends Animal{
	
	
	private int velocidadecorrida;
	
private String som;
	
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
		System.out.println("O cavalo relincha");
	}

	public int getVelocidadecorrida() {
		return velocidadecorrida;
	}

	public void setVelocidadecorrida(int velocidadecorrida) {
		this.velocidadecorrida = velocidadecorrida;
	}
	

}
