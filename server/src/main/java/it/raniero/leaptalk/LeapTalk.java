package it.raniero.leaptalk;

import it.raniero.leaptalk.api.ILeapTalk;
import it.raniero.leaptalk.api.startup.StartupSettings;
import it.raniero.leaptalk.server.LeapTalkServer;
import lombok.Getter;

public class LeapTalk implements ILeapTalk {

    @Getter
    private LeapTalkServer server;

    @Override
    public void start(StartupSettings settings) {
        server = new LeapTalkServer();
        server.startServer(settings.getPort(),settings.isCheckAuth());
    }

    @Override
    public void shutdown() {
        server.shutdown();
    }
}
