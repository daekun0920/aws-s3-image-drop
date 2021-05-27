package com.daekun.awsimageexer.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileService {
    private final UserProfileDataAccessService userProfileDataAccessService;

    @Autowired
    public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
        this.userProfileDataAccessService = userProfileDataAccessService;
    }


    List<UserProfile> getUserProfiles() {
        return userProfileDataAccessService.getUserProfiles();
    }

    public void uploadUserProfileImage(UUID userProfileId, MultipartFile file) {
        // 1. 이미지가 없는지
        // 2. 파일이 이미지인지
        // 3. 유저가 데이터베이스에 있는지
        // 4. 메타데이터가 있다면 추출
        // 5. 이미지를 S3에 저장하고 데이터 베이스를 s3 이미지 링크로 업데이트

    }

}
