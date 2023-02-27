package it.raniero.leaptalk;

import it.raniero.leaptalk.api.startup.StartupSettings;

public class LeapTalkApplication {




    public static void main(String[] args) {
        new LeapTalk().start(new StartupSettings("0.0.0.0",884,false));
    }

}
