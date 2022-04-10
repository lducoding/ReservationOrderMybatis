<template>
  <div id="app">
    <div>
      <router-link to="/res/hello">hello</router-link><br>
      <router-link to="/hello/page">hihi</router-link><br>
      <router-link to="/login">login</router-link><br>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
import router from './router/routes'

export default {
  router,
  name: 'App',
}
</script>

<style>

</style>
