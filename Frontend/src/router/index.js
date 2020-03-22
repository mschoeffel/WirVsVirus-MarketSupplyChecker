import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import SoGehts from "../views/SoGehts";
import SearchOrt from "../views/SearchOrt";
import SearchWare from "../views/SearchWare";
import SearchResult from "../views/SearchResult";
import AddInfoMarket from "../views/AddInfoMarket";
import AddInfoWare from "../views/AddInfoWare";
import AddInfoQuantity from "../views/AddInfoQuantity";
import AddInfoResult from "../views/AddInfoResult";

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
    path: '/searchCity',
    name: 'SearchCity',
    component: SearchOrt
  },
  {
    path: '/searchProduct',
    name: 'SearchProduct',
    component: SearchWare
  },
  {
    path: '/searchResult',
    name: 'SearchResult',
    component: SearchResult
  },
  {
    path: '/addInfoMarket',
    name: 'AddInfoMarket',
    component: AddInfoMarket
  },
  {
    path: '/addInfoProduct',
    name: 'AddInfoProduct',
    component: AddInfoWare
  },
  {
    path: '/addInfoQuantity',
    name: 'AddInfoQuantity',
    component: AddInfoQuantity
  },
  {
    path: '/addInfoResult',
    name: 'AddInfoResult',
    component: AddInfoResult
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
