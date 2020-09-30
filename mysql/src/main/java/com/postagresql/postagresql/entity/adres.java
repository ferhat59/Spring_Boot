package com.postagresql.postagresql.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class adres implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String adres;
    @Enumerated
     Tur tur;
    private boolean aktif;
    @ManyToOne
    @JoinColumn(name = "adresid")
    kisi kisi;

  public  enum Tur {
        EvAdresi,
        IsAdresi,
        Diger
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Tur getTur() {
        return tur;
    }

    public void setTur(Tur tur) {
        this.tur = tur;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public com.postagresql.postagresql.entity.kisi getKisi() {
        return kisi;
    }

    public void setKisi(com.postagresql.postagresql.entity.kisi kisi) {
        this.kisi = kisi;
    }
}
