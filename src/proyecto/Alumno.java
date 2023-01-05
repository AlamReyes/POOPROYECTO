/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author AlamLR
 */
//Clase principal del Alumno que contendra el esquema del alumno, como su nombre, edad, etc.
public class Alumno {
    String nombre;
    int edad;
    String direcciones;
    String semestre;
    float promedio;
    String materias;
    float numInscripcion;
    int id;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String direcciones, String semestre, float promedio, String materias, float numInscripcion, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.direcciones = direcciones;
        this.semestre = semestre;
        this.id= id;
        this.promedio = promedio;
        this.materias = materias;
        this.numInscripcion = numInscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(String direcciones) {
        this.direcciones = direcciones;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public float getPromedio() {
        return promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public float getNumInscripcion() {
        return numInscripcion;
    }

    public void setNumInscripcion(float numInscripcion) {
        this.numInscripcion = numInscripcion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", direcciones=" + direcciones + ", semestre=" + semestre + ", promedio=" + promedio + ", materias=" + materias + ", numInscripcion=" + numInscripcion + ", id=" + id + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
