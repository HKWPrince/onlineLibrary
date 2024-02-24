import pandas as pd
import requests
import os

# 1. 列印進度
def print_progress(current, total):
    print(f"Processing {current}/{total}")

# 2. 刪除缺漏值
def remove_missing_values(df):
    return df.dropna()

# 3. 下載圖片至img資料夾中
def download_images(df):
    img_dir = './books_data/img'
    os.makedirs(img_dir, exist_ok=True)
    
    for index, row in df.iterrows():
        image_url = row['Image-URL-L']
        image_name = f"{index}.jpg"
        image_path = os.path.join(img_dir, image_name)
        try:
            response = requests.get(image_url)
            with open(image_path, 'wb') as f:
                f.write(response.content)
        except Exception as e:
            print(f"Error downloading image {image_url}: {e}")

# 4. 合併 Year-Of-Publication 和 Publisher 為 Introduction
def merge_columns(df):
    df['Introduction'] = df['Year-Of-Publication'].astype(str) + ', ' + df['Publisher']
    return df.drop(columns=['Year-Of-Publication', 'Publisher'])

# 讀取 Excel 檔案
input_file = './books_data/books2.xlsx'
df = pd.read_excel(input_file)

df=df[["ISBN","Book-Title","Book-Author","Year-Of-Publication","Publisher"]]
# 2. 刪除缺漏值
df = remove_missing_values(df)
# 3. 隨機取出1000本
df = df.sample(n=1000, random_state=42)
print(df.describe())
# # 4. 下載圖片至img資料夾中
# download_images(df)

# 5. 合併 Year-Of-Publication 和 Publisher 為 Introduction
df = merge_columns(df)

# 6. 另存新檔案為 bookData.csv
output_file = './books_data/bookData.csv'
df.to_csv(output_file, index=False)

print("Processing completed.")
