<template>
  <div class="book-list-page">
    <!-- Header and Search Bar -->
    <div class="search-bar">
      <!-- Add search bar inputs and buttons here -->
    </div>

    <!-- Book List -->
    <div class="book-list">
      <div class="book-item" v-for="book in books" :key="book.isbn">
        <div class="book-cover">
          <img :src="require('@/assets/book.jpg')" alt="Book Cover">
        </div>
        <div class="book-details">
          <div class="book-title">{{ book.title }}</div>
          <div class="book-isbn">{{ book.isbn }}</div>
          <div class="book-author">{{ book.author }}</div>
          <div class="book-status">
            <span :class="{ available: book.isAvailable }">
              {{ book.isAvailable ? 'Available' : 'Unavailable' }}
            </span>
          </div>
          <button class="view-button">View</button>
        </div>
      </div>
    </div>
  </div>
</template>


  
<script>
export default {
  data() {
    return {
      books: [
        {
          isbn: '9780132350884',
          title: 'Clean Code',
          author: 'Robert Martin',
          price: '$38',
          cover: 'path-to-clean-code-cover.jpg'
        },
        // 其他書籍數據...
      ],
    };
  },
};
</script>

  
<style scoped>
.book-list-page {
  padding: 20px;
}

.search-bar {
  /* Style your search bar here */
}

.book-list {
  display: flex;
  flex-wrap: wrap;
}

.book-item {
  margin: 10px;
  box-shadow: 0 2px 4px rgba(0,0,0,.1);
  width: calc(33.333% - 20px);
  background: white;
}

.book-cover img {
  width: 100%;
  display: block;
}

.book-details {
  padding: 10px;
}

.book-title {
  font-size: 1.1em;
  color: #333;
  margin-bottom: 5px;
}

.book-author, .book-isbn {
  color: #666;
  font-size: 0.9em;
  margin-bottom: 5px;
}

.book-status span {
  padding: 2px 5px;
  border-radius: 5px;
  color: white;
  font-size: 0.9em;
}

.book-status .available {
  background: #2ecc71;
}

.book-status .unavailable {
  background: #e74c3c;
}

.view-button {
  padding: 5px 10px;
  border: none;
  border-radius: 5px;
  background-color: #3498db;
  color: white;
  cursor: pointer;
  margin-top: 10px;
}

.view-button:hover {
  background-color: #2874a6;
}
</style>

  