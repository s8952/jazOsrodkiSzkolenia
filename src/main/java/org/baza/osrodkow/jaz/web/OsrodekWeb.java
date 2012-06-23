
package org.baza.osrodkow.jaz.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import org.baza.osrodkow.jaz.domain.Osrodek;
import org.baza.osrodkow.jaz.manage.OsrodekManage;

@SessionScoped
@Named("osrodekWeb")
public class OsrodekWeb implements Serializable {
    
    private ListDataModel<Osrodek> osrodki = new ListDataModel<Osrodek>();
    private Osrodek osrodek;
    
    @Inject
    private OsrodekManage os;

    public ListDataModel<Osrodek> getOsrodki() {
        osrodki.setWrappedData(os.getOsrodki());
        return osrodki;
    }

    public Osrodek getOsrodek() {
        if(osrodek == null) {
            osrodek = new Osrodek();
        }
        return osrodek;
    }

    public void setOsrodek(Osrodek osrodek) {
        this.osrodek = osrodek;
    }
    
    public String addOsrodek() {
        return "addOsrodek";
    }
    
    public String editOsrodek() {
        osrodek = osrodki.getRowData();
        return "editOsrodek";
    }
    
    public String showOsrodek() {
        osrodek = osrodki.getRowData();
        return "showOsrodek";
    }
    
    public String deleteOsrodek() {
        osrodek = osrodki.getRowData();
        os.remove(osrodek);
        return "listAll";
    }
    
    public String saveOsrodek() {
        os.save(osrodek);
        return "listAll";
    }
}
