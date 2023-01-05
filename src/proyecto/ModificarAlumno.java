/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author AlamLR
 */
public class ModificarAlumno {
     Scanner datos = new Scanner(System.in);
    //Para modificar al alumno se emplea la siguiente clase que remplaza los valores de cada elemento
    public Alumno modificarAlumno(Alumno modificado){
        float n2, n3, n4, n5;
        float min3, max4, min5, max6, min7, max8, min9, max10;
        min3=1.0f;
        max4=50.0f;
        //Para asigInscritaOrd °
        min5=5.0f;
        max6=7.0f;
        //Para credAlumno °
        min7=8.0f;
        max8=46.0f;
        //Para credDesdeIngreso °
        min9=46.0f;
        max10=438.0f;
       
        DatosInscipcion inscripcion = new DatosInscipcion();
        System.out.println("Escribe el nombre: ");
        modificado.setNombre(datos.nextLine());
        System.out.println("\nEscribe la edad en el rango de 18-22: ");   
        
        modificado.setEdad(Integer.parseInt(datos.nextLine()));
        System.out.println("\nEscribe la direccion: ");
        modificado.setDirecciones(datos.nextLine());
        System.out.println("\nEscribe el semestre: ");
        modificado.setSemestre(datos.nextLine());
        System.out.println("\nEscribe el promedio: ");
        modificado.setPromedio(Float.parseFloat(datos.nextLine()));
        System.out.println("\nEscribe las materias separadas por espacio: ");
        modificado.setMaterias(datos.nextLine());
        n2=((float)Math.random()*(max4-min3)+min3);
        //asigInscritaOrd
        n3=((float)Math.random()*(max6-min5)+min5);
        //credAlumno
        n4=((float)Math.random()*(max8-min7)+min7);
        //credDesdeIngreso
        n5=((float)Math.random()*(max10-min9)+min9);
        if (modificado.getPromedio()>5){
        float d1 = inscripcion.escolaridad(n2, n3);
        float d2 = inscripcion.velocidad(n4, n5);
        float d3 = inscripcion.indicadorEscolar(d1, d2, modificado.getPromedio());
        modificado.setNumInscripcion(d3);
        }
        System.out.println("\nLos datos del alumno modificado ahora son: ");
        System.out.println("Id: "+ modificado.getId() + "\nNombre: " + modificado.getNombre()+ "\nEdad: "+ modificado.getEdad() + "\nDireccion: "+ modificado.getDirecciones()+ "\nSemestre: "+ modificado.getSemestre()+ "\nPromedio: "+ modificado.getPromedio()+ "\nMaterias: " + modificado.getMaterias()+"\nNumInscripcion: "+modificado.getNumInscripcion() +"\n");
        
        return modificado;
    }
}
