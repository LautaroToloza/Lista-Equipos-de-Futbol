package Principal;

import java.util.*;

/**
 * @author Lautaro Toloza
 */
public class Principal {

    public static void main(String[] args) {
//        Consigna:
//        Generar una lista de equipos de futbol, cargarla y mostrarla
        List <String> listaEquipos = new ArrayList<>();
        cargarLista((ArrayList) listaEquipos);
        mostrarLista((ArrayList) listaEquipos);

    }
    public static String cargarEquipo(String texto){
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        String equipo = leer.nextLine();
        
        return equipo;
    }
    public static void cargarLista(ArrayList lista){
        String carga;
        boolean flag = true;
        while(flag){
            carga = cargarEquipo("Ingrese el nombre del equipo a cargar, finalice con un punto '.': ");
            if (carga.equals(".")) {
                flag = false;
            } else {
                lista.add(carga);
            }
    
        }
        System.out.println("Finalizo la carga de equipos!!");
    }
    public static void mostrarLista(ArrayList lista){
        System.out.println("\nMuestra de lista..");
        for (int i = 0; i < lista.size(); i++) {
            String texto= "El equipo ingresado en la posición ("+(i+1)+") es: "+lista.get(i);
            System.out.println(texto);
            
        }
    
    
    
    }
    
}
