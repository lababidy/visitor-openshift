package org.lababidy.database;
// Generated Jun 27, 2014 9:57:54 PM by Hibernate Tools 3.6.0
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Course generated by hbm2java
 */
@XmlRootElement
public class Course  implements java.io.Serializable {


    private int cid;
    private String cname;
    private String cnotes;
 
    public int getcid() {
        return this.cid;
    }

    public void setcid(int cid) {
        this.cid = cid;
    }
    public String getcname() {
        return this.cname;
    }
    
    public void setcname(String cname) {
        this.cname = cname;
    }
    public String getcnotes() {
        return this.cnotes;
    }
    
    public void setcnotes(String cnotes) {
        this.cnotes = cnotes;
    }
    
    @Override
    public String toString() {
        return cid + " " + cname;
    }

    public String toStringfull() {
        return cid + "|" + cname + "|" + cnotes;
    }

    /*
     @Override
     public int hashCode() {
        int hash = 0;
        hash += (cname != null ? cname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        String othercname = "";        if (object instanceof Course) {
            othercname = ((Course) object).cname;        } else if (object instanceof String) {
            othercname = (String) object;        } else {
            return false;
        }

        if ((this.cname == null && othercname != null) || (this.cname != null && !this.cname.equals(othercname))) {            return false;
        }
        return true;
    }
*/

}


