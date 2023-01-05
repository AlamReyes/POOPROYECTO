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
public class CrearAlumno {
    Scanner datos = new Scanner(System.in);
    //Para crear un alumno se utiliza la siguiente clase que llenara a traves de un scanner los valores de cada elemento
    public Alumno generarAlumno(int id){
        Alumno nuevoAl = new Alumno();
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
        nuevoAl.setNombre(datos.nextLine());
        System.out.println("\nEscribe la edad en el rango de 18-22: ");   
        
        nuevoAl.setEdad(Integer.parseInt(datos.nextLine()));
        System.out.println("\nEscribe la direccion: ");
        nuevoAl.setDirecciones(datos.nextLine());
        System.out.println("\nEscribe el semestre: ");
        nuevoAl.setSemestre(datos.nextLine());
        System.out.println("\nEscribe el promedio: ");
        nuevoAl.setPromedio(Float.parseFloat(datos.nextLine()));
        System.out.println("\nEscribe las materias separadas por espacio: ");
        nuevoAl.setMaterias(datos.nextLine());
        //asigAprobadaOrd
        n2=((float)Math.random()*(max4-min3)+min3);
        //asigInscritaOrd
        n3=((float)Math.random()*(max6-min5)+min5);
        //credAlumno
        n4=((float)Math.random()*(max8-min7)+min7);
        //credDesdeIngreso
        n5=((float)Math.random()*(max10-min9)+min9);
        if (nuevoAl.getPromedio()>5){
        float d1 = inscripcion.escolaridad(n2, n3);
        float d2 = inscripcion.velocidad(n4, n5);
        float d3 = inscripcion.indicadorEscolar(d1, d2, nuevoAl.getPromedio());
        nuevoAl.setNumInscripcion(d3);
        }
        nuevoAl.setId(id);
        System.out.println("\nLos datos del alumno creado son: ");
        System.out.println("Id: "+ nuevoAl.getId() + "\nNombre: " + nuevoAl.getNombre()+ "\nEdad: "+ nuevoAl.getEdad() + "\nDireccion: "+ nuevoAl.getDirecciones()+ "\nSemestre: "+ nuevoAl.getSemestre()+ "\nPromedio: "+ nuevoAl.getPromedio()+ "\nMaterias: " + nuevoAl.getMaterias()+"\nNumInscripcion: "+nuevoAl.getNumInscripcion() +"\n");
        
        return nuevoAl;
    }
    
    
    
}
