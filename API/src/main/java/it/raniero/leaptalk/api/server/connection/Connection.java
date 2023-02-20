package it.raniero.leaptalk.api.server.connection;

import io.netty.channel.Channel;
import it.raniero.leaptalk.api.server.packet.Packet;

public interface Connection {


    Channel getChannel();

    void sendPacket(Packet packet);

}
