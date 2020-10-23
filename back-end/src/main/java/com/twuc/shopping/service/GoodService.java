package com.twuc.shopping.service;

import com.twuc.shopping.VO.GoodRequest;
import com.twuc.shopping.domain.Good;
import com.twuc.shopping.repository.GoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodService {

    private final GoodRepository goodRepository;

    public GoodService(GoodRepository goodRepository) {
        this.goodRepository = goodRepository;
    }

    public List<Good> findAllGoods() {
        return goodRepository.findAll();
    }

    public void addGood(GoodRequest goodRequest) {
        goodRepository.save(Good.builder()
                .name(goodRequest.getName())
                .price(goodRequest.getPrice())
                .unit(goodRequest.getUnit())
                .imageUrl(goodRequest.getImageUrl())
                .build()
        );
    }
}
