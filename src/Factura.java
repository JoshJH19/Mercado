import java.time.LocalDate;
import java.util.ArrayList;

class Factura extends Compras{
    private LocalDate fecha;
    private String usuarioNombre;
    private String IVA;
    private double totalPagar;
    private ArrayList<Productos> listCarrito;

    public Factura() {}
    public Factura(LocalDate fecha, String usuarioNombre, String IVA, ArrayList<Productos> listCarrito) {

        this.fecha = fecha;
        this.usuarioNombre = usuarioNombre;
        this.IVA = IVA;
        this.totalPagar = 0;
        this.listCarrito = listCarrito;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getUsuarioNombre() {
        return usuarioNombre;
    }
    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }
    public String getIVA() {
        return IVA;
    }
    public void setIVA(String IVA) {
        this.IVA = IVA;
    }
    public double getTotalPagar() {
        return totalPagar;
    }
    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    public ArrayList<Productos> getListCarrito() {
        return listCarrito;
    }
    public void setListCarrito(ArrayList<Productos> listCarrito) {
        this.listCarrito = listCarrito;
    }
}
