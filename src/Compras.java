public class Compras extends Productos {
    private double total;

    public Compras() {
    }
    public Compras(double total) {
        this.total = total;

    }
    public double getTotal() {
        return total;
    }
    public void setTotal() {
        this.total = total;
    }

    public double calcularTotal(){
        return getPrecio() * getCantidad();
    }
}
