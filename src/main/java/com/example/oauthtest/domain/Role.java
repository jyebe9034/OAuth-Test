package com.example.oauthtest.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    // Spring Security에서는 권한코드에 ROLE_가 항상 앞에 붙어야 함.
    GUEST("ROLE_GUEST", "게스트"),
    USER("ROLE_USER", "사용자");

    private final String key;
    private final String value;
}
