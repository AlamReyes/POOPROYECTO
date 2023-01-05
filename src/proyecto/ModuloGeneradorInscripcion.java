/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author javierluna
 */
class DatosInscipcion {
    /**
     * Calcula y retorna el porcentaje de asignaturas aprobadas en relación con las asignaturas inscritas.
     *
     * @param asigAprobadaOrd El número de asignaturas aprobadas.
     * @param asigInscritaOrd El número de asignaturas inscritas.
     * @return El porcentaje de asignaturas aprobadas en relación con las asignaturas inscritas.
     */
    public float escolaridad (float asigAprobadaOrd, float asigInscritaOrd){
        float escolaridad = (asigAprobadaOrd/asigInscritaOrd) * 100;
        return escolaridad;
    }
    /**
     * Calcula y retorna el porcentaje de créditos obtenidos en relación con los créditos cursados desde el ingreso.
     *
     * @param credAlumno El número de créditos obtenidos.
     * @param credDesdeIngreso El número de créditos cursados desde el ingreso.
     * @return El porcentaje de créditos obtenidos en relación con los créditos cursados desde el ingreso.
     */
    public float velocidad (float credAlumno, float credDesdeIngreso){
        float velocidad =(credAlumno / credDesdeIngreso)*100;
        return velocidad;
    }
    /**
     * Calcula y retorna el indicador escolar de un alumno.
     *
     * @param escolaridad El porcentaje de asignaturas aprobadas en relación con las asignaturas inscritas.
     * @param velocidad El porcentaje de créditos obtenidos en relación con los créditos cursados desde el ingreso.
     * @param promedio El promedio acumulado del alumno.
     * @*/
    public float indicadorEscolar (float escolaridad,float velocidad, float promedio){
        float indicadorEscolar = promedio * escolaridad * velocidad;
        return  indicadorEscolar;
    }
    /**
    * Imprime en pantalla el promedio, la velocidad y la escolaridad de un alumno, así como su indicador escolar.
    *
    * @param escolaridad El porcentaje de asignaturas aprobadas en relación con las asignaturas inscritas.
    * @param velocidad El porcentaje de créditos obtenidos en relación con los créditos cursados desde el ingreso.
    * @param indicadorEscolar El indicador escolar de un alumno.
    * @param promedio El promedio acumulado del alumno.
    */
    public void imprimir(float escolaridad, float velocidad, float indicadorEscolar, float promedio){
        System.out.println("Promedio: "+ promedio + " Velocidad: "+ velocidad + " Escolaridad: " + escolaridad);
        System.out.println("El indicador escolar es: "+ indicadorEscolar);
    }
}
