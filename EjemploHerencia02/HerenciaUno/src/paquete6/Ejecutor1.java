/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

public class Ejecutor1 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        System.out.println("Estudiante Distancia");
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numAsignaturas = 5;
        double costoAsig = 50.5;
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad, numAsignaturas, costoAsig);

        estDistancia.calcularMatriculaDistancia();

        System.out.println(estDistancia);

        System.out.println("======================");
        System.out.println("Estudiante Presencial");
        String nom = "Pedro";
        String ape = "Loaiza";
        String ident = "1104566";
        int ed = 20;
        int numCredito = 9;
        double costoCredito = 90.5;
        EstudiantePresencial estup = new EstudiantePresencial(nom, ape,
                ident, ed, numCredito, costoCredito);
        estup.calcularMatriculaPresencial();

        System.out.println(estup);
    }

}
