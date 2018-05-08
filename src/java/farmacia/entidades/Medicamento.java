/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.entidades;

import java.sql.Date;
import javax.persistence.*;

/**
 *
 * @author Matheus 
 */
@Entity
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMedicamento;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Date validade;

    @Column(nullable = false)
    private String lote;

    @Column(nullable = false)
    private String fornecedor;
    
    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }


}
