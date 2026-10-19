package Questao_3;
import Questao_2.Ponto;

public class Reta {
    
    // ATRIBUTOS

    private double coeficienteAngularA;
    private double coeficienteLinearB;

    // CONSTRUTORES

    public Reta(double coeficienteAngularA, double coeficienteLinearB){

        this.coeficienteAngularA = coeficienteAngularA;
        this.coeficienteLinearB = coeficienteLinearB;

    }

    public Reta(Ponto Inicial, Ponto Final){

        if (Inicial.getAbcissaX() == Final.getAbcissaX()){

            throw new IllegalArgumentException("Esses pontos formam uma reta Perpendicular ao Eixo X");

        }

        this.coeficienteAngularA = (Final.getOrdenadaY() - Inicial.getOrdenadaY())/(Final.getAbcissaX() - Inicial.getAbcissaX());
        this.coeficienteLinearB = Inicial.getOrdenadaY() - coeficienteAngularA * Inicial.getAbcissaX();

    }


    // MÉTODOS

        // GETTERS E SETTERS

    public double getCoeficienteAngular(){

        return this.coeficienteAngularA;

    }

    public void setCoeficienteAngular(double novoCoeficienteAngular){

        this.coeficienteAngularA = novoCoeficienteAngular;

    }

    public double getCoeficienteLinear(){

        return this.coeficienteLinearB;

    }

    public void setCoeficienteLinear(double novoCoeficienteLinear){

        this.coeficienteLinearB = novoCoeficienteLinear;

    }

        // COMPORTAMENTOS
    
    // NÃO PRECISA ESTÁ ATRELADO A UM OBJETO
    public static boolean PontoPertenceReta(Ponto A, Reta r){

        if (A.getOrdenadaY() != (r.getCoeficienteAngular() * A.getAbcissaX()) + r.getCoeficienteLinear()){

            return false;

        }

        return true;

    }

    public void ClassificacaoDuasRetas(Reta s){

        if (this.coeficienteAngularA != s.getCoeficienteAngular()){

            System.out.println("Essas Retas tem DIREÇÕES DIFERENTES");
            System.out.println("Se interceptando em UM PONTO");
            System.out.println("a1 == a2 / b1 e b2 tanto faz");

        } else {

            if (this.coeficienteLinearB == s.getCoeficienteLinear()){

                System.out.println("Essas Retas são COINCIDENTES (INFINITOS PONTOS EM COMUM)");
                System.out.println("a1 == a2 / b1 == b2");

            } else {

                System.out.println("Essas Retas são PARALELAS (NUNCA TERÃO UM PONTO EM COMUM)");
                System.out.println("a1 == a2 / b1 == b2");

            }
        
        }

    }


}
