package restaurante;
import java.util.*;
public class Restaurante {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Platillo> platillos = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite nombre");
            String nombre = teclado.nextLine();
            System.out.println("Digite descripcion");
            String descripcion = teclado.nextLine();
            System.out.println("Digite precio");
            int precio = teclado.nextInt();
            teclado.nextLine();
            Platillo producto = new Platillo(nombre, descripcion, precio);
            platillos.add(producto);
        }
        System.out.println("----------------------");
        Factura nuevaFactura = new Factura(platillos);
        System.out.println(nuevaFactura.toString());
    }
    
}
