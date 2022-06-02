package com.demo5.demo5.produk.service;

import com.demo5.demo5.produk.dto.input.produkInput;
import com.demo5.demo5.produk.dto.output.*;
import java.util.List;

public interface produkservice {
    produkoutput getOne(long id);

    List<produkoutput> getAll();

    produkoutput addOne(produkInput input);

    Boolean deleteOne(long id);
}
