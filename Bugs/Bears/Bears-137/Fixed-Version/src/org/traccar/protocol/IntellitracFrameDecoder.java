/*
 * Copyright 2013 Anton Tananaev (anton@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.LineBasedFrameDecoder;

public class IntellitracFrameDecoder extends LineBasedFrameDecoder {

    private static final int MESSAGE_MINIMUM_LENGTH = 0;

    public IntellitracFrameDecoder(int maxFrameLength) {
        super(maxFrameLength);
    }

    // example of sync header: 0xFA 0xF8 0x1B 0x01 0x81 0x60 0x33 0x3C

    @Override
    protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buf) throws Exception {

        // Check minimum length
        if (buf.readableBytes() < MESSAGE_MINIMUM_LENGTH) {
            return null;
        }

        // Check for sync packet
        if (buf.getUnsignedShort(buf.readerIndex()) == 0xFAF8) {
            ChannelBuffer syncMessage = buf.readBytes(8);
            if (channel != null) {
                channel.write(syncMessage);
            }
        }

        return super.decode(ctx, channel, buf);
    }

}
