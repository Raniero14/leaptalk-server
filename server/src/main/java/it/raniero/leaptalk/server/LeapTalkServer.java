package it.raniero.leaptalk.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import it.raniero.leaptalk.api.server.ILeapTalkServer;
import it.raniero.leaptalk.api.server.connection.Connection;
import it.raniero.leaptalk.api.server.packet.Packet;

import java.nio.channels.SocketChannel;

public class LeapTalkServer implements ILeapTalkServer {


    private final NioEventLoopGroup bossLoopGroup = new NioEventLoopGroup();


    private final NioEventLoopGroup workerLoopGroup = new NioEventLoopGroup();


    @Override
    public void startServer(int port,boolean checkAuth) {
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossLoopGroup, workerLoopGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 1024)
                .option(ChannelOption.AUTO_CLOSE, true)
                .option(ChannelOption.SO_REUSEADDR, true)
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .childOption(ChannelOption.TCP_NODELAY, true);
    }

    @Override
    public void shutdown() {

    }

    @Override
    public void handleJoin(SocketChannel channel) {

    }

    @Override
    public void handleQuit(SocketChannel channel) {

    }

    @Override
    public Packet decodeBuffer(ByteBuf buf) {
        return null;
    }


    @Override
    public void sendPacket(Connection connection, Packet packet) {

    }

    @Override
    public void broadcastPacket(Packet packet) {

    }
}
