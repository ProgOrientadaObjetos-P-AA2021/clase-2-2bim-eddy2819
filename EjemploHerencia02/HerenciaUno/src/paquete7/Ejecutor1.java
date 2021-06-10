/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete7;

import paquete9.EstudianteDistancia;

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
        
        //Creación de un objeto de tipo EstudiantePresencial
        
        System.out.println("======================");
        System.out.println("Estudiante Presencial");
        String nom = "Jose";
        String ape = "Perez";
        String ident = "11023654";
        int ed = 26;
        int numCredito = 10;
        double costoCredito = 80.5;
        EstudiantePresencial estupre = new EstudiantePresencial(nom,ape,
                ident,ed,numCredito,costoCredito);
        estupre.calcularMatriculaPresencial();
        
        System.out.println(estupre);
    }
}
