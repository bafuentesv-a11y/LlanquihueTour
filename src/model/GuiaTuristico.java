package model;

public class GuiaTuristico extends Persona {

    private String idioma;
    private int experiencia;

    public GuiaTuristico(String rut, String nombre, Direccion direccion, String idioma, int experiencia) {
        super(rut, nombre, direccion);
        this.idioma = idioma;
        this.experiencia = experiencia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

@Override
    public String toString() {
        return super.toString() +
                "\nIdioma: " + idioma +
                "\nAños de experiencia: " + experiencia;
    }
    
}
    