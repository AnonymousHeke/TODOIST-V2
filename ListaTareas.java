import java.util.ArrayList;

public class ListaTareas
{
    
    private  ArrayList<Tarea> listaDeTareas;

    public ListaTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();        
    }
    
    public void añadirTarea(String descripcion)
    {
        Tarea nuevaTarea = new Tarea(descripcion);
        listaDeTareas.add(nuevaTarea);
    }
     
    public void mostrarTareas()
    {
        int posicion = 1;
        for (Tarea tareaAMostrar : listaDeTareas)
        {
            String textoAMostrar = "";
            textoAMostrar = posicion + "-. " + tareaAMostrar.getDescripcion() + ".";
            if (tareaAMostrar.getEstadoTarea())
            {
                textoAMostrar += " HECHO.";
            }
            System.out.println(textoAMostrar);
            posicion ++;
        }
    }

    public void marcarCompletada (int numeroTarea)
    {
        int posicion = numeroTarea - 1;
        if (posicion >= 0 && posicion < listaDeTareas.size())
        {
            listaDeTareas.get(posicion).tareaCompletada();             
        }
    }
    
    public void mostrarCoincidencias (String textoABuscar)
    {
        int posicion = 1;
        int numeroDeCoincidencias = 0;
        String textoAMostrar = "";
        for (Tarea tareaAMostrar : listaDeTareas)
        {
            if (tareaAMostrar.getDescripcion().contains(textoABuscar))
            {
                textoAMostrar += posicion + "-. " + tareaAMostrar.getDescripcion();
                if (tareaAMostrar.getEstadoTarea())
                {
                    textoAMostrar += " HECHO.";
                }
                System.out.println(textoAMostrar);
                numeroDeCoincidencias ++;
            }             
            posicion ++;
        }
        
        if (numeroDeCoincidencias == 0)
        {
            System.out.println("No hay tareas que contengan el texto " + textoABuscar + ".");
        }
        else
        {
             System.out.println("Hay " + numeroDeCoincidencias + " tareas encontradas con el texto " + textoABuscar + " .");
        }        
    }
      
    public void eliminaTarea(int numeroTarea) 
    {
        int posicion = numeroTarea -1;
        if (posicion >= 0 && posicion < listaDeTareas.size())
        {
            listaDeTareas.remove(posicion);
        }
    }
}
