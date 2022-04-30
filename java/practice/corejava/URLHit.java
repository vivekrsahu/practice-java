package practice.corejava;

public class URLHit {
public static void main(String[] args) {
        method();
}

private static void method () {
    String url = "https://www.youtube.com/watch?v=iyQrQ-u9ciY/";
    String url2 = "https://www.google.com/";
//  URLConnection myURLConnection = myURL.openConnection();
//  myURLConnection.connect();
  Runtime runtime = Runtime.getRuntime();
  String[] arg = { "osascript", "-e", "open location \"" + url + "\"" };
  String[] arg2 = { "osascript", "-e", "open location \"" + url2 + "\"" };
  try {
      for (int i = 0; i < 10; i++) {
          runtime.exec(arg);
          Thread.sleep(100000);
          runtime.exec(arg2);
          Thread.sleep(1000);
      }
  }
  catch (Exception e) {
      // do what you want with this
  }
}
}
