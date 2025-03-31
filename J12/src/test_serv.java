import java.io.*;
import java.net.*;
import java.util.*;

class test_serv {
    public static void main(String[] args) {
        try {
            // ポートを取得
            int port = Integer.parseInt(args[0]);

            // 乱数ジェネレータを作成
            Random random = new Random();

            // サーバーソケットを作成
            ServerSocket ss = new ServerSocket(port);
            int i = 0;
            // 無限ループ
            while (true) {
                // クライアントからの要求を受け取る
                Socket s = ss.accept();

                // 結果をクライアントに書き込む
                OutputStream os = s.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                dos.writeInt(i++);

                // ソケットをクローズ
                s.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}