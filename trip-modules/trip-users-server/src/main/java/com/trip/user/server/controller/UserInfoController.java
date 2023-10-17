package com.trip.user.server.controller;

import com.trip.core.utils.R;
import com.trip.user.server.service.UserInfoService;
import com.trip.user.domian.UserInfo;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserInfoController {
    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping
    public R<List<UserInfo>> all() {
        return R.ok(userInfoService.list());
    }
}
