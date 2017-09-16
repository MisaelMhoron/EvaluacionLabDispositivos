package com.example.missa.evaluacionlabdispositivos;

/**
 * Created by missa on 16/09/2017.
 */



public class Estudiante {
    public String nombre;
    public String codigo;
    public  String materia;
    public  double parcial1;
    public  double parcial2;
    public  double parcial3;
    public  double promedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getParcial1() {
        return parcial1*0.3;
    }

    public void setParcial1(double parcial1) {
        this.parcial1 = parcial1;
    }

    public double getParcial2() {
        return parcial2*0.3;
    }

    public void setParcial2(double parcial2) {
        this.parcial2 = parcial2;
    }

    public double getParcial3() {
        return parcial3*0.3;
    }

    public void setParcial3(double parcial3) {
        this.parcial3 = parcial3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Estudiante(String nombre, String codigo, String materia, double parcial1, double parcial2, double parcial3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia = materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
    }

}
