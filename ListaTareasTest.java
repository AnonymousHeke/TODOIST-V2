

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ListaTareasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListaTareasTest
{
    private ListaTareas ListaDeTareas;

    /**
     * Default constructor for test class ListaTareasTest
     */
    public ListaTareasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        ListaDeTareas = new ListaTareas();
        ListaDeTareas.añadirTarea("Hacer la cama");
        ListaDeTareas.añadirTarea("Comprar para hacer la comida");
        ListaDeTareas.añadirTarea("Hacer la comida");
        ListaDeTareas.añadirTarea("Dormir la siesta");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
