package com.demo5.demo5.produk.dto.output;

import lombok.*;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class produkoutput {
    private long id;
    private String name;
    private String description;
    private Double price;

    public void setid(long id) {
        this.id = id;
    }

    public void setprice(Double price) {
        this.price = price;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public void setname(String name) {
        this.name = name;
    }
}