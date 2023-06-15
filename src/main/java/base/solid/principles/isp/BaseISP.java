package base.solid.principles.isp;

// ISP: Interface Segregation principle 介面分離原則
// 一個interface只處理一個核心邏輯層面的方法，否則該界面會過於龐大
public interface BaseISP {

  void processData();

  String request();

}
