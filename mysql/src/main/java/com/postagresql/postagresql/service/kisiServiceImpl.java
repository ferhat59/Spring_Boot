package com.postagresql.postagresql.service;

import com.postagresql.postagresql.dto.kisidto;
import com.postagresql.postagresql.entity.adres;
import com.postagresql.postagresql.entity.kisi;
import com.postagresql.postagresql.repo.adresrepo;
import com.postagresql.postagresql.repo.kisiRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class kisiServiceImpl implements KisiService {

    private final kisiRepo kisiRepo;

    private final adresrepo adresrepo;

    public kisiServiceImpl(com.postagresql.postagresql.repo.kisiRepo kisiRepo, com.postagresql.postagresql.repo.adresrepo adresrepo) {
        this.kisiRepo = kisiRepo;
        this.adresrepo = adresrepo;
    }

    @Override
    @Transactional
    public void save(kisidto kisidto) {
        kisi k = new kisi();

        k.ID = kisidto.ID;
        k.isim = kisidto.isim;
        k.soyisim = kisidto.soyisim;
        kisiRepo.save(k);
        List<adres> adresler = new ArrayList<>();
        kisidto.adreler.forEach(item -> {
            adres adre = new adres();
            adre.setAdres(item);
            adre.setTur(adres.Tur.Diger);
            adre.setKisi(k);
            adre.setAktif(true);
            adresler.add(adre);
        });
        adresrepo.saveAll(adresler);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<kisidto> getAll() {
        List<kisi> kisiler = kisiRepo.findAll();
        List<kisidto> kisidtos = new ArrayList<>();
        kisiler.forEach(it -> {
            kisidto k = new kisidto();
            k.setID(it.getID());
            k.setIsim(it.getIsim());
            k.setSoyisim(it.getSoyisim());
            k.setAdreler(it.getAdreler().stream().map(adres::getAdres).collect(Collectors.toList()));
            kisidtos.add(k);
        });
        return kisidtos;

    }

    @Override
    public Page<kisidto> getAll(Pageable pageable) {
        return null;
    }
}
