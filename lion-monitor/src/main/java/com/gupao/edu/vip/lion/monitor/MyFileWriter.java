package com.gupao.edu.vip.lion.monitor;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter{
    private final FileWriter writer;
    private MyFileWriter(String filename) throws IOException {
        writer = new FileWriter(filename);
    }

    public void write(String msg) throws IOException {
        if(msg==null)throw new IOException("empty msg can't written");
        writer.write(msg);
    }

    private void close() throws IOException {
        writer.close();
        System.out.println("MyFileWriter is closed");
    }

    public static void use(final String filename,
            final UseFile<MyFileWriter,IOException> lambda)
            throws IOException{
        MyFileWriter writer=new MyFileWriter(filename);
        try{
            lambda.use(writer);
        }finally{
            writer.close();
        }
    }

    public static void main(String[] args) throws IOException {
        MyFileWriter.use("demo_1.txt", writer->writer.write("hello world"));
    }
}

