/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

public class Ejecutor1 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        System.out.println("Estudiante Distancia");
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;

        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad);

        estDistancia.establecerCostoAsignatura(50.5);
        estDistancia.establecerNumeroAsginaturas(5);
        estDistancia.calcularMatriculaDistancia();

        System.out.println(estDistancia);

        // creacion de un objeto de tipo EstudianPresencial
        System.out.println("======================");
        System.out.println("Estudiante Presencial");
        String nom = "Andres";
        String ap = "Juarez";
        String ide = "1102365878";
        int ed = 20;

        EstudiantePresencial estpres = new EstudiantePresencial(nom, ap, ide, ed);

        estpres.establecerCostoCredito(20.5);
        estpres.establecerNumeroCreditos(10);
        estpres.calcularMatriculaPresencial();

        System.out.println(estpres);
    }
}
