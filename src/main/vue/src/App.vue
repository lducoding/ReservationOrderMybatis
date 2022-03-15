<template>
  <div id="app">
    <login-page></login-page>
    <div>
      <router-link to="/res/hello">hello</router-link>
      <router-link to="/hello/page">hihi</router-link>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
import router from './router/routes'
import loginPage from './components/LoginPage'

export default {
  router,
  name: 'App',
  components: {
    loginPage
  }
}
</script>

<style>

</style>
