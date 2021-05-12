package br.com.victor.heranca;

public class TesteAnimais {
	public static void main(String[] args) {
		
		Cavalo cavalo = new Cavalo();
		Cachorro cachorro = new Cachorro();
		Preguica preguica = new Preguica();
		
		cavalo.setNome("Cavalo");
		cavalo.setSom("relinchado");
		cavalo.setIdade(12);
		cavalo.setVelocidadecorrida(88);
		
		cachorro.setNome("Cachorro");
		cachorro.setSom("latido");
		cachorro.setIdade(8);
		cachorro.setVelocidadecorrida(50);
		
		preguica.setNome("Preguiça");
		preguica.setSom("som de preguiça");
		preguica.setIdade(10);
		preguica.subirarvores = true;
		
		Animal animal = new Animal();
		
		animal.getSom();
		
		
		
	}

}
