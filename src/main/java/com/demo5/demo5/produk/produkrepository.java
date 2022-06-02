package com.demo5.demo5.produk;

import com.demo5.demo5.produk.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

@Repository
public interface produkrepository extends CrudRepository<produk, Long> {

}
