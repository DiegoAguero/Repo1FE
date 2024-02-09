package electrodomestic;
public abstract class Electrodomestico {
    private final float  precioBaseDefault = 100;
    private final String  colorDefault = "blanco";
    private final char  consumoEnergeticoDefault = 'F';
    private final float pesoDefault = 5;

    private float precioBase = precioBaseDefault;
    private String color = colorDefault;
    private char consumoEnergetico = consumoEnergeticoDefault;
    private float peso = pesoDefault;

    public Electrodomestico(){}
    public Electrodomestico(float precioBase, float peso){
        this.setPrecioBase(precioBase);
        this.setPeso(peso);
    }
    public Electrodomestico(float precioBase, float peso, String color, char consumoEnergetico){
        this(precioBase, peso);
        this.setColor(this.comprobarColor(color));
        this.setConsumoEnergetico(this.comprobarConsumoEnergetico(consumoEnergetico));
    }
    public float getPrecioBase(){
        return this.precioBase;
    }
    public String getColor(){
        return this.color;
    }
    public char getConsumoEnergetico(){
        return this.consumoEnergetico;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setPrecioBase(float precioBase){
        this.precioBase = precioBase;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setConsumoEnergetico(char letra){
        this.consumoEnergetico = letra;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public char comprobarConsumoEnergetico(char letra){
        String str = Character.toString(letra).toUpperCase();
        if(!str.equals("A") && !str.equals("B") && !str.equals("C") && !str.equals("D") && !str.equals("E")){
            letra = consumoEnergeticoDefault;
        }
        return letra;
    }
    public String comprobarColor(String color){
        String colorLowerCase = color.toLowerCase();
        if(colorLowerCase != "blanco" || colorLowerCase != "negro"|| colorLowerCase != "rojo"|| colorLowerCase != "azul"|| colorLowerCase != "gris"){
            color = colorDefault;
        }
        return color;
    }
    public float precioFinal(){
        float precioLetra = 0;
        float precioPeso = 0;
        switch(getConsumoEnergetico()){
            case 'A': 
                precioLetra = 100;
                break;
            case 'B': 
                precioLetra = 80;
                break;
            case 'C': 
                precioLetra = 60;
                break;
            case 'D': 
                precioLetra = 50;
                break;
            case 'E': 
                precioLetra = 30;
                break;
            case 'F': 
                precioLetra = 10;
                break;
        }
        if(getPeso() <= 19){
           precioPeso = 10;
        }else if(getPeso() <=49){
            precioPeso = 50;
        }else if(getPeso() <=79){
            precioPeso = 80;
        }else{
            precioPeso = 100;
        }
        return precioLetra + precioPeso + getPrecioBase();
    }
}
    