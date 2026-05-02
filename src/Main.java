import java.util.ArrayList;
import java.util.Scanner;
class Principal{
    public static void main(String[] args) {
//Este codigo podra ser el menos eficiente pero fue creado con mucho esfuerzo y estoy aprendiendo muchas cosas gracias a investigar sobre el tema posiblemente en un futuero no muy lejano vuelva a este codigo y lo pueda optimizar de una mejor forma o crear otro mas optimizado y este se quede como evicendia de mi crecimiento como programador
        Scanner sc = new Scanner(System.in);
        ArrayList <Usuario> listUsuarios = new ArrayList();
        ArrayList <Productos> listCarrito = new ArrayList();
//Los productos que van a estar a la venta en nuestro mercado Nota:Voy a cambiar todo mi codigo y lo voy a hacer mas eficiente
        Productos p1 = new Productos("600ml", "Coca cola", 0, 0, 1003, 500);
        Productos p2 = new Productos("600ml", "Manzanita", 0, 0, 1007, 703);
        Productos p3 = new Productos("600ml", "Pepsi", 0, 0, 1008, 687);
        Productos p4 = new Productos("600ml", "Sangria", 0, 0, 1009, 569);
        Productos p5 = new Productos("600ml", "Agua", 0, 0, 1000, 1000);
        Productos p6 = new Productos("Roja","Manzana",0,0,1006,574);
        Productos p7 = new Productos("Amarilla","Manzana",0,0,1005,462);
        Productos p8 = new Productos("Bolsa de un kilo","Azucar",0,1001,0,601);
        Productos p9 = new Productos("Bolsa de un kilo","Uva",0,0,1010,209);
        Productos p10 = new Productos("Bolsa de un kilo","Gomitas",0,0,1004,137);


        //Se crea un boolean que nos ayudara a hacer un ciclo al inicio del programa y este se repite hasta que eligamos una opcion correcta de las 3 opciones
        boolean salir1 = false;
        //Menu del programa
        System.out.println("----------------------------------------------");
        System.out.println("Bienvendio al mercado");
        System.out.println("----------------------------------------------");

        //Crear el while con el nombre del boolean que creamos anterior mente para que se haga un ciclo
        while(!salir1){
            System.out.println("-----------------------------");
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
                                    System.out.println("6.-Generar factura");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("7.-Salir del mercado");
                                    System.out.println("----------------------------------------------");


                                    if (sc.hasNextInt()) {
                                        int opcion2 = sc.nextInt();
                                        switch (opcion2) {
                                            case 1:
                                                if (listCarrito.isEmpty()) {
                                                    System.out.println("El carrito esta vacio");
                                                } else {
                                                    System.out.println("----------------------------------------------");
                                                    System.out.println("Lista del producto en el carrito");
                                                    System.out.println("----------------------------------------------");
                                                    for (Productos producto : listCarrito) {
                                                        System.out.println("*" + producto.getNomProducto() + "/precio;" + producto.getPrecio() + "/cantidad;" + producto.getCantidad());
                                                    }
                                                    System.out.println("----------------------------------------------");
                                                }
                                                break;
                                            case 2:
                                                boolean salir3 = false;
                                                while (!salir3) {
                                                    System.out.println("----------------------------------------------");
                                                    System.out.println("Lista de productos de la tienda");
                                                    System.out.println("----------------------------------------------");
                                                    System.out.println("1.-" + p1.getNomProducto());
                                                    System.out.println("2.-" + p2.getNomProducto());
                                                    System.out.println("3.-" + p3.getNomProducto());
                                                    System.out.println("4-" + p4.getNomProducto());
                                                    System.out.println("5-" + p5.getNomProducto());
                                                    System.out.println("6-" + p6.getNomProducto());
                                                    System.out.println("7-" + p7.getNomProducto());
                                                    System.out.println("8-" + p8.getNomProducto());
                                                    System.out.println("9-" + p9.getNomProducto());
                                                    System.out.println("10-" + p10.getNomProducto());
                                                    System.out.println("11-Salir de los productos");
                                                    System.out.println("----------------------------------------------");
                                                    if (sc.hasNextInt()) {
                                                        int opcion3 = sc.nextInt();
                                                        //  Creo un switch para poder elegir cada producto y para agregar mas productos pues debe de ser manual 7-7 aun no le se a la programacion
                                                        // Cada case tiene la misma condicion solo cambia su nombre del objecto que hace referencia
                                                        switch (opcion3) {
                                                            case 1:
                                                                //Comprobamos que el objecto se encuentre dentro de la lista y al ser comprobado se sumara la cantidad del objecto para que este no este duplicado asi funcionan todos los objectos
                                                                if (listCarrito.contains(p1)){
                                                                    p1.setCantidad(p1.getCantidad()+p1.getCantidad());
                                                                    //Aqui se comprueba que la cantidad aleatoria sea mayor del 0 para poder comprar el articulo y al ser agregada la canitidad a la lista esta le restara al stock asi funcionan todo los objectos
                                                                }else if (p1.getCantidad() > 0 ) {
                                                                    System.out.println("Producto agregado");
                                                                    p1.setStock(p1.getStock() + p1.getCantidad());
                                                                    listCarrito.add(p1);}else{
                                                                System.out.println("Producto no agregado");}
                                                                break;
                                                            case 2:
                                                                if (listCarrito.contains(p2)){
                                                                    p2.setCantidad(p2.getCantidad()+p2.getCantidad());
                                                                }else if (p2.getCantidad() > 0 ) {
                                                                    System.out.println("Producto agregado");
                                                                    p2.setStock(p2.getStock() -p2.getCantidad());
                                                                    listCarrito.add(p2);
                                                                }else {
                                                                System.out.println("Producto no agregado");}
                                                                break;
                                                            case 3:
                                                                if (listCarrito.contains(p3)){
                                                                p3.setCantidad(p3.getCantidad()+p3.getCantidad());
                                                            }else if (p3.getCantidad() > 0) {
                                                                    System.out.println("Producto agregado");
                                                                    p3.setStock(p3.getStock() -p3.getCantidad());
                                                                    listCarrito.add(p3);
                                                                } else {
                                                                System.out.println("Producto no agregado");}
                                                                break;
                                                            case 4:
                                                                if (listCarrito.contains(p4)){
                                                                    p4.setCantidad(p4.getCantidad()+p4.getCantidad());
                                                                }else if (p4.getCantidad() > 0 ) {
                                                                    System.out.println("Producto agregado");
                                                                    p4.setStock(p4.getStock() -p4.getCantidad());
                                                                    listCarrito.add(p4);
                                                                } else {
                                                                System.out.println("Producto no agregado");}
                                                                break;
                                                            case 5:
                                                                if (listCarrito.contains(p5)){
                                                                    p5.setCantidad(p5.getCantidad()+p5.getCantidad());
                                                                }else if (p5.getCantidad() > 0 ) {
                                                                    System.out.println("Producto agregado");
                                                                    p5.setStock(p5.getStock() -p5.getCantidad());
                                                                    listCarrito.add(p5);
                                                                } else {
                                                                System.out.println("Producto no agregado");}
                                                                break;
                                                            case 6:
                                                                if (listCarrito.contains(p6)){
                                                                    p6.setCantidad(p6.getCantidad()+p6.getCantidad());
                                                                }else if (p6.getCantidad() > 0) {
                                                                    System.out.println("Producto agregado");
                                                                    p6.setStock(p6.getStock() -p6.getCantidad());
                                                                    listCarrito.add(p6);
                                                                } else {
                                                                System.out.println("Producto no agregado");}
                                                                break;
                                                            case 7:
                                                                if (listCarrito.contains(p7)){
                                                                    p7.setCantidad(p7.getCantidad()+p7.getCantidad());
                                                                }else if (p7.getCantidad() > 0 ) {
                                                                    System.out.println("Producto agregado");
                                                                    p7.setStock(p7.getStock() -p7.getCantidad());
                                                                    listCarrito.add(p7);
                                                                } else {
                                                                System.out.println("Producto no agregado");}
                                                                break;
                                                            case 8:
                                                                if (listCarrito.contains(p8)){
                                                                    p8.setCantidad(p8.getCantidad()+p8.getCantidad());
                                                                }else
                                                                if (p8.getCantidad() > 0 ) {
                                                                    System.out.println("Producto agregado");
                                                                    p8.setStock(p8.getStock() -p8.getCantidad());
                                                                    listCarrito.add(p8);
                                                                } else {
                                                                System.out.println("Producto no agregado");}
                                                                break;
                                                            case 9:
                                                                if (listCarrito.contains(p9)){
                                                                    p9.setCantidad(p9.getCantidad()+p9.getCantidad());
                                                                }else if (p9.getCantidad() > 0 ) {
                                                                    System.out.println("Producto agregado");
                                                                    p9.setStock(p9.getStock() -p9.getCantidad());
                                                                    listCarrito.add(p9);
                                                                }else {
                                                                System.out.println("Producto no agregado");}
                                                                break;
                                                            case 10:
                                                                if (listCarrito.contains(p10)){
                                                                    p10.setCantidad(p10.getCantidad()+p10.getCantidad());
                                                                }else if (p10.getCantidad() > 0 ) {
                                                                    System.out.println("Producto agregado");
                                                                    p10.setStock(p10.getStock() -p10.getCantidad());
                                                                    listCarrito.add(p10);
                                                                } else {
                                                                System.out.println("Producto no agregado");}
                                                                break;
                                                            case 11:
                                                                salir3 = true;
                                                                System.out.println("Saliendo");
                                                                break;
                                                        }
                                                    } else {
                                                    System.out.println("Esa no es una opcion valida vuelva a intentar");
                                                    sc.next();}
                                                }
                                                break;
                                            case 3:

                                                break;

                                            case 6:

                                                Compras compras = new Compras(listCarrito);
                                                for( Productos prod : listCarrito) {
                                                    System.out.println(prod.getNomProducto()+" * "+prod.getCantidad()+" : $"+(prod.getPrecio()*prod.getCantidad()));
                                                }
                                                break;


                                        }
                                    }else {   System.out.println("Esa no es una opcion valida vuelva a intentar");
                                        sc.next();}
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
                    System.out.println("Usuario agregado correctamente");
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
//La verdad no
    }
}