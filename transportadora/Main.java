package transportadora;

public class Main {
public static void main(String[]args) {
    TransporteTerrestre frete = new TransporteTerrestre(100,20);
    TransporteNautico frete1 = new TransporteNautico(50,50);
    frete.calculaFrete(frete.altura, frete.largura);
    frete1.calculaFrete(frete1.altura, frete1.largura);
    }
}

