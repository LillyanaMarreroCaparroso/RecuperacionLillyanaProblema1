import javax.print.Doc;
import java.util.ArrayList;
import java.util.Iterator;

public class Impresora {

    public boolean estado;

    ArrayList <Documento> cola = new ArrayList<Documento>();

    public void enqueue(Documento element) {
        if (estado == true) {
        cola.add(element);
            System.out.println("Trabajo añadido");
    } else {
            System.out.println("Error, la impresora esta apagada");
        }
    }

    public Documento dequeue() {
        return cola.remove(0);
    }

    public void Impresion() {
        for(int i = 0; i < cola.size(); i++) {
            System.out.println("Nombre: " + cola.get(i).getName() + "\n" + "Tamaño: " + cola.get(i).getTamanio());
        }
    }
}
