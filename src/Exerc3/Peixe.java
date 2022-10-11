package Exerc3;

public class Peixe extends Animal {

	private String caracteristicas;

	public Peixe(String nome, double comprimento, double velocidade) {
		super();
		this.setAmbiente("mar");
		this.setnPatas(0);
		this.setCor("cinza");
		this.caracteristicas = "barbatanas e cauda";
	}

	public String toString() {
		String s = super.toString();
		s += "\nCaracteristicas: " + caracteristicas;
		return s;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}
