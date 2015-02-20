/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.DCAD.Models;

import Com.DCAD.Entities.CentroDiagnostico;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cpe
 */
@Stateless
public class CentroDiagnosticoFacade extends AbstractFacade<CentroDiagnostico> {
    @PersistenceContext(unitName = "ProyectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CentroDiagnosticoFacade() {
        super(CentroDiagnostico.class);
    }
    
}
