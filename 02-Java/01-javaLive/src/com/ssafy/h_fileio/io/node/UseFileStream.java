package com.ssafy.h_fileio.io.node;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class UseFileStream {
    public static void main(String[] args) throws IOException {
        UseFileStream st = new UseFileStream();
        st.testFile();

        System.out.printf("buffer size: %d, time: %d%n", 100, st.fileMove(100));
        // System.out.printf("buffer size: %d, time: %d%n", 1000, st.fileMove(1000));
        // System.out.printf("buffer size: %d, time: %d%n", 10000, st.fileMove(10000));
        // System.out.printf("buffer size: %d, time: %d%n", 100000,
        // st.fileMove(100000));
        // System.out.printf("buffer size: %d, time: %d%n", 1000000,
        // st.fileMove(1000000));
    }

    private void testFile() throws IOException {
        // 절대 경로
        File temp = new File("c:\\Temp");
        System.out.printf("존재? %b, 디렉토리? %b%n", temp.exists(), temp.isDirectory());

        // 상대경로
        File current = new File(".");
        System.out.printf("여기는 어디? %s%n", current.getCanonicalPath());

        // 상대경로의 기준은 java program을 실행하는 위치(소스와 무관)
        // d:\>java -cp .;c:\SSAFY\workspace\java\live\bin
        // com.ssafy.live5.io.node.UseFileStream
        // c:\SSAFY\workspace\java\live\bin>java com.ssafy.live5.io.node.UseFileStream

        // TODO: readme.txt에 해당하는 File 객체를 만들어 보자.
        // File readMe = new
        // File("C:\\SSAFY\\workspace\\02-Java\\01-javaLive\\src\\com\\ssafy\\h_fileio\\io\\node\\readme.txt\r");
        URL url = UseFileStream.class.getResource("./readme.txt");
        File readMe = new File(url.getFile());
        System.out.println(readMe.canRead());
        // END:
    }

    public long fileMove(int bufferSize) {
        long start = System.currentTimeMillis();
        // TODO: 본인의 컴퓨터에서 크기가 큰 파일을 선택하세요.
        File src = new File("C:\\Users\\SSAFY\\Downloads\\hw-9-4-cld.png");
        File target = new File("C:\\SSAFY\\설치파일\\image.png");

        try (InputStream input = new FileInputStream(src); OutputStream output = new FileOutputStream(target)) {
            byte[] buffer = new byte[bufferSize];
            int read = 0;
            while ((read = input.read(buffer)) > 0) {
                output.write(buffer, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // END:
        return System.currentTimeMillis() - start;
    }
}
