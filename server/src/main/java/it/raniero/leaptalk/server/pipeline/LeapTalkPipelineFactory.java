package it.raniero.leaptalk.server.pipeline;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import it.raniero.leaptalk.LeapTalk;
import it.raniero.leaptalk.api.server.PipelineFactory;
import it.raniero.leaptalk.server.channel.PacketDecoder;
import it.raniero.leaptalk.server.channel.PacketHandler;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LeapTalkPipelineFactory implements PipelineFactory {

    private final LeapTalk api;


    @Override
    public ChannelInitializer<SocketChannel> createInitializer() {
        return new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) {
                ch.pipeline().addLast("decoder",new PacketDecoder(api,ch));
                ch.pipeline().addLast("handler",new PacketHandler(api,ch));
            }
        };
    }
}
