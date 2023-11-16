package miPrincipal;

public class SuscripcionFisica extends Suscripcion {
    // No hay atributos propios

    // Constructor
    public SuscripcionFisica( String nombre, String direccion, double costo)
    {
        super(nombre, direccion, costo);
    }

    // Implementar metodo de instancia setDireccion
    public void setDireccion(String direccion)
    {
        // Debe tener al menos un dígito
    }

    // Implementa metodo de instancia setCosto
    public void setCosto(double costo)
    {
        // Debe costar $150.00
    }

    // Metodo toString()
    public String toString()
    {
        String resultado = "" + super.toString();
        return resultado;
    }
}