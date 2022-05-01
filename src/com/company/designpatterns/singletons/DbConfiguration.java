package com.company.designpatterns.singletons;

public class DbConfiguration {

    private String url;
    private String username;
    private String password;

    private volatile static DbConfiguration instance;

    private DbConfiguration() {

    }

    public static DbConfiguration getInstance() { // 1 2
        if (instance == null) { // 1 2  - 5
            synchronized (DbConfiguration.class) { // 2
                if (instance == null) {
                    instance = new DbConfiguration();
                }
            }  // 1 2
        }
        return instance;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
