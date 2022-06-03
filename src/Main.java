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
                    "3. Añadir trabajo " +
                    "4. Ver lista de trabajos" +
                    "5. Imprimir" +
                    "6. Salir");
            opcion = sc.nextInt();



            switch (opcion) {
                case 1:
                    impresoraNueva.estado = true;
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
                    impresoraNueva.Impresion();
                    break;
                case 5:

            }
        } while (opcion != 6);



    }
}
