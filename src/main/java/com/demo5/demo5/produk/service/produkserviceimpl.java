package com.demo5.demo5.produk.service;

import java.util.List;
import java.util.Optional;

import com.demo5.demo5.produk.produkrepository;
import com.demo5.demo5.produk.dto.input.produkInput;
import com.demo5.demo5.produk.dto.output.produkoutput;
import com.demo5.demo5.produk.model.produk;
import com.demo5.demo5.produk.service.produkservice;

import org.springframework.stereotype.Service;

import lombok.Builder;
import lombok.Data;

@Service
@Builder
@Data
public class produkserviceimpl implements produkservice {

    private final produkrepository repository;

    public produkserviceimpl(produkrepository repository) {
        this.repository = repository;
    }

    @Override
    public produkoutput getOne(long id) {
        Optional<produk> produ = repository.findById(id);
        if (produ.isEmpty()) {
            return null;
        }
        produk temp = produ.get();

        produkoutput produkoutpu = new produkoutput();
        produkoutpu.setid(temp.getId());
        produkoutpu.setname(temp.getName());
        produkoutpu.setprice(temp.getPrice());
        produkoutpu.setdescription(temp.getDescription());

        return produkoutpu;
    }

    @Override
    public List<produkoutput> getAll() {
        return null;
    }

    @Override
    public produkoutput addOne(produkInput input) {
        produk Produk = new produk();
        Produk.setname(input.getName());
        Produk.setdescription(input.getDescription());
        Produk.setprice(input.getPrice());

        this.repository.save(Produk);

        produkoutput Produkout = new produkoutput();
        Produkout.setid(Produk.getId());
        Produkout.setname(Produk.getName());
        Produkout.setdescription(Produk.getDescription());
        Produkout.setprice(Produk.getPrice());
        return Produkout;
    }

    @Override
    public Boolean deleteOne(long id) {
        return null;
    }

}
