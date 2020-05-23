package com.scnu.library.tools.security;

import com.scnu.library.model.dbModel.userMain;
import com.scnu.library.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Fisher
 * @Date: 2020/5/23 15:42
 */
@Service
public class userDetailService implements UserDetailsService {

    @Autowired
    private userService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        userMain user = userService.getUserByName(s);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在！");
        }
        // 暂时不需要权限控制，因此使用空的权限表
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        return new User(user.getUserName(), user.getUserPassword(), list);
    }
}
