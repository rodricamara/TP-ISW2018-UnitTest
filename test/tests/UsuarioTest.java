package tests;

import static junit.framework.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import source.Ejercicio;
import source.Usuario;
import source.Nivel;
import source.TipoUsuario;

public class UsuarioTest {

    public UsuarioTest() {

    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testNombreUsuario() {
        Usuario alumno1 = new Usuario();
        alumno1.setNombre("");
        assert alumno1.getNombre() == null;
        
        alumno1.setNombre("pepe");
        assert (alumno1.getNombre()) != null;
        alumno1.setNombre("Maria_12345");
        assert (alumno1.getNombre()) != null;
        alumno1.setNombre("123María");
        assert (alumno1.getNombre()) != null;

    }

    @Test
    public void testLongContraseñaUsuario() {
        Usuario alumno1 = new Usuario();
        alumno1.setContraseña("232");       
        assert alumno1.getContraseña() == null;        
        alumno1.setContraseña("prueba123");
        assert alumno1.getContraseña() != null;
        
    }

    @Test
    public void testUsuarioContieneNivel() {
        Usuario alumno1 = new Usuario();
        Nivel nivel = new Nivel();
        nivel.setExperiencia(0);
        nivel.calculoNivel();
        alumno1.setNivel(nivel);
        assert alumno1.getNivel() != null;
        
        
        alumno1.setNivel(nivel);
        assertEquals("novato", alumno1.getNivel().getNombreNivel());
      
    }

}
