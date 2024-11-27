/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Paciente extends Persona{
    private String Proyecto, Codigo, Cargo;

    public Paciente(String Proyecto, String Codigo, String Cargo, String Nombre, String Apellido, String Email, String Telefono, String Documento) {
        super(Nombre, Apellido, Email, Telefono, Documento);
        this.Proyecto = Proyecto;
        this.Codigo = Codigo;
        this.Cargo = Cargo;
    }

    public Paciente(String Proyecto, String Codigo, String Cargo) {
        super();
        this.Proyecto = Proyecto;
        this.Codigo = Codigo;
        this.Cargo = Cargo;
    }
    
    public Paciente() {
        super();
        this.Proyecto = "";
        this.Codigo = "";
        this.Cargo = "";
    }

    public String getProyecto() {
        return Proyecto;
    }

    public void setProyecto(String Proyecto) {
        this.Proyecto = Proyecto;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return "\nPaciente: " + "\nProyecto: " + Proyecto + "\nCodigo: " + Codigo + "\nCargo: " + Cargo + "PRUEBA2";
    }
    
}
