import java.time.LocalDate;
import java.util.ArrayList;

class Factura extends Compras {
    private LocalDate fecha;
    private double totalPagar1;
    private double totalPagarIva;
    private double totalPagarTotal;

    public Factura() {
    }

    public Factura(LocalDate fecha, double totalPagar1, double totalPagarIva, double totalPagarTotal) {
        this.fecha = fecha;
        this.totalPagar1 = totalPagar1;
        this.totalPagarIva = totalPagarIva;
        this.totalPagarTotal = totalPagarTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.fecha = fecha;
    }
    public double getTotalPagar1() {
        return totalPagar1;
    }

    public void setTotalPagar1(double totalPagar1) {
        this.totalPagar1 = totalPagar1;
    }

    public double getTotalPagarIva() {
        return totalPagarIva;
    }
    public void setTotalPagarIva(double totalPagarIva) {
        this.totalPagarIva = totalPagarIva;
    }
    public double getTotalPagarTotal() {
        return totalPagarTotal;
    }
    public double setTotalPagarTotal(double totalPagarTotal) {
        this.totalPagarTotal = totalPagarTotal;
        return totalPagarTotal;
    }

}