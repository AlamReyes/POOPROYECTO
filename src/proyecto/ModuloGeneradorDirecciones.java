/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlamLR
 */
public class ModuloGeneradorDirecciones {
    /**
     * Archivo de texto con las direcciones a leer.
     */
    File file = new File("C:\\Users\\AlamLR\\Documents\\NetBeansProjects\\Proyecto\\src\\proyecto\\direcciones");
    /**
     * Genera una lista de direcciones a partir del contenido del archivo especificado.
     * 
     * @return Una lista con las direcciones leídas del archivo.
     */
    public List<String> generar() {
    // Lista de direcciones a retornar
    List<String> direcciones = new ArrayList<>();
    try {
        // Inicializamos un BufferedReader para leer el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;                
            // Leemos cada línea del archivo
            while ((line = br.readLine()) != null) {
                // Agregamos la línea a la lista de direcciones
                direcciones.add(line);
            }
        }
    } catch (IOException e) {
        // Si ocurre un error al leer el archivo, imprimimos una traza de la pila de llamadas
        e.printStackTrace();
    }
    // Retornamos la lista de direcciones
    return direcciones;
}
            
}
