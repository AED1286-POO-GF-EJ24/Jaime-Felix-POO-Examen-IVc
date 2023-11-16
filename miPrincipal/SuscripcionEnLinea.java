package miPrincipal;

public class SuscripcionEnLinea extends Suscripcion {
    // No hay atributos propios

    // Constructor
    public SuscripcionEnLinea( String nombre, String direccion, double costo)
    {
        super(nombre, direccion, costo);
    }

    // Implementar metodo de instancia setDireccion
    public void setDireccion(String direccion)
    {
        // Debe tener una arroba
    }

    // Implementa metodo de instancia setCosto
    public void setCosto(double costo)
    {
        // Debe costar $90.00
    }

    // Metodo toString()
    public String toString()
    {
        String resultado = "" + super.toString();
        return resultado;
    }
}