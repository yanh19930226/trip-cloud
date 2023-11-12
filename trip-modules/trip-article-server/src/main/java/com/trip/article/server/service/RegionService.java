package com.trip.article.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trip.article.domain.Region;

import java.util.List;

public interface RegionService extends IService<Region> {

    List<Region> findHotList();
}
