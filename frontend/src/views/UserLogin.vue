<template>
  <div class="login-container">
    <div class="form-container">
      <h1 class="title">Library</h1>
      <form @submit.prevent="login" class="login-form">
        <div class="input-field">
          <input type="tel" v-model="loginForm.phoneNumber" placeholder="Phone Number" required>
        </div>
        <div class="input-field">
          <input type="password" v-model="loginForm.password" placeholder="Password" required>
        </div>
        <button type="submit" class="submit-btn">Sign in</button>
        <p class="signup-text">Don't have an account? <a href="/register">Sign up.</a></p>
      </form>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      loginForm: {
        phoneNumber: '',
        password: ''
      }
    }
  },
  methods: {
    async login() {
      try {
        const response = await axios.post('http://localhost:8081/login', this.loginForm, {
          headers: {
            'Content-Type': 'application/json'
          }
        });
        
        if (response.data === 'True') {
          this.$router.push('/books'); // 登入成功，轉跳到 /books
        } else {
          alert('Login failed'); // 登入失敗，顯示錯誤訊息
        }
      } catch (error) {
        console.error('There was an error logging in:', error);
        alert('Login failed');
      }
    }
  }
};
</script>





<style scoped>
.login-container {
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

.signup-text {
  text-align: center;
  font-size: 14px;
}

.signup-text a {
  color: #3498db;
  text-decoration: none;
}

.signup-text a:hover {
  text-decoration: underline;
}
</style>
