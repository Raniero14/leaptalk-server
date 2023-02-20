package it.raniero.leaptalk.api;

import it.raniero.leaptalk.api.startup.StartupSettings;

public interface ILeapTalk {


    void start(StartupSettings settings);

    void shutdown();


}
