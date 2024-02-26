import { createRouter, createWebHistory } from 'vue-router'
import UserLogin from '../views/UserLogin.vue'
import UserRegister from '../views/UserRegister.vue'
import BookList from '../views/BookList.vue'
import BookDetail from '../views/BookDetail.vue'
import MyBooks from '../views/MyBooks.vue'

const router = createRouter({
    history: createWebHistory(),
    routes: [
        { path: '/login', component: UserLogin },
        { path: '/', component: UserLogin },
        { path: '/register', component: UserRegister },
        { path: '/books', component: BookList },
        { path: '/books/:id', component: BookDetail },
        { path: '/my-books', component: MyBooks }
    ]
})

export default router