package com.task.chapter3.task3;

import com.sun.org.apache.xpath.internal.operations.String;
import com.sun.org.apache.xpath.internal.operations.UnaryOperation;

import javax.imageio.stream.IIOByteBuffer;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        UnaryOperation string = new String();

        Object scanner = new Scanner(System.in);

        ImageInputStream imageOutputStream = new ImageOutputStream() {
            @Override
            public void write(int b) throws IOException {

            }

            @Override
            public void write(byte[] b) throws IOException {

            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {

            }

            @Override
            public void writeBoolean(boolean v) throws IOException {

            }

            @Override
            public void writeByte(int v) throws IOException {

            }

            @Override
            public void writeShort(int v) throws IOException {

            }

            @Override
            public void writeChar(int v) throws IOException {

            }

            @Override
            public void writeInt(int v) throws IOException {

            }

            @Override
            public void writeLong(long v) throws IOException {

            }

            @Override
            public void writeFloat(float v) throws IOException {

            }

            @Override
            public void writeDouble(double v) throws IOException {

            }

            @Override
            public void writeBytes(java.lang.String s) throws IOException {

            }

            @Override
            public void writeChars(java.lang.String s) throws IOException {

            }

            @Override
            public void writeUTF(java.lang.String s) throws IOException {

            }

            @Override
            public void writeShorts(short[] s, int off, int len) throws IOException {

            }

            @Override
            public void writeChars(char[] c, int off, int len) throws IOException {

            }

            @Override
            public void writeInts(int[] i, int off, int len) throws IOException {

            }

            @Override
            public void writeLongs(long[] l, int off, int len) throws IOException {

            }

            @Override
            public void writeFloats(float[] f, int off, int len) throws IOException {

            }

            @Override
            public void writeDoubles(double[] d, int off, int len) throws IOException {

            }

            @Override
            public void writeBit(int bit) throws IOException {

            }

            @Override
            public void writeBits(long bits, int numBits) throws IOException {

            }

            @Override
            public void setByteOrder(ByteOrder byteOrder) {

            }

            @Override
            public ByteOrder getByteOrder() {
                return null;
            }

            @Override
            public int read() throws IOException {
                return 0;
            }

            @Override
            public int read(byte[] b) throws IOException {
                return 0;
            }

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void readBytes(IIOByteBuffer buf, int len) throws IOException {

            }

            @Override
            public boolean readBoolean() throws IOException {
                return false;
            }

            @Override
            public byte readByte() throws IOException {
                return 0;
            }

            @Override
            public int readUnsignedByte() throws IOException {
                return 0;
            }

            @Override
            public short readShort() throws IOException {
                return 0;
            }

            @Override
            public int readUnsignedShort() throws IOException {
                return 0;
            }

            @Override
            public char readChar() throws IOException {
                return 0;
            }

            @Override
            public int readInt() throws IOException {
                return 0;
            }

            @Override
            public long readUnsignedInt() throws IOException {
                return 0;
            }

            @Override
            public long readLong() throws IOException {
                return 0;
            }

            @Override
            public float readFloat() throws IOException {
                return 0;
            }

            @Override
            public double readDouble() throws IOException {
                return 0;
            }

            @Override
            public java.lang.String readLine() throws IOException {
                return null;
            }

            @Override
            public java.lang.String readUTF() throws IOException {
                return null;
            }

            @Override
            public void readFully(byte[] b, int off, int len) throws IOException {

            }

            @Override
            public void readFully(byte[] b) throws IOException {

            }

            @Override
            public void readFully(short[] s, int off, int len) throws IOException {

            }

            @Override
            public void readFully(char[] c, int off, int len) throws IOException {

            }

            @Override
            public void readFully(int[] i, int off, int len) throws IOException {

            }

            @Override
            public void readFully(long[] l, int off, int len) throws IOException {

            }

            @Override
            public void readFully(float[] f, int off, int len) throws IOException {

            }

            @Override
            public void readFully(double[] d, int off, int len) throws IOException {

            }

            @Override
            public long getStreamPosition() throws IOException {
                return 0;
            }

            @Override
            public int getBitOffset() throws IOException {
                return 0;
            }

            @Override
            public void setBitOffset(int bitOffset) throws IOException {

            }

            @Override
            public int readBit() throws IOException {
                return 0;
            }

            @Override
            public long readBits(int numBits) throws IOException {
                return 0;
            }

            @Override
            public long length() throws IOException {
                return 0;
            }

            @Override
            public int skipBytes(int n) throws IOException {
                return 0;
            }

            @Override
            public long skipBytes(long n) throws IOException {
                return 0;
            }

            @Override
            public void seek(long pos) throws IOException {

            }

            @Override
            public void mark() {

            }

            @Override
            public void reset() throws IOException {

            }

            @Override
            public void flushBefore(long pos) throws IOException {

            }

            @Override
            public void flush() throws IOException {

            }

            @Override
            public long getFlushedPosition() {
                return 0;
            }

            @Override
            public boolean isCached() {
                return false;
            }

            @Override
            public boolean isCachedMemory() {
                return false;
            }

            @Override
            public boolean isCachedFile() {
                return false;
            }

            @Override
            public void close() throws IOException {

            }
        };
    }

}
