package com.postagresql.postagresql.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class kisi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int ID;
     public String isim;
     public String soyisim;
    @OneToMany
    @JoinColumn(name = "adresid")
     public List<adres> adreler;

}
