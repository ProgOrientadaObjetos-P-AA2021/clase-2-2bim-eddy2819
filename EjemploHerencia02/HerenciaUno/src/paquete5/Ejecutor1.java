/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

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
        String nom = "Maria";
        String ape = "Morales";
        String ident = "11055649";
        int ed = 26;
        int numCredito = 8;
        double costoCredito = 40.5;
        EstudiantePresencial estupresen = new EstudiantePresencial(nom,ape,
                ident,ed,numCredito,costoCredito);
        estupresen.calcularMatriculaPresencial();
        
        System.out.println(estupresen);
       
    }
}
