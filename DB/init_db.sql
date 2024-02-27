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

-- Borrowing Record 借閱紀錄資料表
CREATE TABLE IF NOT EXISTS BorrowingRecord (
    UserId INT NOT NULL,
    ISBN VARCHAR(20),
    BorrowingTime DATETIME NOT NULL,
    ReturnTime DATETIME,
    PRIMARY KEY (ISBN, UserId, BorrowingTime),
    FOREIGN KEY (UserId) REFERENCES user(UserId),
    FOREIGN KEY(ISBN) REFERENCES Book(ISBN) on delete cascade
);

CREATE TABLE IF NOT EXISTS ReternsRecord (
    UserId INT NOT NULL,
	ISBN VARCHAR(20),
    BorrowingTime DATETIME NOT NULL,
    ReturnTime DATETIME,
    PRIMARY KEY (ISBN, UserId, BorrowingTime),
    FOREIGN KEY (UserId) REFERENCES user(UserId),
    FOREIGN KEY(ISBN) REFERENCES Book(ISBN) on delete cascade
);
