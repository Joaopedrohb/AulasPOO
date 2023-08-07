package transportadora;

public class TransporteNautico extends Transportadora{
    public TransporteNautico(int altura, int largura){
        super(altura, largura);
    }

    @Override
    public double calculaFrete(int altura, int largura) {
        System.out.printf("\nPreço terrestre: %f", (altura+largura)*0.1);
        return 0;
    }
}