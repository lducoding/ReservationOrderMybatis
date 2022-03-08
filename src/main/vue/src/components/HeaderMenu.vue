<template>
  <div class="name">대충 위쪽 헤더 그리고 {{user}}</div>
</template>

<script>
export default {
  name: "HeaderMenu",
  props: [
      'user'],
  data() {
    let background;
    return {
      background,
    };
  },
}
</script>

<style scoped>

</style>