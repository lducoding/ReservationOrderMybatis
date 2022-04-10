<template>
  <div>
    <div v-if="loginSuccess">{{ name }}님 환영합니다.</div>
    <div v-else>
      로그인해 주십시오<br>{{username}}
      <form v-on:submit.prevent="submitForm">
        <div>
          <label for="username">id:</label>
          <input id="username" type="text" v-model="username">
        </div>
        <div>
          <label for="password">pw:</label>
          <input id="password" type="password" v-model="password">
        </div>
        <button type="submit">login</button>
      </form>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "LoginPage",
  data() {
    return {
      loginSuccess: false,
      username: "",
      password: "",
      name: "",
    }
  },
  methods: {
    submitForm: function() {
      var url = '/login';
      var data = {
        username: this.username,
        password: this.password,
      }
    var thisData = this;
      axios.post(url, data)
          .then(function(response){
            console.log(response);
            if(response.status == 200) {
              thisData.name = response.headers['username'];
              thisData.loginSuccess = true;
            }
          })
          .catch(function(error){
            console.log(error);
          });
    }
  }
}
</script>

<style scoped>

</style>