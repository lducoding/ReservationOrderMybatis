<template>
  <div>
    <div v-if="loginSuccess">
      {{ name }}님 환영합니다.<br>{{jwt}}
      <button @click="btnClick">서버 통신</button>
    </div>
    <div v-else>
      로그인해 주십시오<br>
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
      jwt: "",
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
              thisData.jwt = response.headers['authorization'];
              thisData.loginSuccess = true;
            }
          })
          .catch(function(error){
            console.log(error);
          });
    },
    btnClick() {
      axios.get('/res/hello', {
        headers: {
          Authorization: this.jwt
        }
      })
          .then(res => {
            console.log(res.data);  //값을 불러왔을때
            //this.test = res.data['ldu'];
          });
    }
  }
}
</script>

<style scoped>

</style>