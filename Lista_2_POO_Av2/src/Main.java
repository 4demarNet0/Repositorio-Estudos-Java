import Questão_2.Ponto;
import Questão_3.Reta;


public class Main {
    public static void main(String[] args) {
        
        Ponto pontoA = new Ponto(1,2);
        Ponto pontoB = new Ponto(3,6);

        Reta retaR = new Reta(pontoA, pontoB);

        System.out.println("retaR: a = " + retaR.getCoeficienteAngular() + " e b = " + retaR.getCoeficienteAngular());

        Ponto pontoC = new Ponto(0,1);
        Ponto pontoD = new Ponto(4,3);

        Reta retaS = new Reta(pontoC,pontoD);
        System.out.println("retaS: a = " + retaS.getCoeficienteAngular() + " e b = " + retaS.getCoeficienteAngular());

        Ponto pontoCoincidente = Ponto.CalcularPontoIntercepcaoDuasRetas(retaR, retaS);
        System.out.println("X =" + pontoCoincidente.getAbcissaX() + "/ Y =" + pontoCoincidente.getOrdenadaY());





        
    }
}
