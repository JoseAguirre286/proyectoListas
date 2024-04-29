import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<empleados> Empleados = new LinkedList<empleados>();
        modificarEdad me = new modificarEdad();
         for (int i = 0; i < 2; i++) {
            empleados item = new empleados(null, null, null, i, null);
            System.out.println("Ingrese por favor el nombre del empleado");
            item.setNombre(sc.next());
            System.out.println("Ingrese por favor el apellido del empleado");
            item.setApellido(sc.next());
            System.out.println("Ingrese por favor la dirección del empleado");
            item.setDireccion(sc.next());
            System.out.println("Ingrese por favor edad del empleado");
            item.setEdad(sc.nextInt());
            System.out.println("Ingrese por favor el cargo del empleado");
            item.setCargo(sc.next());
            System.out.println(" ");
            Empleados.add(item);
 
         }
         Empleados = me.edad(Empleados);

         String cadena = "";
         for (empleados empleado : Empleados) {
             cadena = cadena + "\nnombre: " + empleado.getNombre() + "\napellido: " + empleado.getApellido() + "\ndirección: " + empleado.getDireccion() + "\nedad: " + empleado.getEdad()  + "\ncargo: " + empleado.getCargo()  + "\n ";
             //System.out.println(" ");
    }
    System.out.println(cadena);
    //System.out.println();
}

}