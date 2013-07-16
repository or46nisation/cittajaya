/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kwa.cittajaya;

import com.kwa.cittajaya.exceptions.NonexistentEntityException;
import com.kwa.core.GenericController;
import com.kwa.core.KWAMesg;
import com.kwa.core.Util;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author arinegara
 */
public class T010JpaController extends GenericController {

    public T010JpaController(EntityManagerFactory emf, EntityManager em) throws Exception {
        super(emf,em);
    }


    public KWAMesg create(T010 t010) throws Exception {
        
        checkConnection();
        setError("unknown", "unknownError");
        
        if(t010.getT010PK()==null){
            return setError("kode","Entity is null or spaces");
        }
        
        if (Util.isNullOrSpaces(t010.getT010PK().getTipe())) {
            return setError("Tipe", "Entity is null or spaces");
        }
        
        if (Util.isNullOrSpaces(t010.getT010PK().getKode())) {
            return setError("Kode", "Entity is null or spaces");
        }

        
        if (Util.isNullOrSpaces(t010.getDeksripsi())) {
            return setError("Deskripsi", "Entity is null or spaces");
        }
        
        T010PK tt = t010.getT010PK();
        T010 tmp = findT010(t010.getT010PK());
        if(tmp!=null){
            return setError("kode","Entry already exist");
        }
        
        getEm().persist(t010);
        return setOK("Entry Created");
    }

    public KWAMesg edit(T010 t010) throws  Exception {
        checkConnection();
        setError("unknown", "unknownError");
        
        if(t010.getT010PK()==null){
            return setError("kode","Entity is null or spaces");
        }
        
        if (Util.isNullOrSpaces(t010.getT010PK().getTipe())) {
            return setError("Tipe", "Entity is null or spaces");
        }
        
        if (Util.isNullOrSpaces(t010.getT010PK().getKode())) {
            return setError("Kode", "Entity is null or spaces");
        }
        
        getEm().merge(t010);
        return setOK("Entry Modified");
    }

    public KWAMesg destroy(T010PK id) throws NonexistentEntityException {

          checkConnection();
        setError("unknown", "unknownError");
        
        if(id==null){
            return setError("kode","Entity is null or spaces");
        }
        
        if (Util.isNullOrSpaces(id.getTipe())) {
            return setError("Tipe", "Entity is null or spaces");
        }
        
        if (Util.isNullOrSpaces(id.getKode())) {
            return setError("Kode", "Entity is null or spaces");
        }      
        
        
                T010 t010 = getEm().getReference(T010.class, id);
                t010.getT010PK();
        getEm().remove(t010);

        return setOK("Entry Deleted"); 
    }

    public List<T010> findT010Entities() {
        return findT010Entities(true, -1, -1);
    }

    public List<T010> findT010Entities(int maxResults, int firstResult) {
        return findT010Entities(false, maxResults, firstResult);
    }

    private List<T010> findT010Entities(boolean all, int maxResults, int firstResult) {
checkConnection();
        CriteriaQuery cq = getEm().getCriteriaBuilder().createQuery();
            cq.select(cq.from(T010.class));
            Query q = getEm().createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();

    }

    public T010 findT010(T010PK id) {
checkConnection();
            return getEm().find(T010.class, id);

    }

        public T010 findT010(String tipe, String kode) {
checkConnection();
            T010PK id = new T010PK(tipe,kode);
            return getEm().find(T010.class, id);

    }
        
    public int getT010Count() {
checkConnection();
            CriteriaQuery cq = getEm().getCriteriaBuilder().createQuery();
            Root<T010> rt = cq.from(T010.class);
            cq.select(getEm().getCriteriaBuilder().count(rt));
            Query q = getEm().createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();

    }
    
}