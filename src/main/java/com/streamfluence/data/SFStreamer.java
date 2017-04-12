package com.streamfluence.data;

import com.streamfluence.dto.TwitchNotificationsDTO;

import javax.persistence.*;

/**
 * Created by matthewhug on 4/12/17.
 */
@Entity
public class SFStreamer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sfstreamer_seq")
    @SequenceGenerator(name="sfstreamer_seq", sequenceName = "sfstreamer_seq")
    private long id;
    private long twitchUserId;
    private String twitchBio;
    private String twitchCreated_at;
    private String twitchDisplay_name;
    private String twitchEmail;
    private boolean twitchEmail_verified;
    private String twitchLogo;
    private String twitchName;
    private boolean twitchNotificationsEmail;
    private boolean twitchNotificationsPush;
    private boolean twitchPartnered;
    private boolean twitchTwitter_connected;
    private String twitchType;
    private String twitchUpdated_at;

    public SFStreamer() {
    }

    public SFStreamer(long twitchUserId, String twitchBio, String twitchCreated_at, String twitchDisplay_name, String twitchEmail, boolean twitchEmail_verified, String twitchLogo, String twitchName, boolean twitchNotificationsEmail, boolean twitchNotificationsPush, boolean twitchPartnered, boolean twitchTwitter_connected, String twitchType, String twitchUpdated_at) {
        this.twitchUserId = twitchUserId;
        this.twitchBio = twitchBio;
        this.twitchCreated_at = twitchCreated_at;
        this.twitchDisplay_name = twitchDisplay_name;
        this.twitchEmail = twitchEmail;
        this.twitchEmail_verified = twitchEmail_verified;
        this.twitchLogo = twitchLogo;
        this.twitchName = twitchName;
        this.twitchNotificationsEmail = twitchNotificationsEmail;
        this.twitchNotificationsPush = twitchNotificationsPush;
        this.twitchPartnered = twitchPartnered;
        this.twitchTwitter_connected = twitchTwitter_connected;
        this.twitchType = twitchType;
        this.twitchUpdated_at = twitchUpdated_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTwitchUserId() {
        return twitchUserId;
    }

    public void setTwitchUserId(long twitchUserId) {
        this.twitchUserId = twitchUserId;
    }

    public String getTwitchBio() {
        return twitchBio;
    }

    public void setTwitchBio(String twitchBio) {
        this.twitchBio = twitchBio;
    }

    public String getTwitchCreated_at() {
        return twitchCreated_at;
    }

    public void setTwitchCreated_at(String twitchCreated_at) {
        this.twitchCreated_at = twitchCreated_at;
    }

    public String getTwitchDisplay_name() {
        return twitchDisplay_name;
    }

    public void setTwitchDisplay_name(String twitchDisplay_name) {
        this.twitchDisplay_name = twitchDisplay_name;
    }

    public String getTwitchEmail() {
        return twitchEmail;
    }

    public void setTwitchEmail(String twitchEmail) {
        this.twitchEmail = twitchEmail;
    }

    public boolean isTwitchEmail_verified() {
        return twitchEmail_verified;
    }

    public void setTwitchEmail_verified(boolean twitchEmail_verified) {
        this.twitchEmail_verified = twitchEmail_verified;
    }

    public String getTwitchLogo() {
        return twitchLogo;
    }

    public void setTwitchLogo(String twitchLogo) {
        this.twitchLogo = twitchLogo;
    }

    public String getTwitchName() {
        return twitchName;
    }

    public void setTwitchName(String twitchName) {
        this.twitchName = twitchName;
    }

    public boolean isTwitchNotificationsEmail() {
        return twitchNotificationsEmail;
    }

    public void setTwitchNotificationsEmail(boolean twitchNotificationsEmail) {
        this.twitchNotificationsEmail = twitchNotificationsEmail;
    }

    public boolean isTwitchNotificationsPush() {
        return twitchNotificationsPush;
    }

    public void setTwitchNotificationsPush(boolean twitchNotificationsPush) {
        this.twitchNotificationsPush = twitchNotificationsPush;
    }

    public boolean isTwitchPartnered() {
        return twitchPartnered;
    }

    public void setTwitchPartnered(boolean twitchPartnered) {
        this.twitchPartnered = twitchPartnered;
    }

    public boolean isTwitchTwitter_connected() {
        return twitchTwitter_connected;
    }

    public void setTwitchTwitter_connected(boolean twitchTwitter_connected) {
        this.twitchTwitter_connected = twitchTwitter_connected;
    }

    public String getTwitchType() {
        return twitchType;
    }

    public void setTwitchType(String twitchType) {
        this.twitchType = twitchType;
    }

    public String getTwitchUpdated_at() {
        return twitchUpdated_at;
    }

    public void setTwitchUpdated_at(String twitchUpdated_at) {
        this.twitchUpdated_at = twitchUpdated_at;
    }
}
