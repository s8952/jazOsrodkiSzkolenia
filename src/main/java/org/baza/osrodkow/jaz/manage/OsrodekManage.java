/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.baza.osrodkow.jaz.manage;

import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.baza.osrodkow.jaz.domain.Osrodek;

@Stateful
@Named("osrodekManage")
public class OsrodekManage {
    
    @PersistenceContext(unitName = "s8952JPU")
    private EntityManager em;
    
    public List<Osrodek> getOsrodki() {
        return em.createQuery("select o from Osrodek o").getResultList();
    }
    
    public void remove(Osrodek osrodek) {
        osrodek = em.merge(osrodek);
        em.remove(osrodek);
    }
 
    public void save(Osrodek osrodek) {
        em.merge(osrodek);
    }
}
