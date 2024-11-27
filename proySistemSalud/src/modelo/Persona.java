/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Calendar;

public abstract class Persona {
    protected String Nombre, Apellido, Email, Telefono, Documento;
    protected Fecha fNac;

    public Persona(String Nombre, String Apellido, String Email, String Telefono, String Documento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Documento = Documento;
    }
    
    public Persona() {
        this.Nombre = "";
        this.Apellido = "";
        this.Email = "";
        this.Telefono = "";
        this.Documento = "";
    }  

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public Fecha getfNac() {
        return fNac;
    }

    public void setfNac(Fecha fNac) {
        this.fNac = fNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Email=" + Email + ", Telefono=" + Telefono + ", Documento=" + Documento + ", fNac=" + fNac + '}';
    }
    

    public int edad(){
        Calendar fecha = Calendar.getInstance();
        int edad = fecha.get(Calendar.YEAR) - this.fNac.getAa();
        if (fecha.get(Calendar.MONTH)+1 < this.fNac.getMm() || (this.fNac.getMm() == fecha.get(Calendar.MONTH)+1 && fecha.get(Calendar.DAY_OF_MONTH) < this.fNac.getDd())) {
                edad--;
        }
    return edad;
    }    
    
}
