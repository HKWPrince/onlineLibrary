<template>
  <div class="register-container">
    <div class="form-container">
      <h1 class="title">Library Registration</h1>
      <form @submit.prevent="register" class="register-form">
        <div class="input-field">
          <input v-model="user.phoneNumber" type="text" placeholder="Phone Number" required>
        </div>
        <div class="input-field">
          <input v-model="user.password" type="password" placeholder="Password" required>
        </div>
        <div class="input-field">
          <input v-model="user.userName" type="text" placeholder="Username" required>
        </div>
        <button type="submit" class="submit-btn">Sign up</button>
        <p class="signin-text">Already have an account? <a href="/login">Sign in.</a></p>
      </form>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      user: {
        phoneNumber: '',
        password: '',
        userName: ''
      }
    }
  },
  methods: {
    register() {
      axios.post('http://localhost:8081/save', this.user, {
        headers: {
          'Content-Type': 'application/json'
        }
      })
      .then(response => {
        console.log(response.data);
        alert('Registration successful');
        this.$router.push('/login');
      })
      .catch(error => {
        console.error(error);
        alert('Registration failed');
      });
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