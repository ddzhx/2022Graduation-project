import Vue from 'vue'
import Vuex from 'vuex'
import user from './user'

Vue.use(Vuex)

const store = new Vuex.Store({
    state:{
        HOST: 'http://127.0.0.1:8083',
        url: '',                //图片地址
    },
    modules:{
        user
    }
})

export default store