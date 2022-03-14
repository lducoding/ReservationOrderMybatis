<template>
  <div id="app">
    <div>
      <router-link to="/res/hello">hello</router-link>
      <router-link to="/hello/page">hihi</router-link>
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
