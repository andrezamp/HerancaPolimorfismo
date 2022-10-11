package Exerc3;

public class Animal {
	private String nome;
	private String ambiente;
	private String cor;
	private int nPatas;
	private double comprimento;
	private double velocidade;

	public Animal() {
		this.setnPatas(4);
	}
	
	@Override
	public String toString() {
		String s = "Animal: "+ nome;
		s += "\nComprimento: "+comprimento + " cm";
		s+= "\nPatas: "+nPatas;
		s+= "\nCor: "+cor;
		s+= "\nAmbiente: "+ambiente;
		s+= "\nVelocidade: "+velocidade+ " m/s";
		
		return s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getnPatas() {
		return nPatas;
	}

	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

}
