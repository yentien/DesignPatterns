# Design Patterns

---

## SOLID 五大原則

### Single responsibility principle 單一職責原則
- 一個類型只處理一個核心邏輯(處理數據、處理請求、升成報告..等)

### Open close principle 開閉原則
- 對擴展開放，對修改封閉  
- 擴展新的child class時不能去修改原本任何有使用到shape的地方  
- 就是把parent class的method抽象化，讓child class去override

### Liskov substitution principle 里氏替換原則
- 宣告parent class時，其初始化的方式可以是parent class，也可以是child class 
- 若用child class初始化，且child class有override parent class的方法或屬性，則會使用child class的方法和屬性

### Interface segregation principle 介面分離原則
- 一個interface只處理一個核心邏輯層面的方法，否則該界面會過於龐大

### Dependency inversion principle 依賴反轉原則
- 將依賴具體的class改成抽象的interface，再由其他地方去實例化抽象介面

---

