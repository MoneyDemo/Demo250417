幫我使用 JAVA 建立一個 WEB 用來做股票及時價格。
 
這個 WEB 需要有以下功能：
- 輸入股票代碼，顯示該股票的即時股價。
  - 顯示該股票的歷史股價走勢圖
 
系統的網站架構與設計應該要有:
- 不要使用任何資料庫。
- OS 是 Windows 11
- 使用 Spring Initializr 指令建立專案骨架
- 使用 spring-boot 作為後端框架。
- 股票僅針對美國股票 (免費版限制)
  - 使用 finnhub api 來取得即時股價等資訊。
- API KEY 等機密資訊要使用環境變數來取得。
  - 使用 dotenv 套件來讀取環境變數。
- 提供 README.md 檔案，說明如何啟動網站等常見 README 內容。
  - 要包含如何執行各種不同的測試。
  - 要包含使用哪個套件來取得即時股價等資訊。
    - 要包含如何取得對應 API KEY 的說明。
- 程式碼必須包含適當的註解。
  - 所有的 Class 與 Method 一定要有註解
  - 所有的變數與參數一定要有註解
  - 適當地為所有程式碼加入註解
- 程式碼必須包含適當的單元測試。
  - 測試框架要使用 junit
  - 測試只針對邏輯部分；控制器、服務層、前端不需要測試。
- 使用 Bootstrap 5 來設計網站。
  - 使用 fontawesome 來提供 ICON。
  - 畫面要華麗
  - 必要時可以加入許多動畫效果。
  - 畫面的整體色調要色彩繽紛
  - 要有 Dark Mode 與 Light Mode 的切換功能。
- 使用 jsdeliver CDN 來載入 Bootstrap 5 與 fontawesome。
  - 若有任何其他前端需要的 library 也要使用 jsdeliver CDN。
 
其他要求:
- Update relevant documentation in /docs when modifying features
- Keep README.md in sync with new capabilities
- Maintain changelog entries in CHANGELOG.md
- Write implementation plan to .md files in /docs/implementation
  - Naming convention: <date>-<feature-name>.md
- Each step should be git committed separately to preserve history.
- 所有回復請務必使用繁體中文
- 分階段實作，先產生計畫，並在 Github: https://github.com/lettucebo/Demo0417 上面新增 issue 來追蹤進度，每完成一步驟就更新 issue 並加入 comment 補充說明
  - When creating issue, remember to add corresponding labels
  - note: remember always update the issue and add issue comment everytime
 
先不要執行，請先產出一個執行計畫與檔案文件目錄結構給我看，以及提供預計要使用那些 API 來取得股票即時報價資訊，並提供這些API的前置作業說明，例如: 需要註冊帳號、取得 API KEY、API KEY 的使用限制等等。