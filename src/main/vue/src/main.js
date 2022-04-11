import Vue from 'vue'
import App from './App.vue'
import Router from './router/routes'
// import createPersistedState from "vuex-persistedstate"

Vue.config.productionTip = false

new Vue({
  Router,
  render: h => h(App),
}).$mount('#app')
