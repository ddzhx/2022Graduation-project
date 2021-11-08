import Vue from 'vue'
import Router from 'vue-router'
import prine from '@/components/prine'
import index from '@/page/index'
import classify from '@/page/classify'
import find from '@/page/find'
import cart from '@/page/cart'
import my from '@/page/my'
import login from '@/page/login'
import register from '@/page/register'
import detail from '@/page/detail'
import personal from '@/page/personal'
import dingdan from '@/page/dingdan'
import sucess from '@/page/sucess'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect:'/index',
    },
    {
      path: '/prine',
      component: prine
    },
    {
      path: '/index',
      component: index,
      meta: {
        footShow: true, 
      },
    },
    {
      path: '/classify',
      component: classify,
      meta: {
        footShow: true, 
      },
    },
    {
      path: '/find',
      component: find,
      meta: {
        footShow: true, 
      },
    },
    {
      path: '/cart',
      component: cart,
      meta: {
        footShow: true, 
      },
    },
    {
      path: '/my',
      component: my,
      meta: {
        footShow: true, 
      }
    },
    {
      path: '/login',
      component: login,
    },
    {
      path: '/register',
      component: register,
    }
    ,
    {
      path: '/detail',
      component: detail,
    },
    {
      path: '/personal',
      component: personal,
    },
    {
      path: '/dingdan',
      component: dingdan,
    },
    {
      path: '/sucess',
      component: sucess,
    }
  ]


})
