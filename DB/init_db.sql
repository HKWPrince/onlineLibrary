create schema Library;
use Library;

-- User 使用者資料表
CREATE TABLE IF NOT EXISTS User (
    PhoneNumber VARCHAR(10) NOT NULL UNIQUE PRIMARY KEY,
    Password VARCHAR(255) NOT NULL,
    UserName VARCHAR(255) NOT NULL,
    RegistrationTime DATETIME NOT NULL,
    LastLoginTime DATETIME
);

-- Book 書籍資料表
CREATE TABLE IF NOT EXISTS Book (
    ISBN VARCHAR(20) PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Author VARCHAR(255) NOT NULL,
    Introduction TEXT
);

-- Borrowing Record 借閱紀錄資料表
CREATE TABLE IF NOT EXISTS BorrowingRecord (
    ISBN VARCHAR(20),
    PhoneNumber VARCHAR(10) NOT NULL,
    InventoryId INT NOT NULL,
    BorrowingTime DATETIME NOT NULL,
    ReturnTime DATETIME,
    PRIMARY KEY (ISBN, PhoneNumber, InventoryId),
    FOREIGN KEY(ISBN) REFERENCES Book(ISBN) on delete cascade,
    FOREIGN KEY (PhoneNumber) REFERENCES User(PhoneNumber)
);

CREATE TABLE IF NOT EXISTS ReternsRecord (
	ISBN VARCHAR(20),
    PhoneNumber VARCHAR(10) NOT NULL,
    InventoryId INT NOT NULL,
    BorrowingTime DATETIME NOT NULL,
    ReturnTime DATETIME,
    PRIMARY KEY (ISBN, PhoneNumber, InventoryId),
    FOREIGN KEY(ISBN) REFERENCES Book(ISBN) on delete cascade,
    FOREIGN KEY (PhoneNumber) REFERENCES User(PhoneNumber)
);
