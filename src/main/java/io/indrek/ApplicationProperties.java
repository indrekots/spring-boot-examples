package io.indrek;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

@ConfigurationProperties("application")
public class ApplicationProperties {

    private String emailServer;
    private String serviceUser;

    @NotNull
    private String servicePassword;

    private RemoteHost remoteHost;

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }

    public String getServiceUser() {
        return serviceUser;
    }

    public void setServiceUser(String serviceUser) {
        this.serviceUser = serviceUser;
    }

    public String getServicePassword() {
        return servicePassword;
    }

    public void setServicePassword(String servicePassword) {
        this.servicePassword = servicePassword;
    }

    public RemoteHost getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(RemoteHost remoteHost) {
        this.remoteHost = remoteHost;
    }

    public static class RemoteHost {
        private String hostName;

        public String getHostName() {
            return hostName;
        }

        public void setHostName(String hostName) {
            this.hostName = hostName;
        }
    }
}
