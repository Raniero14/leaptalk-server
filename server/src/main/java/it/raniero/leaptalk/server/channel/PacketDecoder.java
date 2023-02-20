package it.raniero.leaptalk.server.channel;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.ByteToMessageDecoder;
import it.raniero.leaptalk.LeapTalk;
import it.raniero.leaptalk.api.server.packet.Packet;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PacketDecoder extends ByteToMessageDecoder {


    private final LeapTalk api;
    private final SocketChannel channel;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
       Packet packet = api.getServer().decodeBuffer(in);
       if(packet != null) {
           out.add(packet);
       }

    }


}
