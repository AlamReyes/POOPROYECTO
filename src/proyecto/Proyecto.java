/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 *
 * @author AlamLR
 */
public class Proyecto {

    
    public static void main(String[] args) {
        // ModuloGeneradorNombres y ModuloGeneradorDirecciones son clases que se encargan
        // de generar nombres y direcciones aleatorias.
        ModuloGeneradorNombres nombre = new ModuloGeneradorNombres();
        ModuloGeneradorDirecciones direccion = new ModuloGeneradorDirecciones();
        // ModuloGeneradorMaterias es una clase que se encarga de generar materias aleatorias.
        ModuloGeneradorMaterias materias = new ModuloGeneradorMaterias();
        // DatosInscripcion es una clase que contiene métodos para calcular el número de inscripción de un estudiante.
        DatosInscipcion inscripcion = new DatosInscipcion();
        // Scanner se utiliza para leer opciones del menú del usuario.
        Scanner lector = new Scanner(System.in);
        // Estas variables se utilizan para generar edades aleatorias para los estudiantes.
        int min = 18;
        int max = 22;
        // Estas variables se utilizan para generar valores aleatorios para los atributos de los estudiantes.
        float n2, n3, n4, n5;
        float min1, max2,min3, max4, min5, max6, min7, max8, min9, max10;
        // min3 y max4 se utilizan para generar valores aleatorios para asigAprobadaOrd.
        //Para asigAprobadaOrd °
        min3=1.0f;
        max4=50.0f;
        //Para asigInscritaOrd °
        // min5 y max6 se utilizan para generar valores aleatorios para asigInscritaOrd.
        min5=5.0f;
        max6=7.0f;
        //Para credAlumno °
        // min7 y max8 se utilizan para generar valores aleatorios para credAlumno.
        min7=8.0f;
        max8=46.0f;
        //Para credDesdeIngreso °
        // min9 y max10 se utilizan para generar valores aleatorios para credDesdeIngreso.
        min9=46.0f;
        max10=438.0f;
        // min1 y max2 se utilizan para generar valores aleatorios para el promedio de los estudiantes.
        min1=5.0f;
        max2=10.0f;
        // alumnos es una lista que almacena objetos de tipo Alumno.
        ArrayList<Alumno> alumnos = new ArrayList<>();
        // todasLasDirecciones es una lista que almacena todas las direcciones generadas por la clase ModuloGeneradorDirecciones.
        List<String> todasLasDirecciones = direccion.generar();
        // Este bucle for se encarga de crear 500 estudiantes y agregarlos a la lista alumnos.
        // Cada estudiante tiene un ID único, un nombre generado aleatoriamente, una edad aleatoria entre 18 y 22 años,
        // una dirección de la lista todasLasDirecciones, un semestre calculado a partir de su edad y un promedio aleatorio.
        // También se le asignan materias aleatorias.
        for ( int i = 0; i <= 500; i++) {
            Alumno alumno = new Alumno();
            alumno.setId(i);
            alumno.setNombre(nombre.generate());
            alumno.setEdad((int) ((Math.random()*((max-min)+1))+min));
            alumno.setDirecciones(todasLasDirecciones.get(i % todasLasDirecciones.size()));
            alumno.setSemestre(obtenerSemestre(alumno.getEdad()));
            alumno.setPromedio(((float)Math.random()*(max2-min1)+min1));
            alumno.setMaterias(materias.generar());
            //asigAprobadaOrd
            n2=((float)Math.random()*(max4-min3)+min3);
            //asigInscritaOrd
            n3=((float)Math.random()*(max6-min5)+min5);
            //credAlumno
            n4=((float)Math.random()*(max8-min7)+min7);
            //credDesdeIngreso
            n5=((float)Math.random()*(max10-min9)+min9);
            // Si el promedio del estudiante es mayor a 5, se calcula su número de inscripción utilizando el método escolaridad
            // y velocidad de la clase DatosInscripcion y se agrega el estudiante a la lista alumnos.
            if (alumno.getPromedio()>5){
            float d1 = inscripcion.escolaridad(n2, n3);
            float d2 = inscripcion.velocidad(n4, n5);
            float d3 = inscripcion.indicadorEscolar(d1, d2, alumno.getPromedio());
            alumno.setNumInscripcion(d3);
            alumnos.add(alumno);
            
        }
        
        
    }
    boolean corriendo = true;
    // Este bucle while se encarga de mostrar el menú al usuario y realizar las acciones seleccionadas hasta que el usuario
    while (corriendo) {
        System.out.println("Bienvenido al Menu");
        System.out.println("1. Crear");
        System.out.println("2. Leer");
        System.out.println("3. Actualizar");
        System.out.println("4. Borrar");
        System.out.println("5. Exporta los datos a CSV");
        System.out.println("6. Imprime todos los registros");
        System.out.println("7. Salir");

        System.out.print("Ingresa una opcion valida: ");
        int choice = lector.nextInt();
        // Este switch case se encarga de realizar las acciones seleccionadas por el usuario en el menú.
        switch (choice) {
          case 1:
              //La opcion uno crea un alumno usando la clase Crear alumno y lo agrega al final de la lista de alumnos
                CrearAlumno crear = new CrearAlumno();
                Alumno x = crear.generarAlumno(alumnos.size()+1);
                alumnos.add(x);
            break;
          case 2:
              // Solicita al usuario que ingrese el ID del alumno que quiere buscar
              System.out.println("Escribe el ID del alumno que quieres leer su informacion");
              // Asigna a la variable idEncontrado el valor ingresado por el usuario
              int idEncontrado = lector.nextInt();
              // Verifica si el ID ingresado es mayor que la cantidad de elementos en la lista de alumnos
              if(idEncontrado>alumnos.size()){
                  System.out.println("Fuera del rango");
              }
              // Inicializa la variable alumnoEncontrado como null  
              Alumno alumnoEncontrado = null;
              // Itera sobre cada elemento de la lista alumnos
              for (Alumno alumno : alumnos) {
                  // Si es igual, asigna el objeto alumno actual a alumnoEncontrado
                  if (alumno.getId() == idEncontrado) {
                      alumnoEncontrado = alumno;
                      break;
                  }
              }
              // Verifica si se encontró un alumno con el ID ingresado
              if (alumnoEncontrado != null) {
                  // Si se encontró, muestra la información del alumno por pantalla
                    System.out.println("Id: "+ alumnoEncontrado.getId() + "\nNombre: " + alumnoEncontrado.getNombre()+ "\nEdad: "+ alumnoEncontrado.getEdad() + "\nDireccion: "+ alumnoEncontrado.getDirecciones()+ "\nSemestre: "+ alumnoEncontrado.getSemestre()+ "\nPromedio: "+ alumnoEncontrado.getPromedio()+ "\nMaterias: " + alumnoEncontrado.getMaterias()+"\nNumInscripcion: "+alumnoEncontrado.getNumInscripcion() +"\n");
              }
            break;
          case 3:
              //misma funcion que el punto para encontrar al alumno, solo que modifica los valores ya dados
            System.out.println("Escribe el ID del alumno que quieres modificar su informacion");
            int idModificar = lector.nextInt();
            if(idModificar>alumnos.size()){
                  System.out.println("Fuera del rango");
              }
            Alumno alumnoModificado = null;
            for (Alumno alumno : alumnos) {
                if (alumno.getId() == idModificar) {
                    alumnoModificado = alumno;
                    break;
                }
            }
            if (alumnoModificado != null) {
                  ModificarAlumno modificado = new ModificarAlumno();
                  modificado.modificarAlumno(alumnoModificado);
                  
            }
            break;
          case 4:
              //misma funcion que el  leer o modificar solo que este elimina al elemento de la funcion y re ordena los ids
            System.out.println("Escribe el ID del alumno que quieres borrar su informacion");
            int idBorrar = lector.nextInt();
            if(idBorrar>alumnos.size()){
                  System.out.println("Fuera del rango");
              }
            Alumno alumnoBorrado = null;
            for (Alumno alumno : alumnos) {
                if (alumno.getId() == idBorrar) {
                    alumnoBorrado = alumno;
                    break;
                }
            }
            if (alumnoBorrado != null) {
                  alumnos.remove(alumnoBorrado);
            }
            //Reordenando los IDs
            int nuevoID = 1;
            for (Alumno alumno : alumnos) {
              alumno.setId(nuevoID);
              nuevoID++;
            }
            break;
          case 5:
                // Este código crea un archivo CSV con la información de una lista de objetos Alumno
                // Utilizamos un StringBuilder para construir la cadena de texto que se escribirá en el archivo
              StringBuilder sb = new StringBuilder();
              // Añadimos la primera línea del archivo CSV, que consiste en una lista de nombres de campo separados por comas
              sb.append("id,nombre,edad,direcciones,semestre,promedio,materias,numInscripcion");
              // Añadimos un salto de línea al final de la primera línea
              sb.append("\n");
              // Iteramos sobre la lista de alumnos
              for (Alumno alumno : alumnos) {
                  // Añadimos los atributos del alumno a la cadena, separados por comas
                    sb.append(alumno.getId());
                    sb.append(",");
                    sb.append(alumno.getNombre());
                    sb.append(",");
                    sb.append(alumno.getEdad());
                    sb.append(",");
                    sb.append(alumno.getDirecciones());
                    sb.append(",");
                    sb.append(alumno.getSemestre());
                    sb.append(",");
                    sb.append(alumno.getPromedio());
                    sb.append(",");
                    sb.append(alumno.getMaterias());
                    sb.append(",");
                    sb.append(alumno.getNumInscripcion());
                    // Añadimos un salto de línea al final de cada línea
                    sb.append("\n");
                }
              // Creamos un objeto File con el nombre del archivo que queremos crear
              File file = new File("alumnos.csv");
              // Creamos un objeto BufferedWriter para escribir en el archivo
              // Utilizamos un bloque try-with-resources para asegurarnos de que se cierre el flujo de 
              try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))) {
                    // Escribimos la cadena de texto completa en el archivo
                        writer.write(sb.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
              // Si todo ha ido bien, imprimimos un mensaje de éxito
              System.out.println("Archivo creado con exito!\n");
            break;
          
          case 6:
              for (Alumno alumno1 : alumnos) {
                  System.out.println(alumno1);
              }
              break;
          case 7:
            System.out.println("Saliendo del Programa.");
            corriendo = false;
            break;
        default:
            System.out.println("Intenta de Nuevo");
        }
      }

}
    // obtenerSemestre es un método que recibe una edad y devuelve el semestre correspondiente.
    
    private static String obtenerSemestre(int edad){
            String semestre = "";
            if (edad == 18){
                semestre = "primer semestre";
            }else if(edad == 18){
                semestre ="segundo semestre";
            }else if(edad == 19){
                semestre ="tercer semestre";
            }else if(edad == 19){
                semestre ="cuarto semestre";
            }else if(edad == 20){
                semestre ="quinto semestre";
            }else if(edad == 20){
                semestre ="sexto semestre";
            }else if(edad == 21){
                semestre ="septimo semestre";
            }else if(edad == 21){
                semestre ="octavo semestre";
            }else if(edad == 22){
                semestre ="noveno semestre";
            }
            return semestre;
        }
    
}
