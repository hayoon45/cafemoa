package com.project.cafemoa.domain.auth;

import lombok.Data;

@Data
public class KakaoProfile {
    public Long id;
    public String connected_at;
    public Properties properties;
    public KakaoAccount kakao_account;

    @Data
    public class Properties {
        public String nickname;
    }

    @Data
    public class KakaoAccount {
        public String birthday;
        public Boolean birthday_needs_agreement;
        public String birthday_type;

        public String email;
        public Boolean email_needs_agreement;

        public String gender;
        public Boolean gender_needs_agreement;

        public Boolean has_birthday;
        public Boolean has_email;
        public Boolean has_gender;
        public Boolean is_email_valid;
        public Boolean is_email_verified;
        public Profile profile;
        public Boolean profile_nickname_needs_agreement;

        @Data
        public class Profile {
            public String nickname;
        }
    }
}
