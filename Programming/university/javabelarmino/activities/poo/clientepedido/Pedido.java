package programming.university.javabelarmino.activities.poo.clientepedido;

public class Pedido {
    private int numPedido;
    private double valorTotal;
    private Cliente meuCliente;


    public Pedido(){

    }
    
    public Pedido(int numPedido, double valorTotal) {
        this.numPedido = numPedido;
        this.valorTotal = valorTotal;
    }

    public int getNumPedido(){
        return this.numPedido;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }
}