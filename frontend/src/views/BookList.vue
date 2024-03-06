<template>
  <div id="app-container" class="container-fluid">
    <!-- Side Navigation -->
    <div class="row">
      <aside class="col-md-2 sidebar bg-dark">
        <ul class="nav flex-column">
          <li class="nav-item">
            <router-link to="/loans" class="nav-link text-white">BookSelf</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/books" class="nav-link text-white">Books</router-link>
          </li>
          <!-- 其他側邊欄項目 -->
        </ul>
      </aside>

      <!-- Main Content Area -->
      <main class="col-md-10 main-content">
        <!-- Top Navigation Bar -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <div class="container-fluid">
            <!-- Top Nav Content -->
            <div class="collapse navbar-collapse">
              <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                  <a href="#" class="nav-link">Edit Profile</a>
                </li>
                <li class="nav-item">
                  <a href="#" class="nav-link">Sign out</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>

        <!-- Book List Table -->
        <section class="book-list-section mt-3">
          <h1>Books</h1>
          <!-- Add search bar and filter options here -->

          <!-- Books Table -->
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>ISBN</th>
                  <th>Name</th>
                  <th>Author</th>
                  <th>Introduction</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="book in books" :key="book.isbn">
                  <td>{{ book.isbn }}</td>
                  <td>{{ book.name }}</td>
                  <td>{{ book.author }}</td>
                  <td>{{ book.introduction }}</td>
                  <td>
                    <button class="btn btn-primary btn-sm">Add</button>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </section>
      </main>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      books: [] // 初始書籍數據為空
    };
  },
  mounted() {
    this.fetchBooks();
  },
  methods: {
    fetchBooks() {
      axios.get('http://localhost:8081/books')
        .then(response => {
          this.books = response.data; // 將獲取的書籍數據賦值給books
          console.log(response.data[1])
        })
        .catch(error => {
          console.error('There was an error fetching the books:', error);
        });
    }
  }
};
</script>
