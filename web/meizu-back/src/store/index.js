import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex)

const store = new Vuex.Store({
    state:{
        HOST: 'http://127.0.0.1:8083',
        url: '',                //图片地址
    },
    getters: {
        url: state => state.url,
    },
    mutations: {
        setUrl: (state,url) => {state.url = url},
    }
})

export default store