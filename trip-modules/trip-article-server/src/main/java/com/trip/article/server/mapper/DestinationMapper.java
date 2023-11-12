package com.trip.article.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trip.article.domain.Destination;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DestinationMapper extends BaseMapper<Destination> {

    List<Destination> selectHotListByRid(@Param("rid") Long rid, @Param("ids") List<Long> ids);
}
