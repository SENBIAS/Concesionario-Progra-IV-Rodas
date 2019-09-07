/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Sebastian
 */
public class Vendedor {
    private String id;
    private int autosVendidos;
    private int salario;
    private int totalVendido;
    private String password;

    public Vendedor(String id, int autosVendidos, int salario, int totalVendido, String password) {
        this.id = id;
        this.autosVendidos = autosVendidos;
        this.salario = salario;
        this.totalVendido = totalVendido;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAutosVendidos() {
        return autosVendidos;
    }

    public void setAutosVendidos(int autosVendidos) {
        this.autosVendidos = autosVendidos;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(int totalVendido) {
        this.totalVendido = totalVendido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
}
