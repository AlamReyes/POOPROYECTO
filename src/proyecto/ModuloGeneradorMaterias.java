/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author AlamLR
 */
public class ModuloGeneradorMaterias {
    /**
     * Lista de materias disponibles para el generador de materias.
     */
    String[] materias= {
            "Algebra","Calculo y Geometria Analitica","Quimica","Fundamentos de Fisica","Fundamentos de Programacion",
            "Algebra Lineal","Calculo Integral","Mecanica","Redaccion y Exposicion de Temas de Ingenieria","Estructura de Datos y Aalgoritmos I",
            "Probabilidad","Calculo Vectorial","Ecuacion Diferenciales","Cultura y Comunicacion","Estructura de Datos y Aalgoritmos II","Programacion Orientada a Objetos",
            "Fundamentos de Estadistica","Electricidad y Magnetismo","Analisis Numerico","Matematicas Avanzadas","Estructuras Discretas",
            "Estructura y Programacion de Computadoras","Dispositivos Electronicos","Lenguajes Formales y Automatas","Señales y Sistemas","Ingenieria de Software",
            "Sistemas Operativos","Diseña Digital Moderno","Base de Datos","Circuitos Electricos","Administracion de Proyectos de Software",
            "Finanza en la Ingenieria en Computacion","Diseño Digital VLSI","Inteligencia Artificial","Compiladores","Sistema de Comunicaciones","Introduccion a la Economia",
            "Optativa de Ciencias Sociales y Humanidades","Microcomputadoras","Computacion Grafica e Interaccion Humano-Computadora","Etica Profesional","Redes de Datos Seguras",
            "Organizacion y Arquitectura de Computadoras","Fundamentos de Sistemas Embebidos","Sistemas Distribuciones","Optativa de Campo de Profundizacion","Recursos y Necesidades de Mexico",
            "Computacion Grafica Avanzada","Seguridad informatica","Computo Movil","Administracion de Redes","Robots Movilies"};
        /**
        * Índices de las materias seleccionadas aleatoriamente.
        */
        int p,s,t,c,q;
        /**
        * Materias seleccionadas aleatoriamente.
        */
        String primero,segundo,tercero,cuarto,quinto;
        /**
         * Genera y retorna una lista con cinco materias aleatorias.
        *
        * @return Una lista con cinco materias aleatorias.
        */
    public String generar(){
        //materia 1
        // Seleccionamos una materia aleatoria
            p= numeroAleatorioEnRango(0,materias.length - 1);
            primero= materias[p];
            //materia 2
            s= numeroAleatorioEnRango(0,materias.length - 1);
            segundo= materias[s];
            //materia 3
            t= numeroAleatorioEnRango(0,materias.length - 1);
            tercero= materias[t];
            //materia 4
            c= numeroAleatorioEnRango(0,materias.length - 1);
            cuarto= materias[c];
            //materia 5
            q= numeroAleatorioEnRango(0,materias.length - 1);
            quinto= materias[q];
            // Retornamos la lista con las cinco materias seleccionadas
            return  primero+" , " + segundo +" , " + tercero +" , " + cuarto + " , " + quinto; 
    }
    /**
     * Genera un número aleatorio en el rango especificado.
     *
     * @param minimo El límite inferior del rango (inclusive).
     * @param maximo El límite superior del rango (inclusive).
     * @return Un número aleatorio en el rango especificado.
     */
    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
