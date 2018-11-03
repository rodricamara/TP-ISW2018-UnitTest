package source;

public class Nivel {

    private String nombreNivel;
    private int experiencia;

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void calculoNivel() {
        if (experiencia < 10000) {
            nombreNivel = "novato";
        } else {
            nombreNivel = "avanzado";
        }
    }
}
