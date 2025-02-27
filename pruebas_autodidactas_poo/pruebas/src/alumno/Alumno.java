package alumno;

public class Alumno {
    int matricula;
    int cuatrimestre;
    String grupo;
    String nombre;
    String apellido;
    String carrera;

    public Alumno(){ //Constructor
    }

    /*
     * Que es SQL
     * Los mandatos de SQL se divien en 3 grupos diferentes
     * El primero es ddl, segundo dml, tercerom dcl
     * Cuales son los tipos de datos que admite SQL
     * Que son los operadores en SQL
     * Como se crea una tabla o cual es la sentencia para crear una tabla
     * Cuales la sentencia para crear una base de datos
     * Como se agrega una columna
     * Como se elimina una columna
     * Para que me sirve la sentencia update
     * Cual es la sentencia para eliminar valores en una tabla
     * Cual es la sentencia para eliminar toda una base de datos
     * 
     * 
     */

    public Alumno(int matricula, int cuatrimestre, //Constructoreal
    String grupo, String nombre, String apellido, String carrera){
        this.matricula = matricula;
        this.cuatrimestre = cuatrimestre;
        this.grupo = grupo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
/*
    public int getcuatrimestre(){
        return cuatrimestre;
    }

    public void setcuatrimestre(int cuatrimestre){
        this.cuatrimestre = cuatrimestre;
    }

    public String grupo(){
        return grupo;
    }

    public void setgrupo(String grupo){
        this.grupo = grupo;
    }


    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }


    public String getapellido(){
        return apellido;
        
    }

    public void setapellido(String apellido){
        this.apellido = apellido;
    }

    public String getcarrera(){
        return carrera;
    }

    public void setcarrera(String carrera){
        this.carrera = carrera;
    }

   public String mostrarDatos() {
        return "Matricula: " + matricula + "\n" +
               "Cuatrimestre: " + cuatrimestre + "\n" +
               "Grupo: " + grupo + "\n" +
               "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "Carrera: " + carrera;
    }
    */
}
