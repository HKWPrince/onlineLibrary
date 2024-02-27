<template>
    <div id="app-layout">
      <header class="top-bar">
        <!-- 頂部導航欄內容 -->
      </header>
      
      <aside class="sidebar">
        <!-- 側邊導航菜單內容 -->
      </aside>
      
      <main class="main-content">
        <router-view />
      </main>
    </div>
  </template>
  
  <script>
  export default {
    name: 'AppLayout',
    // ...
  };
  </script>
  
  <style scoped>
  #app-layout {
    display: flex;
    height: 100vh;
  }
  
  .top-bar {
    width: 100%;
    background-color: #f5f5f5;
  
  }
  
  .sidebar {
    width: 250px;
    background-color: #343a40;
    color: white;
    
  }
  
  .main-content {
    flex-grow: 1;
    overflow-y: auto;
    
  }
  </style>
  