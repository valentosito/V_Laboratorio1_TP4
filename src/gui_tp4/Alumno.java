
package gui_tp4;

import java.util.HashSet;

public class Alumno {
    
    private int nroLegajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> setDeMaterias; // AGREGACIÓN

    
    public Alumno(int nroLegajo, String apellido, String nombre) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.setDeMaterias = new HashSet<>(); // AGREGACIÓN. Se inicializa en el constructor el set, pero no a Materia en sí.
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getSetDeMaterias() {
        return setDeMaterias;
    }

    public void setSetDeMaterias(HashSet<Materia> setDeMaterias) {
        this.setDeMaterias = setDeMaterias;
    }
    
    
    public boolean  agregarMateria(Materia materia){
        
        return setDeMaterias.add(materia);  // true o false
    }

    
    public int cantidadMaterias(){
        
        return setDeMaterias.size();
    }
    
    
    
    @Override
    public String toString() {
        return "Alumno{" + "nroLegajo=" + nroLegajo + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }

    
    
    
    
}
