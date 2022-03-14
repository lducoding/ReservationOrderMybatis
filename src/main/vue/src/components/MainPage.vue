<template>
  <div>
  소개 페이지
  </div>
<!--  <h1 th:inline="text">반갑습니다! [[${#httpServletRequest.remoteUser}]]!</h1><br>-->
<!--  <a href="/res/showList">주문하러가기</a>-->
<!--  <div sec:authorize="hasRole('SELLER')">-->
<!--    <a href="/seller/test">seller</a>-->
<!--  </div>-->
<!--  <div sec:authorize="hasRole('CUSTOMER')">-->
<!--    <a href="/customer/test">customer</a>-->
<!--  </div>-->
<!--  <br>-->
<!--  <div sec:authorize ="isAnonymous()">-->
<!--    <form th:action="@{/member/loginPage}" method="get">-->
<!--      <input type="submit" value="로그인"/>-->
<!--    </form>-->
<!--  </div>-->
<!--  <div sec:authorize="isAuthenticated()">-->
<!--    <form th:action="@{/logout}" method="post">-->
<!--      <input type="submit" value="로그아웃"/>-->
<!--    </form>-->
<!--  </div>-->
</template>

<script>
export default {
  name: "MainPage"
}
</script>

<style scoped>

</style>