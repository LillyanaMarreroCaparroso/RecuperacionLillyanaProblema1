import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Impresora impresoraNueva = new Impresora();

        do {
            System.out.println("Selecione una opcion");
            System.out.println("1. Encender impresora \n" +
                    "2. Apagar impresora \n" +
                    "3. Añadir trabajo \n" +
                    "4. Ver lista de trabajos \n" +
                    "5. Imprimir \n" +
                    "6. Salir");
            opcion = sc.nextInt();



            switch (opcion) {
                case 1:
                    impresoraNueva.estado = true;
                    System.out.println("Impresora encendida");
                    break;
                case 2:
                    impresoraNueva.estado = false;
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del archivo");
                    String nombre = sc.next();
                    System.out.println("Introduzca el tamaño, junto a la unidad");
                    String tamanio = sc.next();

                    Documento documentoUno = new Documento(nombre, tamanio);
                    impresoraNueva.enqueue(documentoUno);
                    break;
                case 4:

                    break;
                case 5:
                    impresoraNueva.Impresion();
            }
        } while (opcion != 6);
    }
}
