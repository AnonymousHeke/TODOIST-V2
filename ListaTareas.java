import java.util.ArrayList;

public class ListaTareas
{
    
    private  ArrayList<Tarea> listaDeTareas;

    public ListaTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();        
    }
     
    public void mostrarTareas()
    {
        int posicion = 1;
        for (Tarea tareaAMostrar : listaDeTareas)
        {
            String textoAMostrar = "";
            textoAMostrar = posicion + "-. " + tareaAMostrar.getDescripcion();
            if (tareaAMostrar.getEstadoTarea())
            {
                textoAMostrar += ". HECHO.";
            }
            System.out.println(textoAMostrar);
            posicion ++;
        }
    }
}
