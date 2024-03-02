-- User 使用者資料表
CREATE TABLE IF NOT EXISTS user (
    userId INT AUTO_INCREMENT PRIMARY KEY,
    phone_number VARCHAR(10) NOT NULL,
    Password VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    registration_time DATETIME NOT NULL,
    last_login_time DATETIME
);

-- Book 書籍資料表
CREATE TABLE IF NOT EXISTS Book (
    ISBN VARCHAR(20) PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Author VARCHAR(255) NOT NULL,
    introduction TEXT
);

-- Inventory 庫存資料表
CREATE TABLE IF NOT EXISTS Inventory (
    inventoryId INT AUTO_INCREMENT PRIMARY KEY,
    ISBN VARCHAR(20) NOT NULL,
    storeTime DATETIME NOT NULL,
    status ENUM('在庫', '出借中', '整理中', '遺失', '損毀', '廢棄') NOT NULL,
    FOREIGN KEY (ISBN) REFERENCES Book(ISBN)
);

-- Borrowing Record 借閱紀錄資料表
CREATE TABLE IF NOT EXISTS BorrowingRecord (
    userId INT NOT NULL,
    inventoryId INT,
    BorrowingTime DATETIME NOT NULL,
    ReturnTime DATETIME NOT NULL,
    PRIMARY KEY (userId, InventoryId, BorrowingTime),
    FOREIGN KEY (userId) REFERENCES user(userId),
    FOREIGN KEY (inventoryId) REFERENCES Inventory(inventoryId)
);
