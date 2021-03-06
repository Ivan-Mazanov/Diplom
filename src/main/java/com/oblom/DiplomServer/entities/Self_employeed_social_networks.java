package com.oblom.DiplomServer.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "Self_employeed_social_networks")
public class Self_employeed_social_networks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer self_employeed_social_network_id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "self_employeed_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Self_employeed self_employeed;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "social_network_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Social_networks social_networks;

    @Column
    private String social_network_url;

    public Integer getSelf_employeed_social_network_id() {
        return self_employeed_social_network_id;
    }

    public void setSelf_employeed_social_network_id(Integer self_employeed_social_network_id) {
        this.self_employeed_social_network_id = self_employeed_social_network_id;
    }

    public Self_employeed getSelf_employeed() {
        return self_employeed;
    }

    public void setSelf_employeed(Self_employeed self_employeed) {
        this.self_employeed = self_employeed;
    }

    public Social_networks getSocial_networks() {
        return social_networks;
    }

    public void setSocial_networks(Social_networks social_networks) {
        this.social_networks = social_networks;
    }

    public String getSocial_network_url() {
        return social_network_url;
    }

    public void setSocial_network_url(String social_network_url) {
        this.social_network_url = social_network_url;
    }

    public Self_employeed_social_networks(int self_employeed_social_network_id, Self_employeed self_employeed, Social_networks social_networks, String social_network_url) {
        this.self_employeed_social_network_id = self_employeed_social_network_id;
        this.self_employeed = self_employeed;
        this.social_networks = social_networks;
        this.social_network_url = social_network_url;
    }

    public Self_employeed_social_networks() {
    }

    @Override
    public String toString() {
        return "Self_employeed_social_networks{" +
                "self_employeed_social_network_id=" + self_employeed_social_network_id +
                ", social_network_url='" + social_network_url + '\'' +
                '}';
    }
}
