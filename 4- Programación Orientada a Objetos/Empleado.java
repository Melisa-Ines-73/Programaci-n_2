
package tp4;


public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    private static int totalEmpleados = 0;
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados = totalEmpleados +1;
    
}
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; 
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0; 
    }
    
    
    public void actualizarSalario(double porcentaje) {
        this.salario = 1+  this.salario * (porcentaje / 100);
    }
    
    
    public void actualizarSalario(int montoFijo) {
        this.salario = montoFijo +1 ;
    }
    
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }
}
