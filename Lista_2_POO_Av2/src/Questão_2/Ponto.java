package Questão_2;

import Questão_3.Reta;

public class Ponto {
	
	// ATRIBUTOS
	
	private double ordenadaY;
	
	private double abcissaX;
	
	// CONSTRUTOR EM SOBRECARGA
	
	// PONTOS COM PADRÕES, CRIADOS NA ORIGEM (0,0)
	
	public Ponto() {
		
		this.abcissaX = 0;
		
		this.ordenadaY = 0;
		
	}
	
	// PONTO EM UM X E Y FORNECIDOS
	
	public Ponto(double abcissaX, double ordenadaY) {
		
		this.abcissaX = abcissaX;
		
		this.ordenadaY = ordenadaY;
		
	}
	
	// COPIAR AS COORDENADAS DE UM PONTO JÁ EXISTENTE
	
	public Ponto(Ponto pontoACopiar) {
		
		this.abcissaX = pontoACopiar.abcissaX;
		
		this.ordenadaY = pontoACopiar.ordenadaY;
		
	}
	
	// MÉTODOS
	
	// GETTERS E SETTERS
	
	public double getOrdenadaY() {
		
		return ordenadaY;
		
	}
	
	public void setOrdenadaY(double ordenadaY) {
		
		this.ordenadaY = ordenadaY;
		
	}
	
	public double getAbcissaX() {
		
		return abcissaX;
		
	}
	
	public void setAbcissaX(double abcissaX) {
		
		this.abcissaX = abcissaX;
		
	}
	
	// COMPARAÇÃO SEMÂNTICA ENTRE DOIS PONTOS - SE ELES ESTÃO NA MESMA POSIÇÃO
	
	public boolean comparacaoEntrePontos(Ponto pontoComparado) {
		
		// SE O X DO pontoComparado FOR IGUAL AO X DESSE PONTO E O Y
		// DO pontoComparado FOR IGUAL AO Y
		
		if (pontoComparado.getAbcissaX() == this.abcissaX && pontoComparado.getOrdenadaY() == this.ordenadaY) {
			
			return true;
			
		}
		
		// SENÃO
		
		return false;
		
	}
	
	// CALCULAR A DISTÂNCIA ENTRE DOIS PONTOS
	
	public double calcularDistancia(Ponto pontoFinal) {
	
	// FAZ UMA COMPARAÇÃO PUXANDO UM MÉTODO DA PRÓPRIA CLASSE, NO CASO COMPARANDO DOIS PONTOS, SE FOR TRUE
	
		if (this.comparacaoEntrePontos(pontoFinal) == true) {
			
			// RETORNA ISSO
			throw new IllegalArgumentException("Esses pontos OCUPAM as mesmas coordenadas");
			
		}
		
		// SE NÃO FAZ O CALCULO NORMAL
		
		double variacaoX = pontoFinal.getAbcissaX() - this.abcissaX;
		
		double variacaoY = pontoFinal.getOrdenadaY() - this.ordenadaY;
		
		double distancia = Math.sqrt(Math.pow(variacaoX, 2) + Math.pow(variacaoY, 2));
		
		return Math.round(distancia * 100.0) / 100.0;
		
	}
	
	// DESCOBRIR QUAL É O PONTO DE INTERCEPÇÃO DE DUAS RETAS

	public static Ponto CalcularPontoIntercepcaoDuasRetas(Reta r, Reta s){

		// VALIDAÇÃO
		if (r.getCoeficienteAngular() == s.getCoeficienteAngular()) {
			
			throw new IllegalArgumentException("Não HÁ UM PONTO EM COMUM entre essas retas (PODE TER INFINITOS OU NENHUM)");

		}

        // CRIAR OS ATRIBUTOS
        double xDessePonto = (s.getCoeficienteLinear() - r.getCoeficienteLinear())/(s.getCoeficienteAngular() - r.getCoeficienteAngular());    
        double yDessePonto = r.getCoeficienteAngular() * xDessePonto + r.getCoeficienteLinear();


        // INTANCIAR O NOVO OBJETO QUE É UM PONTO DE INTERSSEÇÃO
        Ponto pontoDeIntercecao = new Ponto(xDessePonto,yDessePonto);


        // RETORNAR
        return pontoDeIntercecao;
        
	}

	// TRABALHANDO

	
	


}