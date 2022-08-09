import Vue from 'vue';
import Vuex from 'vuex';
import createPersistedState from 'vuex-persistedstate';
import moduleName from './moduleName';

Vue.use(Vuex);

const store = new Vuex.Store({
    modules: moduleName,
    plugins: [
        createPersistedState({
            paths: ['moduleName'],
        })
]
})

export default store;