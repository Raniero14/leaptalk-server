package it.raniero.leaptalk.server.channel;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.SocketChannel;
import it.raniero.leaptalk.LeapTalk;
import it.raniero.leaptalk.api.server.packet.Packet;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PacketHandler extends SimpleChannelInboundHandler<Packet> {

    private final LeapTalk api;
    private final SocketChannel channel;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Packet msg) throws Exception {


    }
}

