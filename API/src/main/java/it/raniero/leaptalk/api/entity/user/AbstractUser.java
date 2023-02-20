package it.raniero.leaptalk.api.entity.user;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public abstract class AbstractUser {


    private final UUID uniqueId;
    private String username;
    private Set<Long> roles;

    private long lastMessage = -1;
    private long currentChannel  = -1;


    public AbstractUser(UUID uniqueId, String username, Set<Long> roles) {
        this.uniqueId = uniqueId;
        this.username = username;
        this.roles = roles;
    }
}
