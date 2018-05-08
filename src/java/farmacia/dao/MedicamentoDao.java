/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import farmacia.entidades.Medicamento;
import farmacia.util.HibernateUtil;

/**
 *
 * @author Matheus
 */
public class MedicamentoDao {

    Session sessao = null;

    public MedicamentoDao() {
        this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List getMedicamentos(String idMedicamento) {
        Transaction t = this.sessao.beginTransaction();
        List<Medicamento> listaMedicamentos = null;

        try {
            Query query = sessao.createQuery("from Medicamento as medicamento where medicamento.idMedicamento=" + idMedicamento);
            listaMedicamentos = (List<Medicamento>) query.list();

            t.commit();
        } catch (HibernateException a) {
            a.printStackTrace();
            t.rollback();
        }
        return listaMedicamentos;
    }
}
