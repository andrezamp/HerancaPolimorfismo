package Exerc3;

public class Zoo {
	public static void main(String[] args) {
		
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0);
		
		Peixe tubarao = new Peixe("Tubarao", 300, 1.5);
		tubarao.setNome("Tubarão");
		tubarao.getnPatas();
		tubarao.getCor();
		tubarao.getAmbiente();
		tubarao.getCaracteristicas();
		
		Mamifero ursoCanada = new Mamifero ("Urso-do-Canadá", 180, 0.5);
		
		ursoCanada.setNome("Urso-do=Canadá");
		ursoCanada.getnPatas();
		ursoCanada.setCor("Vermelho");
		ursoCanada.getAmbiente();
		ursoCanada.getAlimento();
		
		Animal [] animais = new Animal[3];
		animais[0] = camelo;
		animais [1] = tubarao;
		animais[2] = ursoCanada;
		
		System.out.println("=====================");
		for (Animal animal:animais) {
			System.out.println(animal);
			System.out.println("=====================");
		}
	}

}
