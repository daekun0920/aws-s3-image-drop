package com.daekun.awsimageexer.bucket;

public enum BucketName {
    PROFILE_IMAGE("awsimage-app");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
