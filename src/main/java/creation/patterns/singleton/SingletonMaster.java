package creation.patterns.singleton;

// double check lock
public class SingletonMaster {

  // volatile 使用後此變數會改為不使用各執行緒的working memory(記憶體空間)
  // ，永遠從主記憶體做存取與讀寫
  private volatile static SingletonMaster instance = null;

  private SingletonMaster() {
    if (instance != null) {
      throw new RuntimeException("Use getInstance() method to create object");
    }
  }

  public static SingletonMaster getInstance() {
    if (instance == null) {
      // thread 1
      // thread 2
      // synchronized 鎖定object保證區塊內同時間只會被一個Thread執行
      synchronized (SingletonMaster.class) {
        if (instance == null) {
          instance = new SingletonMaster();
        }
      }
    }
    return instance;
  }
}