package com.postagresql.postagresql.controller;


import com.postagresql.postagresql.service.KisiService;
import com.postagresql.postagresql.dto.kisidto;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/islem")
@RequiredArgsConstructor
public class controller {

    private final KisiService kisiService;

    @PostMapping
    public void ekle(@RequestBody kisidto kisidto) {
        System.out.println(kisidto);
        kisiService.save(kisidto);


    }

    @GetMapping
    public List<kisidto> listele() {
        return kisiService.getAll();
    }


}


