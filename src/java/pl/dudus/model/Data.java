package pl.dudus.model;

import java.io.Serializable;

/**
 *
 * @author Patryk Duduś
 */
public class Data implements Serializable {
    private String id;
    private String nr;
    private String tytul;
    private String opis;


    public Data(String id, String nr, String tytul, String opis) {
        this.id = id;
        this.nr = nr;
        this.tytul = tytul;
        this.opis = opis;
    }
    
    public Data(String nr, String tytul, String opis){
        this.nr = nr;
        this.tytul = tytul;
        this.opis = opis;
    }

    public String getId() {
        return id;
    }

    public String getNr() {
        return nr;
    }

    public String getTytul() {
        return tytul;
    }

    public String getOpis() {
        return opis;
    }

    @Override
    public String toString() {
        return "TDane{" + "id=" + id + ", nr=" + nr + ", tytul=" + tytul + ", opis=" + opis + '}';
    }
}
