
package restaurante;
import java.util.*;
public class Menu {
    private ArrayList<Platillo> platillos;

    public Menu(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < platillos.size(); i++) {
            resultado += (i+1) + ". " + platillos.get(i).toString() + "\n";
        }
        return resultado;
    }
    
}
