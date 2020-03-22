import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import SoGehts from "../views/SoGehts";
import Search from "../views/Search";
import AddInfo from "../views/AddInfo";

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/manual',
    name: 'SoGehts',
    component: SoGehts
  },
  {
    path: '/search',
    name: 'Search',
    component: Search
  },
  {
    path: '/addInfo',
    name: 'AddInfo',
    component: AddInfo
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
