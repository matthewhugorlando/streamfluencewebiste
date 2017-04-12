package com.streamfluence.dto;

/**
 * Created by matthewhug on 4/12/17.
 */
public class TwitchNotificationsDTO {
    private boolean email;
    private boolean push;

    public boolean isEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }

    public boolean isPush() {
        return push;
    }

    public void setPush(boolean push) {
        this.push = push;
    }
}
