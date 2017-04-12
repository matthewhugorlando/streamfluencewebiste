package com.streamfluence.dto;

/**
 * Created by matthewhug on 4/12/17.
 */
public class TwitchStreamerDTO {
    private long _id;
    private String bio;
    private String created_at;
    private String display_name;
    private String email;
    private boolean email_verified;
    private String logo;
    private String name;
    private TwitchNotificationsDTO notifications;
    private boolean partnered;
    private boolean twitter_connected;
    private String type;
    private String updated_at;

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmail_verified() {
        return email_verified;
    }

    public void setEmail_verified(boolean email_verified) {
        this.email_verified = email_verified;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TwitchNotificationsDTO getNotifications() {
        return notifications;
    }

    public void setNotifications(TwitchNotificationsDTO notifications) {
        this.notifications = notifications;
    }

    public boolean isPartnered() {
        return partnered;
    }

    public void setPartnered(boolean partnered) {
        this.partnered = partnered;
    }

    public boolean isTwitter_connected() {
        return twitter_connected;
    }

    public void setTwitter_connected(boolean twitter_connected) {
        this.twitter_connected = twitter_connected;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
