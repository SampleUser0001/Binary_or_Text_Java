package sample.binaryortext;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.InputStream;
import java.io.IOException;

/**
 * 対象のファイルがバイナリかテキストかを調査する。
 */
public class App {
  public static void main( String[] args ) {
    System.out.println(String.format("%s is %s.", args[0], App.isTextFile(args[0]) ? "text" : "binary"));
  }

  /**
   * テキストファイルかどうかを判定する
   *
   * @param filePath テキストファイル
   * @return trueならテキストファイル falseならバイナリファイル
   */
  public static boolean isTextFile(String filePath) {
    try(InputStream in = Files.newInputStream(Paths.get(filePath))) {
      byte[] b = new byte[1];
      while (in.read(b, 0, 1) > 0) {
        if (b[0] == 0) {
          return false;
        }
      }
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }
}
