import java.util.ArrayList;
import java.util.Scanner;
class Principal{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Usuario> listUsuarios = new ArrayList();
        ArrayList <Productos> listProductos = new ArrayList();

        //Se crea un boolean que nos ayudara a hacer un ciclo al inicio del programa y este se repite hasta que eligamos una opcion correcta de las 3 opciones
        boolean salir1 = false;
        //Menu del programa
        System.out.println("-----------------------------");
        System.out.println("Bienvendio al mercado");
        System.out.println("-----------------------------");
        //Crear el while con el nombre del boolean que creamos anterior mente para que se haga un ciclo
        while(!salir1){
            System.out.println("Eliga una de las 3 opciones");
            System.out.println("-----------------------------");
            System.out.println("1.Iniciar secion");
            System.out.println("-----------------------------");
            System.out.println("2-.Crear usuario");
            System.out.println("-----------------------------");
            System.out.println("3.-Salir del mercado ");
            System.out.println("-----------------------------");
            //Se crea un if que ayudara a que solo se acepte las opciones validas del menu
            if (sc.hasNextInt()) {
            //Se crea la variable opcion y se utiliza el scanner para poder ingresar el numero de opcion que requerimos
            int opcion = sc.nextInt();

            //Se crea un switch para poder escribir los metodos en cada opcion dependiendo de que funcion se le asigne
            switch(opcion) {
                case 1:
                    if (listUsuarios.isEmpty()) {
                        System.out.println("No existe ningun usuario");
                    } else {
                        System.out.println("Ingrese su usuario");
                        String Inom = sc.next();
                        System.out.println("Ingrese su contraseña");
                        String Icon = sc.next();
                        boolean acceso = false;
                        for (Usuario Iusuario : listUsuarios) {
                            if (Iusuario.getNombre().equals(Inom) && Iusuario.getContrasenia().equals(Icon)) {
                                System.out.println("Usuario exitoso");
                                System.out.println("Bienvenido al mercado");
                                acceso = true;
                            } else {
                                System.out.println("Usuario no encontrado");
                            }
                            // creamos una condicion para dar acceso a la cuenta que ingreso correctamente sus datos
                            if (acceso) {
                                //Creamos una segunda variable boolean llamada salida2 para el segundo while para crear el apartado de compras,actualizar productos, eliminar productos, mostrar productos, filtrar productos y cerrar secion.
                                boolean salir2 = false;
                                while (!salir2) {
                                    System.out.println("----------------------------------------------");
                                    System.out.println("1.-Lista de productos");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("2.-Comprar producto");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("3.-Actualizar productos");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("4-Eliminar producto");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("5.-Filtrar productos");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("6.-Salir del mercado");
                                    System.out.println("----------------------------------------------");

                                    int opcion2 = sc.nextInt();

                                    Productos p1 = new Productos("600ml", "Coca cola", 0, 0, 0, 50);
                                    Productos p2 = new Productos("600ml", "Manzanita", 0, 0, 0, 70);
                                    Productos p3 = new Productos("600ml", "Pepsi", 0, 0, 0, 68);
                                    Productos p4 = new Productos("600ml", "Sangria", 0, 0, 0, 56);
                                    Productos p5 = new Productos("600ml", "Agua", 0, 0, 0, 100);
                                    Productos p6 = new Productos("Roja","Manzana",0,0,0,57);
                                    switch (opcion2) {
                                        case 1:
                                            if (listProductos.isEmpty()) {
                                                System.out.println("El carrito esta vacio");
                                            } else {
                                                for (Productos producto : listProductos) {
                                                    System.out.println("----------------------------------------------");
                                                    System.out.println("Lista del producto");
                                                    System.out.println("----------------------------------------------");
                                                    System.out.println(1 + ".-" + producto.getNomProducto() + "/precio;" + producto.getPrecio() + "/cantidad;" + producto.getCantidad());
                                                    System.out.println("----------------------------------------------");
                                                    break;
                                                }
                                            }
                                        case 2:
                                            listProductos.add(p1);
                                            System.out.println("Producto agregado");
                                            break;


                                    }

                                }

                            }
                        }
                    }
                    break;
                //En este case ayuda a crear y guardar el usuario en una lista
                case 2:
                    Usuario usuario = new Usuario();
                    System.out.println("Ingresar usuario");
                    String nom = sc.next();
                    System.out.println("Ingresar contraseña");
                    String con = sc.next();
                    usuario.setNombre(nom);
                    usuario.setContrasenia(con);
                    listUsuarios.add(usuario);
                    break;
                //Termina con la aplicacion
                case 3:
                    salir1 = true;
                    break;
            }
            }else {
                System.out.println("Esa no es una opcion valida vuelva a intentar");
                sc.next();}
        }
    }
}