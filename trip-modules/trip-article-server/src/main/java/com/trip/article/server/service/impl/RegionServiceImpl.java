package com.trip.article.server.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trip.article.domain.Region;
import com.trip.article.server.service.RegionService;
import com.trip.article.server.mapper.RegionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements RegionService {
    @Override
    public List<Region> findHotList() {
        // 查询所有热门区域, 并且进行排序
        return list(
                new QueryWrapper<Region>()
                        .eq("ishot", Region.STATE_HOT)
                        .orderByAsc("seq")
        );
    }
}
