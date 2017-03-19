package RegraNegocio;

public class CalculadoraRN {
	private double Valor;
	private double Resultado;
	private int Operacao;



	public CalculadoraRN (){
		this.Valor=0;
		this.Operacao=0;
		this.Resultado=0;

	}


	public void setValor(double valor) {
		
		if (Resultado == 0){
			Resultado = valor;
		}else{
			
			this.Valor=valor;
		}
		
		
	}


	public double getResultado() {
		return Resultado;
	}

	public void Somar(){
		Operacao=1;

	}

	public void Subtrair(){
		Operacao=2;

	}

	public void Multiplicar(){
		Operacao=3;

	}

	public void Dividir(){
		Operacao=4;

	}
	public void RaizQuadrada(){
		Operacao=5;

	}


	public void Reiniciar(){
		Valor=0;
		Resultado=0;
		Operacao=0;

	}

	public void Calcular(){
		
		switch (Operacao){
		case 1: 
			Resultado = Resultado + Valor;
			break;
		case 2: 
			Resultado = Resultado - Valor;
			break;
		case 3: 
			Resultado = Resultado * Valor;
			
			break;
		case 4:
			if (Valor<=0){
				Resultado=-9999;	
			}else{
				Resultado = Resultado / Valor;
			}
			
			
			break;
		case 5: 
			
			Resultado = Math.sqrt(Resultado);
			break;
		}
		
		

	}



}
