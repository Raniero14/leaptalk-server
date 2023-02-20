package it.raniero.leaptalk.api.startup;


import lombok.Data;

@Data
public class StartupSettings {


    private final String selectedInterface;
    private final int port;
    private final boolean checkAuth;

}
