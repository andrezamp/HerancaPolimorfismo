package Exerc3;

public class Mamifero extends Animal {
	public String alimento;

	public Mamifero(String nome, double comprimento, double velocidade) {
		this.setAlimento("Mel");
		this.setCor("Castanho");
		this.setAmbiente("Terrestre");
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento: " + alimento;
		return s;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

}
