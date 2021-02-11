package com.bootcamp.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties(prefix="server")
public class ServerProperties {

    private String server_name;
    private String ip = "127.0.0.1";
    private int port = 2345;

    public ServerProperties() {
    }

    public ServerProperties(String name, String ip, int port) {
        this.server_name = server_name;
        this.ip = ip;
        this.port = port;
    }

    public String getServerName() {
        return server_name;
    }

    public void setServerName(String server_name) {
        this.server_name = server_name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
