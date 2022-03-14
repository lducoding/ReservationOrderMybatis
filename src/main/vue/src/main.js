import Vue from 'vue'
import App from './App.vue'
import Router from './router/routes'

Vue.config.productionTip = false

new Vue({
  Router,
  render: h => h(App),
}).$mount('#app')
