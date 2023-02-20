package it.raniero.leaptalk.api.entity.interaction;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Message {

    private final long timestamp;

    public enum MessageType {
        MEDIA,TEXT,VOCAL
    }

}
