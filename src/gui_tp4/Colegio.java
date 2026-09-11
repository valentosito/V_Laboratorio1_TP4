
package gui_tp4;


public class Colegio {
    
    
    public static void main (String[] args){
        
        Materia m1 = new Materia (123, "Web 2", 2);
        Materia m2 = new Materia (112, "Matemáticas 1", 1);
        Materia m3 = new Materia (113, "Laboratorio 1", 1);
        
        Alumno a1 = new Alumno (1001, "Lopez", "Martin");
        Alumno a2 = new Alumno (1002, "Martinez", "Brenda");
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        
        a2.agregarMateria(m3);
        
        System.out.println("Alumno " + a1.getApellido()+" "+ a1.getNombre() + " se ha inscripto a " + a1.cantidadMaterias()+" materias.");
        System.out.println("");
        System.out.println("Alumno " + a2.getApellido()+" "+a2.getNombre() + " se ha inscripto a " + a2.cantidadMaterias()+" materias.");
         
        
    }
    
}
