package reinoAnimal;

public abstract class Animal { 
	
	private String especie; 
	
	// métodos abstratos para uso em polimorfismo (métodos são ações, verbos)
	abstract public void possuiNome (String nome); 
	abstract public void possuiIdade (int idade); 
	abstract public void fazSom (String som);
	abstract public void examinar(String exame);
	// fim dos métodos comuns para todos os animais
	
	//método construtor
	public Animal (String especie) {
		this.especie = especie;
	}

}
