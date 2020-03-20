import Vue from 'vue'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import store from './store'
import i18n from './utils/i18n'
import vuetify from './plugins/vuetify';

Vue.config.productionTip = false;

Vue.use(vuetify);

new Vue({
    router,
    store,
    vuetify,
    i18n,
    render: h => h(App)
}).$mount('#app');
