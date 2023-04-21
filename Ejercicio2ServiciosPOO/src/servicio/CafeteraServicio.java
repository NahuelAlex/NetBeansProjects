package servicio;

import entidades.Cafetera;

/**
 * con los siguiente: a) b) c)  d)
 * 
 *
 * @author alexi Crear clase CafeteraServicio en el paquete Servicios
 */
public class CafeteraServicio {
//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    /**
     * Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la
     * taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de
     * café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al
     * usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
     *
     * @param cafetera
     * @param tamañoTaza
     */
    public void servirTaza(Cafetera cafetera, int tamañoTaza) {
        if (cafetera.getCantidadActual() >= tamañoTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamañoTaza);
            System.out.println("Sirviendo cafe");
        } else if(cafetera.getCantidadActual()< tamañoTaza) {
            System.out.println("no se pudo llenar la taza completamente " +cafetera.getCantidadActual()+" mml");
        }else{
           cafetera.setCantidadActual(0);
        }        
    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
    /*
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se
 * añade a la cafetera la cantidad de café indicada.
    */
    public void agregarCafe(Cafetera cafetera, int cantidad){
        int cantidadTotal = cafetera.getCantidadActual()+cantidad;
        if (cantidadTotal > cafetera.getCapacidadMaxima()){
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }else{
            cafetera.setCantidadActual(cantidadTotal);
        }
    }
}
