import java.util.ArrayList;
public class Compras extends Productos {
    private ArrayList<Productos> listCarrito;
    private double totalPagar;
    private double totalComprado;

    public Compras() {
    }

    public Compras(ArrayList<Productos> listCarrito) {
        this.listCarrito = listCarrito;
        this.totalPagar = 0;
        this.totalComprado = 0;
    }

    public double getCalcularTotalPagar() {
        for (Productos p : listCarrito) {
            totalPagar += (p.getCantidad() * p.getPrecio());
        }
        return totalPagar;
    }
    public void setTotalPagar(double totalPagar) {
        this.totalPagar += totalPagar;
    }

    public ArrayList<Productos> getListCarrito() {
        return listCarrito;
    }

    public void setListCarrito(ArrayList<Productos> listCarrito) {
        this.listCarrito = listCarrito;
    }

}