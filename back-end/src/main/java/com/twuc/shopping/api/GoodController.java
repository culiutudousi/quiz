package com.twuc.shopping.api;

import com.twuc.shopping.VO.GoodRequest;
import com.twuc.shopping.domain.Good;
import com.twuc.shopping.error.BadRequestException;
import com.twuc.shopping.error.ErrorCode;
import com.twuc.shopping.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/goods", produces = MediaType.APPLICATION_JSON_VALUE)
public class GoodController {

    @Autowired
    GoodService goodService;

    @GetMapping
    public List<Good> getGoods() {
        return goodService.findAllGoods();
    }

    @PostMapping
    public void addGood(@RequestBody GoodRequest goodRequest) {
        if (Objects.isNull(goodRequest)) {
            throw new BadRequestException(ErrorCode.INVALID_REQUEST);
        }
        goodService.addGood(goodRequest);
    }
}
