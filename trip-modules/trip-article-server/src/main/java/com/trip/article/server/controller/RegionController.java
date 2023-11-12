package com.trip.article.server.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trip.article.domain.Destination;
import com.trip.article.domain.Region;
import com.trip.article.server.service.DestinationService;
import com.trip.article.server.service.RegionService;
import com.trip.core.utils.R;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regions")
public class RegionController {

    private final RegionService regionService;
    private final DestinationService destinationService;

    public RegionController(RegionService regionService, DestinationService destinationService) {
        this.regionService = regionService;
        this.destinationService = destinationService;
    }

    @GetMapping
    public R<Page<Region>> pageList(Page<Region> page) {
        return R.ok(regionService.page(page));
    }
    @GetMapping("/hotList")
    public R<List<Region>> hotList() {
        return R.ok(regionService.findHotList());
    }

    @GetMapping("/detail")
    public R<Region> getById(Long id) {
        return R.ok(regionService.getById(id));
    }

    @PostMapping("/save")
    public R<?> save(Region dest) {
        regionService.save(dest);
        return R.ok();
    }

    @PostMapping("/update")
    public R<?> updateById(Region dest) {
        regionService.updateById(dest);
        return R.ok();
    }

    @PostMapping("/delete/{id}")
    public R<?> deleteById(@PathVariable Long id) {
        regionService.removeById(id);
        return R.ok();
    }
    @GetMapping("/{id}/destination")
    public R<List<Destination>> getDestinationByRegionId(@PathVariable Long id) {
        List<Destination> destinations = destinationService.getDestinationByRegionId(id);
        return R.ok(destinations);
    }
}
