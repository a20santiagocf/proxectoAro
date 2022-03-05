package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Santiago Couto
 */
public class Aro {
    private static final double LIMITERADIO = 0.0;
    
    private int coordenadaX;
    private int y;
    private double coordenadaY;
    
    
    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        y = valorY;
        establecerRadio(valorRadio);
        
    }

    public void establecerX(int valorX) {
        coordenadaX=valorX;
    }

    public int obterX() {
        return coordenadaX;
    }

    public void establecerY(int valorY) {
        y=valorY;
    }

    public int obterY() {
        return y;
    }

    public void establecerRadio(double valorRadio) {

        coordenadaY=(valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
       
    }
    

    public double obterRadio() {
        return coordenadaY;
    }

    public double obterDiametro() {
        return coordenadaY * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * coordenadaY * coordenadaY;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + y + "]; Radio = " + coordenadaY;
    }

    public void trasladarCentro(int trasladarx, int trasladary){
        coordenadaX=coordenadaX + trasladarx;
        y=y + trasladary;
    }
}