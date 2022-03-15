<template>
  <div>
    <div v-if="loginSuccess">로그인 성공</div>
    <div v-else>로그인 실패</div>
  </div>
</template>

<script>
export default {
  name: "LoginPage",
  data() {
    return {
      loginSuccess: false,
    }
  }
}
</script>

<style scoped>

</style>