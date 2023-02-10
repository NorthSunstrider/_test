package com.northsunstrider.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * UNICODE是万能编码，包含了所有符号的编码，它规定了所有符号在计算机底层的二进制的表示顺序。有关Unicode为什么会出现就不叙述了，Unicode是针对所有计算机的使用者定义一套统一的编码规范，这样计算机使用者就避免了编码转换的问题。Unicode定义了所有符号的二进制形式，也就是符号如何在计算机内部存储的，而且每个符号规定都必须使用两个字节来表示，也就是用16位二进制去代表一个符号，这样就导致了一个问题，英文编码的空间浪费，因为在ANSI中的符号都是一个字节来表示的，而使用了UNICODE编码就白白浪费了一个字节。也就代表着Unicode需要使用两倍的空间去存储相应的ANSI编码下的符号。虽然现在硬盘或者内存都很廉价，但是在网络传输中，这个问题就凸显出来了，你可以这样想想，本来1M的带宽在ANSI下可以代表1024*1024个字符，但是在Unicode下却只能代表1024*1024/2个字符。也就是1MB/s的带宽只能等价于512KB/s，这个很可怕啊。所以为了解决符号在网络中传输的浪费问题，就出现了UTF-8编码，Unicode
 * transfer format -8
 * ，后面的8代表是以8位二进制为单位来传输符号的，但是这样又导致了一个问题，虽然UTF-8可以使用一个字节来表示ANSI下的符号，但是对于其它类似汉语的符号，得需要两个字节来表示，所以计算机不知道如何去截取一个符号，也就是一个符号对应的二进制的截取开始位置和截取结束位置。所以为了解决Unicode下的ANSI符号的空间浪费和网络传输下如何截取字符的问题，UTF规定：如果一个符号只占一个字节，那么这个8位字节的第一位就为0。如果为两个字节，那么规定第一个字节的前两位都为1，然后第一个字节的第三位为0，第二个字节的前两位为10，然后如果是三个字节的话，那么第一个字节的前三位为111，第四位为0，剩余的两个字节的前两位都为10。按照这样的算法去思考一个中文字符的UTF-8是怎么表示的：一个中文字符需要两个字节来表示，两个字节一共是16位，那么UTF-8下，两个字节是不够的，因为两个字节下，第一个字节已经占据了三位：110，然后剩余的一个字节占据了两位：10，现在就只剩下11位，与Unicode下的两个字节，16位去表示任意一个字符是相悖的。所以就使用三个字节去表示非ANSI字符：三个字节下，一共是24位，第一个字节头四位是：1110，后两个字节的前两位都是：10，那么24位-8位=16位，刚好两个字节去表示Unicode下的任意一个非ANSI字符。这也就是为什么UTF-8需要使用三个字节去表示一个非ANSI字符的原因了！中国的汉字多达10多万，常用的汉字3500左右[08年统计]，如果用3个字节来表示，一共只有2^16(65535)种可能，不足以表示10多万的汉字。所以中日韩的超大字符集是采用的4个字节来表示的，多达6万多个。但是平时使用超大字符集的概率0.01%都不到。所以我们一般认为日常的中文在UTF-8中占三个字节
 * 即可！多个字节提供的位数超过了所需要的，多余的位以0补全到编码前面。
 */
public class TestIO {
    public static void FileInputStreamTest() throws IOException {
        FileInputStream fis = new FileInputStream("d://Matrix//tmp2.txt");
        byte[] buf = new byte[1024];
        int hasRead = 0;

        // read()返回的是单个字节数据（字节数据可以直接专程int类型)，但是read(buf)返回的是读取到的字节数，真正的数据保存在buf中
        while ((hasRead = fis.read(buf)) > 0) {
            // 每次最多将1024个字节转换成字符串，这里tmp2.txt中的字符小于1024，所以一次就读完了
            // 循环次数 = 文件字符数 除以 buf长度
            System.out.println(new String(buf, 0, hasRead));
            /*
             * 将字节强制转换成字符后逐个输出，能实现和上面一样的效果。但是如果源文件是中文的话可能会乱码
             * 
             * for (byte b : buf) { char ch = (char)b; if (ch != '\r')
             * System.out.print(ch); }
             */
        }
        // 在finally块里close更安全
        fis.close();
    }

    public static void FileReaderTest() throws IOException {

        try (
            // 在try() 中打开的文件， JVM会自动关闭
            FileReader fr = new FileReader("tmp2.txt")) {
            char[] buf = new char[32];
            int hasRead = 0;
            // 每个char都占两个字节，每个字符或者汉字都是占2个字节，因此无论buf长度为多少，总是能读取中文字符长度的整数倍,不会乱码
            while ((hasRead = fr.read(buf)) > 0) {
                // 如果buf的长度大于文件每行的长度，就可以完整输出每行，否则会断行。
                // 循环次数 = 文件字符数 除以 buf长度
                System.out.println(new String(buf, 0, hasRead));
                // 跟上面效果一样
                // System.out.println(buf);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void FileOutputStreamTest() throws FileNotFoundException, IOException {
        try (
            // 在try()中打开文件会在结尾自动关闭
            FileInputStream fis = new FileInputStream("tmp2.txt");
            FileOutputStream fos = new FileOutputStream("tmp3.txt");) {
            byte[] buf = new byte[4];
            int hasRead = 0;
            while ((hasRead = fis.read(buf)) > 0) {
                // 每读取一次就写一次，读多少就写多少
                fos.write(buf, 0, hasRead);
            }
            System.out.println("write success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void FileWriterTest() throws IOException {
        try (FileWriter fw = new FileWriter("tmp4.txt")) {
            fw.write("天王盖地虎\r\n");
            fw.write("宝塔镇河妖\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        FileInputStreamTest();
        // FileReaderTest();
        // FileOutputStreamTest();
        // FileWriterTest();
    }
}