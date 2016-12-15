
public class Tarea
{

    private String descripcion;
    private boolean estadoTarea;

    public Tarea(String nDescripcion)
    {
        descripcion = nDescripcion;
        estadoTarea = false;
    }

    public String getDescripcion()
    {
        return descripcion;
    }
    
    public boolean getEstadoTarea()
    {
        return estadoTarea;
    }
}
