package com.touch.entity;

/**
 * @author zhuxl@paxsz.com
 * @time 2017/5/4
 */
public class User {
    private Long id;
    private String userName;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
