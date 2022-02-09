//1.2 – Crie duas subclasses de Acessorio. Som e VidroEletrico. O imposto de renda de Som é 
//dado por (preço * 0.3) e o de VidroEletrico é dado por (preço * 0.2).

package lista2;

public class VidroEletrico extends Acessorio {
    public VidroEletrico(double preco, String marca) {
        super(preco, marca);
    }

    @Override
    public double calcularImpostoRenda() {
        return getPreco();
    }
}
