import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import index from '@/components/index'
import slideshow from '@/components/slideshow'
import classify from '@/components/classify'
import find from '@/components/find'
import flprodution from '@/components/flprodution'
import userdata from '@/components/userdata'
import dingdan from '@/components/dingdan'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      component: index
    },
    {
      path: '/Home',
      component: Home
    },
    {
      path: '/slideshow',
      component: slideshow
    },
    {
      path: '/classify',
      component: classify
    },
    {
      path:'/find',
      component: find
    },
    {
      path:'/flprodution',
      component: flprodution
    },
    {
      path:'/userdata',
      component: userdata
    },
    {
      path:'/dingdan',
      component: dingdan
    }
    
  ]
})
