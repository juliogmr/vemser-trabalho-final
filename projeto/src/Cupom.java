public class Cupom {

    private double valor;
    private boolean validade;

    public Cupom(double valor, boolean validade) {
        this.valor = valor;
        this.validade = validade;
    }

    public void imprimirCupom(){
        System.out.println("Cupom de desconto de " + valor * 100 + "%");
        System.out.println("Ainda é autenticável: " + validade);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isValidade() {
        return validade;
    }

    public void setValidade(boolean validade) {
        this.validade = validade;
    }
}
