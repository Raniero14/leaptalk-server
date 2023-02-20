package it.raniero.leaptalk.api.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

public interface PipelineFactory {

    ChannelInitializer<SocketChannel> createInitializer();

}
