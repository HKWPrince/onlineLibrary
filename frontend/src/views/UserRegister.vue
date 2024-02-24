<template>
  <div class="register-container">
    <div class="form-container">
      <h1 class="title">Library</h1>
      <form @submit.prevent="register" class="register-form">
        <div class="input-field">
          <input type="email" placeholder="Email" required>
        </div>
        <div class="input-field">
          <input type="password" placeholder="Password" required>
        </div>
        <button type="submit" class="submit-btn">Sign up</button>
        <p class="signin-text">Already have an account? <a href="/login">Sign in.</a></p>
      </form>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    register() {
      // 註冊邏輯
      alert('註冊功能尚未實現');
    }
  }
};
</script>

<style scoped>
.register-container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  background: url('../assets/library.jpg') no-repeat center center fixed;
  background-size: cover;
  margin: 0;
  padding: 0;
}

.form-container {
  background-color: rgba(255, 255, 255, 0.85);
  padding: 2rem;
  border-radius: 10px;
  box-shadow: 0 5px 15px rgba(0, 0, 0, 0.5);
  width: 100%;
  max-width: 400px;
}

.title {
  text-align: center;
  color: #333;
  margin-bottom: 1rem;
}

.input-field {
  margin-bottom: 1rem;
  position: relative;
}

.input-field input {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

.input-field small {
  position: absolute;
  left: 10px;
  bottom: -20px;
  color: red;
  font-size: 12px;
}

.submit-btn {
  width: 100%;
  padding: 10px;
  border: none;
  border-radius: 4px;
  background-color: #3498db;
  color: white;
  cursor: pointer;
  margin-bottom: 1rem;
}

.submit-btn:hover {
  background-color: #2874a6;
}

.signin-text {
  text-align: center;
  font-size: 14px;
}

.signin-text a {
  color: #3498db;
  text-decoration: none;
}

.signin-text a:hover {
  text-decoration: underline;
}
</style>
