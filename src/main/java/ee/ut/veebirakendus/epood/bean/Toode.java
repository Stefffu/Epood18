package ee.ut.veebirakendus.epood.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Toode")
public class Toode {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nimi;
    private String kirjeldus;
    private Float kaal;
    private Float hind;
    private Long kogus_laos;

    protected Toode() {}

    public Toode(String nimi, String kirjeldus, Float kaal, Float hind, Long kogus_laos) {
        this.nimi = nimi;
        this.kirjeldus = kirjeldus;
        this.kaal = kaal;
        this.hind = hind;
        this.kogus_laos = kogus_laos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getKirjeldus() {
        return kirjeldus;
    }

    public void setKirjeldus(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }

    public Float getKaal() {
        return kaal;
    }

    public void setKaal(Float kaal) {
        this.kaal = kaal;
    }

    public Float getHind() {
        return hind;
    }

    public void setHind(Float hind) {
        this.hind = hind;
    }

    public Long getKogus_laos() {
        return kogus_laos;
    }

    public void setKogus_laos(Long kogus_laos) {
        this.kogus_laos = kogus_laos;
    }

    @Override
    public String toString() {
        return "Toode{" +
                "id=" + id +
                ", nimi='" + nimi + '\'' +
                ", kirjeldus='" + kirjeldus + '\'' +
                ", kaal=" + kaal +
                ", hind=" + hind +
                ", kogus_laos=" + kogus_laos +
                '}';
    }
}

