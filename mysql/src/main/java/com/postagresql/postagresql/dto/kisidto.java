package com.postagresql.postagresql.dto;

import lombok.Data;

import java.util.List;

@Data
public class kisidto {
   public int ID;
    public String isim;
    public String soyisim;
    public List<String> adreler;

    @Override
    public String toString() {
        return "kisidto{" +
                "ID=" + ID +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adreler=" + adreler +
                '}';
    }


}
