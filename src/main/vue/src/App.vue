<template>
  <div id="app">
    <main-page></main-page>
  </div>


</template>

<script>
// import axios from 'axios'
import router from './router/routes'
import MainPage from "@/components/MainPage";

export default {
  components: {MainPage},
  router,
  name: 'App',
  data: function () {
    return {}
  },
  methods: {

  }
}
</script>

<style>
@import 'css/styles.css';
</style>