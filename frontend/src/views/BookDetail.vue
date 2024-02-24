<template>
    <div class="book-detail">
      <h1>{{ book.title }}</h1>
      <img :src="book.cover" alt="Cover" class="book-cover">
      <p><strong>作者：</strong>{{ book.author }}</p>
      <p><strong>ISBN：</strong>{{ book.isbn }}</p>
      <p><strong>简介：</strong>{{ book.description }}</p>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        book: {
          title: '示例书籍',
          author: '示例作者',
          isbn: '123-456-789',
          description: '这是一本示例书籍。',
          cover: 'cover-url.jpg'
        }
      };
    }
  };
  </script>
  
  <style scoped>
.detail-container {
  max-width: 800px;
  margin: 50px auto;
  padding: 20px;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.book-cover {
  width: 100%;
  max-width: 400px;
  margin: 20px 0;
  border-radius: 5px;
}

.book-info {
  margin-top: 20px;
}

.book-info h2 {
  margin-bottom: 20px;
}

.book-info p {
  line-height: 1.6;
}
</style>
