import java.io.*;
import java.net.*;

class test_clie {
    public static void main(String args[]) {
        try {
            // サーバーとポートを取得
            String server = args[0];
            int port = Integer.parseInt(args[1]);

            // ソケットを作成
            Socket s = new Socket(server, port);

            // サーバーから乱数を読み取る
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            int i = dis.readInt();

            // 結果を表示
            System.out.println(i);

            // ソケットをクローズ
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}