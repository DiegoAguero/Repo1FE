import electrodomestic.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Electrodomestico[] misElectrodomesticos = new Electrodomestico[10];
        int precioBase = 0;
        float peso = 0;
        System.out.println("ingrese precio base: ");
        while (precioBase <= 0) {
            try {
                precioBase = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un numero valido: ");
                sc.nextLine();
            } 
        }
        System.out.println("Ingrese peso: ");
        while(peso <= 0){
            try{
               peso = sc.nextFloat();
               if(peso <=0){
                    throw new Exception("El peso no puede ser cero o negativo");
               }
            }catch(Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        
        misElectrodomesticos[0] = new Lavadora(precioBase, peso, "negro", 'A', 0);
        misElectrodomesticos[1] = new Lavadora(500, 10, "rojo", 'A', 60);
        misElectrodomesticos[2] = new Television(152, 10, "rojo", 'F', 5, true);
        misElectrodomesticos[3] = new Television(300, 10, "rojo", 'F', 5, false);
        misElectrodomesticos[4] = new Lavadora(900, 10, "rojo", 'A', 5);
        misElectrodomesticos[5] = new Television(500, 10, "rojo", 'A', 5, false);
            misElectrodomesticos[6] = new Lavadora(2400, 10, "rojo", 'A', 5);
        misElectrodomesticos[7] = new Lavadora(50, 10, "rojo",  'C', 5);
        misElectrodomesticos[8] = new Lavadora(520, 10, "rojo", 'F', 5);
        misElectrodomesticos[9] = new Lavadora(987, 10, "rojo", 'S', 5);
        float precioTelevisiones = 0;
        float precioLavadoras = 0;
        float precioTotal = 0;
        for (Electrodomestico electrodomestico : misElectrodomesticos) {
            if(electrodomestico instanceof Lavadora){
                precioLavadoras+= electrodomestico.precioFinal();
                System.out.println("Lavadora precio: " + electrodomestico.precioFinal());
            }else{
                System.out.println("Television precio: " + electrodomestico.precioFinal());
                precioTelevisiones += electrodomestico.precioFinal();
            }
        }
        precioTotal = precioLavadoras + precioTelevisiones;
        System.out.println("Precio total lavadoras: " + precioLavadoras);
        System.out.println("Precio total televisiones: " + precioTelevisiones);
        System.out.println("Precio total de todo: " + precioTotal);
        sc.close();
    }
}
