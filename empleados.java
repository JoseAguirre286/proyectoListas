public class empleados {

    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int edad;
    private String Cargo;
    public empleados(String nombre, String apellido, String direccion, int edad, String cargo) {
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        this.edad = edad;
        Cargo = cargo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    
    
}
