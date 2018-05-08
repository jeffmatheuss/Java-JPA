/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.entidades;

/**
 *
 * @author Matheus
 */
public class Paciente {

    private int idPaciente;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getComprovRes() {
        return comprovRes;
    }

    public void setComprovRes(String comprovRes) {
        this.comprovRes = comprovRes;
    }
    private String nome;
    private String rg;
    private int cpf;
    private String comprovRes;
    

}
