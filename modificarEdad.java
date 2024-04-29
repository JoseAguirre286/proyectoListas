import java.util.LinkedList;

public class modificarEdad {
    public LinkedList<empleados> edad (LinkedList<empleados> Empleados){
        for (empleados item : Empleados) {
            if (item.getEdad() < 18) {
                item.setEdad(15);
                
            }else{
                item.setEdad(20);
            }
         }       
        
        return Empleados;
    }

}
