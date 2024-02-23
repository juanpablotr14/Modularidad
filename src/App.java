import java.util.Scanner;
import services.ImpresionConsola;


public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ImpresionConsola impresionConsola = new ImpresionConsola( scanner );

        impresionConsola.mostrarOpciones();
        int opcion = 0;
        
        try {
            opcion = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero.");
            scanner.close();
            return;
        }

        switch (opcion) {
            case 1:
               impresionConsola.obtenerCase1();
                break;
            case 2:

            impresionConsola.obtenerCase2();
                break;
            case 3:
                impresionConsola.obtenerCase3();
                break;
            default:
                impresionConsola.obtenerCase4();
                
                break;
        }

        scanner.close();
    }
}
