
package org.baza.osrodkow.jaz.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Osrodek implements Serializable {
    
    @Id 
    @GeneratedValue
    private Long id; 
    
    @NotNull
    private String nazwa;
    
    @NotNull
    private String kursy;
    
    private int liczbaKursantow;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKursy() {
        return kursy;
    }

    public void setKursy(String kursy) {
        this.kursy = kursy;
    }

    public int getLiczbaKursantow() {
        return liczbaKursantow;
    }

    public void setLiczbaKursantow(int liczbaKursantow) {
        this.liczbaKursantow = liczbaKursantow;
    }
}
