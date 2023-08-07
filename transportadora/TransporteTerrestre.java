package transportadora;

public class TransporteTerrestre extends Transportadora{
    public TransporteTerrestre(int altura, int largura){
        super(altura, largura);
    }

    @Override
    public double calculaFrete(int altura, int largura) {
            System.out.printf("\nPreço terrestre: %f", (altura/largura)*0.2);
        return 0;
    }
}
