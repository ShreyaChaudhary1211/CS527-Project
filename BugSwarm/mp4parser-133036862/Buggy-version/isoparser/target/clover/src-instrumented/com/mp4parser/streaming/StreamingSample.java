/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.streaming;

import com.googlecode.mp4parser.authoring.Sample;

import java.nio.ByteBuffer;

/**
 * The most simple sample has a presentation time and content.
 */
public interface StreamingSample {
    ByteBuffer getContent();
    long getDuration();
    SampleExtension[] getExtensions();
}
