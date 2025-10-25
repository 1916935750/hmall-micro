package com.hmall.api.item;


import com.hmall.api.item.dto.ItemDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

/**
 * @author Mr.M
 * @version 1.0
 * @description 商品服务Feign接口
 * @date 2024/8/3 16:21
 */
@FeignClient(name="item-service",path = "/items")
public interface ItemClient {
    @GetMapping
    List<ItemDTO> queryItemByIds(@RequestParam("ids") Collection<Long> ids);
}