package p2lab5_gabrielzelaya;

/**
 *
 * @author gabri
 */
public class Personaje {
    private String nombre;
    private double poder;
    private String debilidad;
    private String universo;
    private double fuerza;
    private double agilidadFisica;
    private double agilidadMental;
    private double hp;

    public Personaje(String nombre, double poder, String debilidad, String universo, double fuerza, double agilidadFisica, double agilidadMental, double hp) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
        this.hp = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(double agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public double getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(double agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return nombre+"\nPoder: "+poder+"\nFuerza: "+fuerza+"\nDebilidad: "+debilidad+"\nFisico: "+agilidadFisica
                +"\nMental: "+agilidadMental+"Puntos de vida:"+hp+"\nUniverso: "+universo;
    }
    
}
