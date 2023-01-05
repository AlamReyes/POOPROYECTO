/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 *
 * @author AlamLR
 */
public class ModuloGeneradorNombres {
     /**
     * Lista de nombres generados.
     */
    List<String> nombres = new ArrayList<>();
 /**
     * Lista de posibles nombres para el generador de nombres.
     */
        List<String> posiblesNombres = Arrays.asList("Sofia", "Maria","Jose", "Valentina", "Regina", "Camila", "Valeria", "Ximena", "Maria", "Fernanda", "Victoria", "Renata", "Santiago", "Mateo", "Sebastian", "Leonardo", "Matias", "Emiliano", "Daniel", "Gael", "Miguel","Angel", "Diego","Alejandra", "Ana", "Andrés", "Ángela", "Antonio", "Araceli", "Carlos", "Cecilia", "Clara", "Cristina", "David", "Eduardo", "Elena", "Esteban", "Felipe", "Gabriel", "Gerardo", "Gloria", "Guadalupe", "Héctor", "Hugo", "Ignacio", "Iván", "Jacqueline", "Jorge", "Juan", "Karla", "Laura");
        /**
     * Lista de posibles apellidos para el generador de nombres.
     */
        List<String> posiblesApellidos = Arrays.asList("Arenas", "Carmona", "Castillejos", "Córdova", "Corona", "Delgado", "Díaz", "Enciso", "Esquivel", "Fernández","Ferreira", "Flores", "Fuentes", "Galindo", "García", "Gil", "González", "Guadarrama", "Jasso", "Hernández","Juárez", "Lara", "Lemus", "León", "López", "Maldonado", "Marín", "Martínez", "Sosa", "Peralta","De los Santos", "Campos", "Rodríguez", "Valdez", "Ibáñez", "Rojas", "Flores", "Millán", "Mimbrera", "Nava","Pardo", "Peñaloza", "Pérez", "Reyes", "Reza", "Román", "Rueda", "Romero", "Vargas", "Toledo");
         /**
     * Genera un nombre completo aleatorio a partir de la lista de posibles nombres y apellidos.
     * 
     * @return El nombre completo generado.
     */
         public String generate(){
            // Obtenemos una lista de nombres aleatorios
            List<String> nombres = generarNombreAleatorio(posiblesNombres);
            // Obtenemos una lista de apellidos aleatorios
            List<String> apellidos = generarApellidoAleatorio(posiblesApellidos);
            // Creamos el nombre completo uniendo ambos
            String nombreCompleto = String.join(" ", nombres) + " " + String.join(" ", apellidos);
            return nombreCompleto;
        }
        
                /**
        * Obtiene una lista de nombres aleatorios a partir de la lista de posibles nombres.
        * 
        * @param posiblesNombres  La lista de posibles nombres.
        * @return Una lista con los nombres aleatorios seleccionados.
        */
        private static List<String> generarNombreAleatorio(List<String> posiblesNombres) {
            // Inicializamos un objeto Random para generar números aleatorios
            Random rand = new Random();
            // Generamos un número aleatorio entre 0 y 1
            int numNombres = rand.nextInt(2);
            if (numNombres == 0) {
                // Retornamos un solo nombre
                int index = rand.nextInt(posiblesNombres.size());
                return Arrays.asList(posiblesNombres.get(index));
            } else {
                 // Retornamos una lista con dos nombres
                int index1 = rand.nextInt(posiblesNombres.size());
                int index2 = rand.nextInt(posiblesNombres.size());
                return Arrays.asList(posiblesNombres.get(index1), posiblesNombres.get(index2));
            }
          }
        /**
        * Obtiene una lista de apellidos aleatorios a partir de la lista de posibles apellidos.
        * 
        * @param posiblesApellidos  La lista de posibles apellidos.
        * @return Una lista con los apellidos aleatorios seleccionados.
        */

        private static List<String> generarApellidoAleatorio(List<String> posiblesApellidos) {
            // Inicializamos un objeto Random para generar números aleatorios
            Random rand = new Random();
            // Obtenemos dos índices aleatorios para seleccionar dos apellidos
            int index1 = rand.nextInt(posiblesApellidos.size());
            int index2 = rand.nextInt(posiblesApellidos.size());
            // Retornamos la lista con los dos apellidos seleccionado
            return Arrays.asList(posiblesApellidos.get(index1), posiblesApellidos.get(index2));
            }
}
