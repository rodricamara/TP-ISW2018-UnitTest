package source;
import java.util.Vector;
import source.Nivel;

public class Usuario {
    private  String nombre;
    private  String contraseña;
    private Nivel nivel;
    private TipoUsuario tipoUsuario;
    private Ejercicio ejercicios[];
    public  Vector<Ejercicio> ej = new Vector<Ejercicio>();

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if ("".equals(nombre)) System.out.println("El nombre de usuario no puede ser vacío");
        else {
            this.nombre = nombre;
        }
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        if (contraseña.length()>=8 && contraseña.length()<=16 ){
        this.contraseña = contraseña ;
        }
        else
        System.out.println("La contraseña debe tener entre 8 y 16 caracteres");
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Ejercicio[] getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(Ejercicio[] ejercicios) {
        this.ejercicios = ejercicios;
    } 
    
    
}
