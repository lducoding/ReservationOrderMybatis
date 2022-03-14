import Vue from 'vue';
import VueRouter from 'vue-router';
import MainPage from '../components/MainPage'
import HelloPage from '../components/HelloWorld'

Vue.use(VueRouter);

export default new VueRouter({
    mode: 'history',
    routes: [
        { path: '/res/hello', component: MainPage },
        { path: '/hello/page', component: HelloPage },
    ],
});