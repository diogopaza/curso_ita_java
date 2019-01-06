package Carros;



public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	Carro(int potencia){
		this.potencia = potencia;
		velocidade=0;
	}
	
	void acelerar(){
		
		velocidade += potencia;
	}
	
	void frear(){
		velocidade = velocidade / 2;
	}
	
	int getVelocidade(){
		
		return velocidade;
	}
	
	void imprimir(){
		
		System.out.println("O carro " + nome + "está a velocidade de "+ getVelocidade());
	}
	
	
}
