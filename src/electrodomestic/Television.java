package electrodomestic;
public class Television extends Electrodomestico {
    private final float resolucionDefault = 20;
    private final boolean sintonizadorTDTDefault = false;

    private float resolucion = resolucionDefault;
    private boolean sintonizadorTDT = sintonizadorTDTDefault;
    
    public Television(){}
    public Television(float precioBase, float peso){
        super(precioBase, peso);
    }
    public Television(float precioBase, float peso, String color, char consumoEnergetico, float resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, color, consumoEnergetico);
        this.setSintonizadorTDT(sintonizadorTDT);
        this.setResolucion(resolucion);
    }
    public float getResolucion(){
        return this.resolucion;
    }
    public boolean isSintonizadorTDT(){
        return this.sintonizadorTDT;
    }
    public void setResolucion(float resolucion){
        this.resolucion = resolucion;
    }
    public void setSintonizadorTDT(boolean sintonizadorTDT){
        this.sintonizadorTDT = sintonizadorTDT;
    }
    @Override
    public float precioFinal(){
        float precioTotal = super.precioFinal();
        if(this.getResolucion() > 40){
            precioTotal = precioTotal * 1.30f; 
        }
        if(isSintonizadorTDT()){
            precioTotal+=50;
        }
        return precioTotal;
    }
}
