package com.cos.security1.config.auth;

import com.cos.security1.model.User;
import com.cos.security1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

// 시큐리티 설정에서 loginProcessingUrl("/login");
// login 요청이 오면 자동으로 UserDetailsService 타입으로 IOC되어 있는 loadUserByUsername 함수가 발생
//@Service
//public class PrincipalDetailsService implements UserDetailsService {
//    @Autowired
//    private UserRepository userRepository;
//
//    // 시큐리티 session = Authentication Type = UserDetails Type
//    // 시큐리티 session = Authentication(UserDetails)
//    // 시큐리티 session(Authentication(UserDetails))
//    // 함수 종료시 @AuthenticationPrincipal 어노테이션이 만들어진다.
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User userEntity = userRepository.findByUsername(username);
//        if(userEntity != null) {
//            return new PrincipalDetails(userEntity);
//        }
//        return null;
//    }
//}
