package it.raniero.leaptalk.api.server;

import io.netty.buffer.ByteBuf;
import it.raniero.leaptalk.api.server.connection.Connection;
import it.raniero.leaptalk.api.server.packet.Packet;

import java.nio.channels.SocketChannel;

public interface ILeapTalkServer {

    void startServer(String hostname,int port,boolean checkAuth) throws Exception;

    void shutdown();

    void handleJoin(SocketChannel channel);

    void handleQuit(SocketChannel channel);

    Packet decodeBuffer(ByteBuf buf);

    void sendPacket(Connection connection, Packet packet);

    void broadcastPacket(Packet packet);


}
