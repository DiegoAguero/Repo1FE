package electrodomestic;
public class Lavadora extends Electrodomestico{
    private final float cargaDefault = 5;
    private float carga = cargaDefault;
    public Lavadora(){}
    public Lavadora(float precioBase, float peso){
        super(precioBase, peso);
    }
    public Lavadora(float precioBase, float peso, String color, char consumoEnergetico, float carga){
        super(precioBase, peso, color, consumoEnergetico);
        this.setCarga(carga);
    }
    public float getCarga(){
        return this.carga;
    }
    public void setCarga(float carga){
        this.carga = carga;
    }
    @Override
    public float precioFinal(){
        float precioTotal = super.precioFinal();
        if(this.getCarga() > 30){
            precioTotal = precioTotal + 50;
        }
        return precioTotal;
    }
}
