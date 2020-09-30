package com.postagresql.postagresql.service;

import com.postagresql.postagresql.dto.kisidto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KisiService {
    void save(kisidto kisidto);

    void delete(Long id);

    List<kisidto> getAll();

    Page<kisidto> getAll(Pageable pageable);
}
