package org.example.clasesSeleccion;

import java.util.Scanner;

public class Jugador {
    Scanner entradaDatos = new Scanner(System.in);

    //Atributos
    private int numeroCamiseta;
    private String nombre;
    private String apellido;
    private String posicion;
    private int edad;
    private String equipoJugador;

    // método constructor


    public Jugador() {
    }

    public Jugador(int numeroCamiseta, String nombre, String apellido, String posicion, int edad, String equipoJugador) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.edad = edad;
        this.equipoJugador = equipoJugador;
    }

    // get y set

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        while(edad <= 17){
            System.out.print("La edad debe ser mayor de 17 años, ingrese la edad nuevamente: ");
            edad = entradaDatos.nextInt();
        }
        this.edad = edad;
    }

    public String getEquipoJugador() {
        return equipoJugador;
    }

    public void setEquipoJugador(String equipoJugador) {
        this.equipoJugador = equipoJugador;
    }

}// fin clase jugador










