<template>
    <div id="app">
      <router-view></router-view>
    </div>
  </template>
  
  <script>
  export default {
    name: 'App'
  };
  </script>
  

  <style>
  html, body, #app {
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%;
    background-color: #f4f6f8; /* 您可以根据需要设置背景颜色 */
  }
  
  body {
    /* 如果您有全局字体样式，也可以在这里设置 */
    font-family: Arial, sans-serif;
  }
  </style>
  