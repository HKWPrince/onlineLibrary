<template>
  <div id="app-container" class="container-fluid">
    <!-- Side Navigation -->
    <div class="row">
      <aside class="col-md-2 sidebar bg-dark">
        <ul class="nav flex-column">
          <li class="nav-item">
            <router-link to="/loans" class="nav-link text-white">Loans</router-link>
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
                  <th>Title</th>
                  <th>Author</th>
                  <th>Status</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="book in books" :key="book.isbn">
                  <td>{{ book.isbn }}</td>
                  <td>{{ book.title }}</td>
                  <td>{{ book.author }}</td>
                  <td>
                    <span :class="book.isAvailable ? 'badge bg-success' : 'badge bg-danger'">
                      {{ book.isAvailable ? 'Available' : 'Unavailable' }}
                    </span>
                  </td>
                  <td>
                    <button class="btn btn-primary btn-sm">View</button>
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
export default {
  data() {
    return {
      // 您的書籍數據
      books: [
        // 示例數據
        {
          isbn: '9780132350884',
          title: 'Clean Code',
          author: 'Robert Martin',
          isAvailable: false
        },
        // 其他書籍數據
      ]
    };
  }
};
</script>
<!-- 
<style scoped>
#app-container {
  display: flex;
  height: 100vh;
}

.sidebar {
  width: 200px;
  background: #2c3e50;
  color: white;
  padding: 20px;
}

.sidebar-menu {
  list-style: none;
  padding: 0;
}

.sidebar-menu li a {
  color: white;
  text-decoration: none;
}

.main-content {
  flex-grow: 1;
  padding: 20px;
}

.top-nav {
  display: flex;
  justify-content: flex-end;
  padding-bottom: 20px;
}

.top-nav-item {
  padding: 0 10px;
}

.book-list-section {
  background: #ecf0f1;
  padding: 20px;
}

.books-table {
  width: 100%;
  border-collapse: collapse;
}

.books-table th, .books-table td {
  padding: 10px;
  border: 1px solid #bdc3c7;
}

.status-available {
  color: #27ae60;
}

.status-unavailable {
  color: #c0392b;
}

/* 添加更多樣式以匹配您的設計要求 */
</style> -->
