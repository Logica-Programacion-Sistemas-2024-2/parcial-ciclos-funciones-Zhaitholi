
package parcial1g1;

public class App {

   public static void main(String[] args) {
        
        // Implementar la logica de solucion

        try {

            //Datos de entrada

            int cantidadAutos = 0;
            int metrosRecorridos = 0;
            

            //Datos de Salida
            float litrosConsumidos =0;
            float LitrosConsumidosTotal = 0;

            //proceso
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese la cantidad de autos");
            cantidadAutos = sc.nextInt();

            System.out.println("Cuantos metro recorrido");
            metrosRecorridos = sc.nextInt();

            

            if(cantidadAutos > 0 && metrosRecorridos > 0);{
            for (i = 1; i <= cantidadAutos ; i++);{
                 System.out.println("Ingrese la distancia recorrida por el vehiculo");
                metrosRecorridos = sc.nextInt();

                consumoGasolina = (metrosRecorridos * 55) / 750;
                kmRecorridos = (metrosRecorridos / 1000);
            }

            }

          

                    


            

            
        









            
        } catch (Exception e) {
       
        }

        
        
    }

    /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
    */
    //------------------------------------------------------------------
    //Implemente la funcion en este espacio
    public static float calcularConsumoGasolina(float kmRecorrido){
        try { 



            
        } catch (Exception e) {
            
        }
        
        return ((kmRecorrido * 55) / 750);
    }
    //------------------------------------------------------------------

}

