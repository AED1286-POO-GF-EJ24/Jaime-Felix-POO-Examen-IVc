package miPrincipal;

public abstract class Suscripcion
{
    // Atributos
    private String nombre;
    protected String direccion;
    protected double costo;

    // Constructor
    public Suscripcion( String nombre, String direccion, double costo)
    {
        setNombre( nombre );
        setDireccion( direccion );
        setCosto( costo );
    }

    // Metodos set/get
    public void setNombre(String nombre)
    {
        // No hay nada que validar
    }

    public abstract void setDireccion(String direccion);

    public abstract void setCosto(double costo);

    public String getNombre()
    {
        return "";
    }

    public String getDireccion()
    {
        return "";
    }

    public double getCosto()
    {
        return 0.0;
    }

    // Método toString()
    public String toString()
    {
        String resultado = String.format("");
        return resultado;
    }
}