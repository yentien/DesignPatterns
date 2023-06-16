package creation.patterns.singleton;

// Singleton: 單例模式
// 整個類型只有一個對象
public class SingletonBasic {

  private static SingletonBasic instance;

  private SingletonBasic() {
    // 讓他只能被實例一次
    if (instance != null) {
      throw new RuntimeException("use getInstance() to create object");
    }
  }

  public static SingletonBasic getInstance() {
    // 取得instance，若null則實例instance
    if (instance == null) {
      // 若是多線程 Thread 1 and Thread 2 兩個都進入實例singletonBasic
      // 此設計對多線程是不安全的
      instance = new SingletonBasic();
    }
    return instance;
  }

  // 這邊若在實例化一次SingletonBasic就會報錯RuntimeException
//  public SingletonBasic returnObject() {
//    return new SingletonBasic();
//  }
}
