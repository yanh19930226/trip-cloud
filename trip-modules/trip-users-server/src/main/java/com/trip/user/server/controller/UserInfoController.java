package com.trip.user.server.controller;

import com.trip.core.utils.R;
import com.trip.user.server.service.UserInfoService;
import com.trip.user.domian.UserInfo;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

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
    @GetMapping("/phone/exists")
    public R<Boolean> checkPhoneExists(String phone) {
        return R.ok(userInfoService.findByPhone(phone) != null);
    }


    @PostMapping("/login")
    public R<Map<String, Object>> login(String username, String password) {
        Map<String, Object> map = userInfoService.login(username, password);
        return R.ok(map);
    }
}
