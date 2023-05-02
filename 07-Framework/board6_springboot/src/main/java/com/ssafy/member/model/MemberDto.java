package com.ssafy.member.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "MemberDto (회원정보)", description = "회원 한명의 아이디, 비번, 이름, 이메일, 가입일정보를 가진 Domain Class!!!!")
public class MemberDto {

    @ApiModelProperty(value = "회원 아이디")
    private String userId;
    @ApiModelProperty(value = "회원 이름")
    private String userName;
    @ApiModelProperty(value = "회원 비밀번호")
    private String userPwd;
    @ApiModelProperty(value = "회원 이메일")
    private String emailId;
    @ApiModelProperty(value = "회원 이메일 도메인")
    private String emailDomain;
    @ApiModelProperty(value = "가입일")
    private String joinDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "MemberDto [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", emailId="
                + emailId + ", emailDomain=" + emailDomain + ", joinDate=" + joinDate + "]";
    }

}
