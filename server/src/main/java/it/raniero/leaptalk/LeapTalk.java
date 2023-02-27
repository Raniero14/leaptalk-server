package it.raniero.leaptalk;

import it.raniero.leaptalk.api.ILeapTalk;
import it.raniero.leaptalk.api.startup.StartupSettings;
import it.raniero.leaptalk.server.LeapTalkServer;
import lombok.Getter;

public class LeapTalk implements ILeapTalk {

    @Getter
    private LeapTalkServer server;

    @Getter
    private Thread networkThread;


    @Override
    public void start(StartupSettings settings) {
        server = new LeapTalkServer(this);
        networkThread = new Thread(() -> {

            try {

                server.startServer(settings.getSelectedInterface(),settings.getPort(),settings.isCheckAuth());

            } catch (Exception ex) {

                ex.printStackTrace();

            }
        });

        networkThread.start();

    }

    @Override
    public void shutdown() {
        server.shutdown();
    }
}
