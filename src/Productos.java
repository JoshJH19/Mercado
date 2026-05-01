import java.util.Random;
import java.util.random.*;
public class Productos extends Usuario {
    private String descripcion;
    private String nomProducto;
    private double precio;
    private int cantidad;
    private int id;
    private int stock;

    //Creamos los numeros aleatorios para los precios y la cantidades
    private Random Al = new Random();
    private int randomPrecio = Al.nextInt(100);
    private int randomCantidad = Al.nextInt(10);

    public Productos() {
    }

    public Productos(String descripcion, String nomProducto, double precio, int cantidad, int id, int stock) {
        this.descripcion = descripcion;
        this.nomProducto = nomProducto;
        this.precio = randomPrecio;
        this.cantidad = randomCantidad;
        this.id = id;
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

}
