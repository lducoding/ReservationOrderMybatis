<!--<template>-->
<!--  &lt;!&ndash;  <div id="app">&ndash;&gt;-->
<!--  &lt;!&ndash;    <div>&ndash;&gt;-->
<!--  &lt;!&ndash;      <router-link to="/res/hello">hello</router-link><br>&ndash;&gt;-->
<!--  &lt;!&ndash;      <router-link to="/hello/page">hihi</router-link><br>&ndash;&gt;-->
<!--  &lt;!&ndash;      <router-link to="/login">login</router-link><br>&ndash;&gt;-->
<!--  &lt;!&ndash;    </div>&ndash;&gt;-->
<!--  &lt;!&ndash;    <router-view></router-view>&ndash;&gt;-->
<!--  &lt;!&ndash;  </div>&ndash;&gt;-->


<!--  <div>-->
<!--    <head>-->
<!--      <meta charset="utf-8"/>-->
<!--      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>-->
<!--      <meta name="description" content=""/>-->
<!--      <meta name="author" content=""/>-->
<!--      <title>Shop Homepage - Start Bootstrap Template</title>-->
<!--      &lt;!&ndash; Favicon&ndash;&gt;-->
<!--      <link rel="icon" type="image/x-icon" href="assets/favicon.ico"/>-->
<!--      &lt;!&ndash; Bootstrap icons&ndash;&gt;-->
<!--      <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet"/>-->
<!--    </head>-->
<!--    &lt;!&ndash; Navigation&ndash;&gt;-->
<!--    <nav class="navbar navbar-expand-lg navbar-light bg-light">-->
<!--      <div class="container px-4 px-lg-5">-->
<!--        <a class="navbar-brand" href="#!">Start Bootstrap</a>-->
<!--        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"-->
<!--                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span-->
<!--            class="navbar-toggler-icon"></span></button>-->
<!--        <div class="collapse navbar-collapse" id="navbarSupportedContent">-->
<!--          <div v-if="accessToken!=null">-->
<!--            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">-->
<!--              <li class="nav-item"><a class="nav-link active" aria-current="page" href="">누구님 환영</a></li>-->
<!--            </ul>-->
<!--            <form class="d-flex">-->
<!--              <button class="btn btn-outline-dark" type="submit">-->
<!--                <i class="bi-cart-fill me-1"></i>-->
<!--                Cart-->
<!--                <span class="badge bg-dark text-white ms-1 rounded-pill">0</span>-->
<!--              </button>-->
<!--            </form>-->
<!--          </div>-->
<!--          <div v-else>-->
<!--            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">-->
<!--              <li class="nav-item"><button class="nav-link active" aria-current="page" @click="login">로그인</button></li>-->
<!--            </ul>-->
<!--          </div>-->
<!--        </div>-->
<!--      </div>-->
<!--    </nav>-->
<!--    &lt;!&ndash; Header&ndash;&gt;-->
<!--    <header class="bg-dark py-5">-->
<!--      <div class="container px-4 px-lg-5 my-5">-->
<!--        <div class="text-center text-white">-->
<!--          <h1 class="display-4 fw-bolder">Shop in style</h1>-->
<!--          <p class="lead fw-normal text-white-50 mb-0">With this shop hompeage template</p>-->
<!--        </div>-->
<!--      </div>-->
<!--    </header>-->
<!--    &lt;!&ndash; Section&ndash;&gt;-->
<!--    <section class="py-5">-->
<!--      <div class="container px-4 px-lg-5 mt-5">-->
<!--        <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">-->
<!--          <div class="col mb-5">-->
<!--            <div class="card h-100">-->
<!--              &lt;!&ndash; Product image&ndash;&gt;-->
<!--              <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..."/>-->
<!--              &lt;!&ndash; Product details&ndash;&gt;-->
<!--              <div class="card-body p-4">-->
<!--                <div class="text-center">-->
<!--                  &lt;!&ndash; Product name&ndash;&gt;-->
<!--                  <h5 class="fw-bolder">Fancy Product</h5>-->
<!--                  &lt;!&ndash; Product price&ndash;&gt;-->
<!--                  $40.00 - $80.00-->
<!--                </div>-->
<!--              </div>-->
<!--              &lt;!&ndash; Product actions&ndash;&gt;-->
<!--              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">-->
<!--                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>-->
<!--              </div>-->
<!--            </div>-->
<!--          </div>-->
<!--          <div class="col mb-5">-->
<!--            <div class="card h-100">-->
<!--              &lt;!&ndash; Sale badge&ndash;&gt;-->
<!--              <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>-->
<!--              &lt;!&ndash; Product image&ndash;&gt;-->
<!--              <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..."/>-->
<!--              &lt;!&ndash; Product details&ndash;&gt;-->
<!--              <div class="card-body p-4">-->
<!--                <div class="text-center">-->
<!--                  &lt;!&ndash; Product name&ndash;&gt;-->
<!--                  <h5 class="fw-bolder">Special Item</h5>-->
<!--                  &lt;!&ndash; Product reviews&ndash;&gt;-->
<!--                  <div class="d-flex justify-content-center small text-warning mb-2">-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                  </div>-->
<!--                  &lt;!&ndash; Product price&ndash;&gt;-->
<!--                  <span class="text-muted text-decoration-line-through">$20.00</span>-->
<!--                  $18.00-->
<!--                </div>-->
<!--              </div>-->
<!--              &lt;!&ndash; Product actions&ndash;&gt;-->
<!--              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">-->
<!--                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>-->
<!--              </div>-->
<!--            </div>-->
<!--          </div>-->
<!--          <div class="col mb-5">-->
<!--            <div class="card h-100">-->
<!--              &lt;!&ndash; Sale badge&ndash;&gt;-->
<!--              <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>-->
<!--              &lt;!&ndash; Product image&ndash;&gt;-->
<!--              <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..."/>-->
<!--              &lt;!&ndash; Product details&ndash;&gt;-->
<!--              <div class="card-body p-4">-->
<!--                <div class="text-center">-->
<!--                  &lt;!&ndash; Product name&ndash;&gt;-->
<!--                  <h5 class="fw-bolder">Sale Item</h5>-->
<!--                  &lt;!&ndash; Product price&ndash;&gt;-->
<!--                  <span class="text-muted text-decoration-line-through">$50.00</span>-->
<!--                  $25.00-->
<!--                </div>-->
<!--              </div>-->
<!--              &lt;!&ndash; Product actions&ndash;&gt;-->
<!--              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">-->
<!--                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>-->
<!--              </div>-->
<!--            </div>-->
<!--          </div>-->
<!--          <div class="col mb-5">-->
<!--            <div class="card h-100">-->
<!--              &lt;!&ndash; Product image&ndash;&gt;-->
<!--              <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..."/>-->
<!--              &lt;!&ndash; Product details&ndash;&gt;-->
<!--              <div class="card-body p-4">-->
<!--                <div class="text-center">-->
<!--                  &lt;!&ndash; Product name&ndash;&gt;-->
<!--                  <h5 class="fw-bolder">Popular Item</h5>-->
<!--                  &lt;!&ndash; Product reviews&ndash;&gt;-->
<!--                  <div class="d-flex justify-content-center small text-warning mb-2">-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                  </div>-->
<!--                  &lt;!&ndash; Product price&ndash;&gt;-->
<!--                  $40.00-->
<!--                </div>-->
<!--              </div>-->
<!--              &lt;!&ndash; Product actions&ndash;&gt;-->
<!--              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">-->
<!--                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>-->
<!--              </div>-->
<!--            </div>-->
<!--          </div>-->
<!--          <div class="col mb-5">-->
<!--            <div class="card h-100">-->
<!--              &lt;!&ndash; Sale badge&ndash;&gt;-->
<!--              <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>-->
<!--              &lt;!&ndash; Product image&ndash;&gt;-->
<!--              <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..."/>-->
<!--              &lt;!&ndash; Product details&ndash;&gt;-->
<!--              <div class="card-body p-4">-->
<!--                <div class="text-center">-->
<!--                  &lt;!&ndash; Product name&ndash;&gt;-->
<!--                  <h5 class="fw-bolder">Sale Item</h5>-->
<!--                  &lt;!&ndash; Product price&ndash;&gt;-->
<!--                  <span class="text-muted text-decoration-line-through">$50.00</span>-->
<!--                  $25.00-->
<!--                </div>-->
<!--              </div>-->
<!--              &lt;!&ndash; Product actions&ndash;&gt;-->
<!--              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">-->
<!--                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>-->
<!--              </div>-->
<!--            </div>-->
<!--          </div>-->
<!--          <div class="col mb-5">-->
<!--            <div class="card h-100">-->
<!--              &lt;!&ndash; Product image&ndash;&gt;-->
<!--              <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..."/>-->
<!--              &lt;!&ndash; Product details&ndash;&gt;-->
<!--              <div class="card-body p-4">-->
<!--                <div class="text-center">-->
<!--                  &lt;!&ndash; Product name&ndash;&gt;-->
<!--                  <h5 class="fw-bolder">Fancy Product</h5>-->
<!--                  &lt;!&ndash; Product price&ndash;&gt;-->
<!--                  $120.00 - $280.00-->
<!--                </div>-->
<!--              </div>-->
<!--              &lt;!&ndash; Product actions&ndash;&gt;-->
<!--              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">-->
<!--                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>-->
<!--              </div>-->
<!--            </div>-->
<!--          </div>-->
<!--          <div class="col mb-5">-->
<!--            <div class="card h-100">-->
<!--              &lt;!&ndash; Sale badge&ndash;&gt;-->
<!--              <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>-->
<!--              &lt;!&ndash; Product image&ndash;&gt;-->
<!--              <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..."/>-->
<!--              &lt;!&ndash; Product details&ndash;&gt;-->
<!--              <div class="card-body p-4">-->
<!--                <div class="text-center">-->
<!--                  &lt;!&ndash; Product name&ndash;&gt;-->
<!--                  <h5 class="fw-bolder">Special Item</h5>-->
<!--                  &lt;!&ndash; Product reviews&ndash;&gt;-->
<!--                  <div class="d-flex justify-content-center small text-warning mb-2">-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                  </div>-->
<!--                  &lt;!&ndash; Product price&ndash;&gt;-->
<!--                  <span class="text-muted text-decoration-line-through">$20.00</span>-->
<!--                  $18.00-->
<!--                </div>-->
<!--              </div>-->
<!--              &lt;!&ndash; Product actions&ndash;&gt;-->
<!--              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">-->
<!--                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>-->
<!--              </div>-->
<!--            </div>-->
<!--          </div>-->
<!--          <div class="col mb-5">-->
<!--            <div class="card h-100">-->
<!--              &lt;!&ndash; Product image&ndash;&gt;-->
<!--              <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..."/>-->
<!--              &lt;!&ndash; Product details&ndash;&gt;-->
<!--              <div class="card-body p-4">-->
<!--                <div class="text-center">-->
<!--                  &lt;!&ndash; Product name&ndash;&gt;-->
<!--                  <h5 class="fw-bolder">Popular Item</h5>-->
<!--                  &lt;!&ndash; Product reviews&ndash;&gt;-->
<!--                  <div class="d-flex justify-content-center small text-warning mb-2">-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                    <div class="bi-star-fill"></div>-->
<!--                  </div>-->
<!--                  &lt;!&ndash; Product price&ndash;&gt;-->
<!--                  $40.00-->
<!--                </div>-->
<!--              </div>-->
<!--              &lt;!&ndash; Product actions&ndash;&gt;-->
<!--              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">-->
<!--                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>-->
<!--              </div>-->
<!--            </div>-->
<!--          </div>-->
<!--        </div>-->
<!--      </div>-->
<!--    </section>-->
<!--    &lt;!&ndash; Footer&ndash;&gt;-->
<!--    <footer class="py-5 bg-dark">-->
<!--      <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2022</p></div>-->
<!--    </footer>-->
<!--    &lt;!&ndash; Bootstrap core JS&ndash;&gt;-->
<!--&lt;!&ndash;    <script type="application/javascript" src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>&ndash;&gt;-->
<!--    &lt;!&ndash; Core theme JS&ndash;&gt;-->
<!--&lt;!&ndash;    <script type="application/javascript" src="js/scripts.js"></script>&ndash;&gt;-->
<!--  </div>-->
<!--</template>-->

<!--<script>-->
<!--// import axios from 'axios'-->
<!--import router from './router/routes'-->

<!--export default {-->
<!--  router,-->
<!--  name: 'App',-->
<!--  data() {-->
<!--    return {-->
<!--      loginSuccess: false,-->
<!--      name: "",-->
<!--      accessToken: null,-->
<!--      refreshToken: "",-->
<!--    }-->
<!--  },-->
<!--  methods: {-->
<!--    login() {-->
<!--      this.accessToken = "aaa";-->
<!--    }-->
<!--}-->
<!--}-->
<!--</script>-->

<!--<style>-->
<!--@import 'css/styles.css';-->
<!--</style>-->
<template>
  <div class="hello">
    <!--'아래의 값은 store에서 불러오는 값입니다. 정상적인 방법으로 웹이 진행되면 getters에 의해 값을 가져오겠지만, 새로고침시 store가 초기화 면서 init 값이 보여지게 됩니다.'--!>
    <span>contextText</span>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  computed :{
    contextText : function(){
      return this.$store.getters['test'];
    }
  },
}
</script>