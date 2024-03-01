#!/bin/bash

# 啟動 Docker 容器
docker-compose up -d

# 等待 MySQL 完全啟動，
echo "Datebase Loading..."
i=0
str=""
arry=("\\" "|" "/" "-")
while [ $i -le 10 ]
do
    let index=i%4
    if [ $i -le 20 ]; then
        let color=44
        let bg=34
    elif [ $i -le 45 ]; then
        let color=43
        let bg=33
    elif [ $i -le 75 ]; then
        let color=41
        let bg=31
    else
        let color=42
        let bg=32
    fi
    printf "\033[${color};${bg}m%-s\033[0m %d %c\r" "$str" "$i" "${arry[$index]}"
    sleep 1
    let i=i+1
    str+="#"
done
echo ""

# 執行初始化資料庫結構 SQL 腳本
docker exec -i mysql-server mysql -u root -pmy-secret-pw mydatabase < ./DB/init_db.sql

# 執行初始化書籍表格 SQL 腳本
docker exec -i mysql-server mysql -u root -pmy-secret-pw mydatabase < ./DB/init_book_table.sql 
docker exec -i mysql-server mysql -u root -pmy-secret-pw --local-infile=1 mydatabase < ./DB/init_book_table.sql 


# 檢查表是否創建成功
docker exec -i mysql-server mysql -u root -pmy-secret-pw mydatabase -e "SHOW TABLES;"

echo "Starting Backend Spring Boot Application..."
# 轉到後端項目目錄

cd backend
# 使用 Gradle 啟動 Spring Boot 應用
./gradlew bootRun &

# 等待後端應用啟動
sleep 10

echo "Starting Frontend Vue.js Application..."
# 轉到前端項目目錄
cd ../frontend
# 安裝依賴
npm install
# 啟動 Vue.js 應用
npm run serve &

