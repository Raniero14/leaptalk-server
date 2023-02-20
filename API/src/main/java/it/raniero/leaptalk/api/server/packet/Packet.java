package it.raniero.leaptalk.api.server.packet;

import org.bson.ByteBuf;

public interface Packet {


    void decode(ByteBuf buffer);

    ByteBuf encode();


}
