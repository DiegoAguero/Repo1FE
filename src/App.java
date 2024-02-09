import electrodomestic.*;
public class App {
    public static void main(String[] args) throws Exception {
        Electrodomestico[] misElectrodomesticos = new Electrodomestico[10];
        misElectrodomesticos[0] = new Lavadora(100, 20, "negro", 'A', 0);
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
    }
}
