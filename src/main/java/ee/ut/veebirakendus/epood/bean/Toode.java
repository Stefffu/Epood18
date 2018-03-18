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
    private String nimetus;
    private String kirjeldus;
    private float kaal;
    private float hind;
    private int kogus_laos;

    protected Toode() {}

    public Toode(String nimetus, String kirjeldus, float kaal, float hind, int kogus_laos) {
        this.nimetus = nimetus;
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

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public String getKirjeldus() {
        return kirjeldus;
    }

    public void setKirjeldus(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }

    public float getKaal() {
        return kaal;
    }

    public void setKaal(float kaal) {
        this.kaal = kaal;
    }

    public float getHind() {
        return hind;
    }

    public void setHind(float hind) {
        this.hind = hind;
    }

    public int getKogus_laos() {
        return kogus_laos;
    }

    public void setKogus_laos(int kogus_laos) {
        this.kogus_laos = kogus_laos;
    }

    @Override
    public String toString() {
        return "Toode{" +
                "id=" + id +
                ", nimetus='" + nimetus + '\'' +
                ", kirjeldus='" + kirjeldus + '\'' +
                ", kaal=" + kaal +
                ", hind=" + hind +
                ", kogus_laos=" + kogus_laos +
                '}';
    }
}

