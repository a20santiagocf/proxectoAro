package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Santiago Couto
 */
public class Aro {

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
       this.radio = radio;
    }
    private static final double LIMITERADIO = 0.0;
    
    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    
    /**
     *Constructor vacio
     */
    public Aro() {
    }

    /**
     * Constructo de aro con parametros
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
        
    }

    /**
     *metodo para obter a diametro
     * @return 
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * metodo para obter a circunferencia
     * @return 
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *metodo para obter a superficie
     * @return 
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * metodo que move o centro do aro
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}