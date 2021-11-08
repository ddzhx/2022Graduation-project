<template>
  <div id="app">
    <transition>
      <router-view></router-view>
		</transition>
<div class="mint-tabbar is-fixed" v-bind:class="active" @click.prevent v-if="$route.meta.footShow">
    <router-link class="mint-tab-item index" to="/index" @click.native="makeactive('index')">
        <div class="mint-tab-item-icon"><img src="./assets/img/index.png"></div> 
        <div class="mint-tab-item-label">首页</div>
    </router-link> 
    <router-link class="mint-tab-item classify" to="/classify" @click.native="makeactive('classify')">
        <div class="mint-tab-item-icon"><img src="./assets/img/classify.png"></div> 
        <div class="mint-tab-item-label">分类</div>
    </router-link> 
    <router-link class="mint-tab-item find" to="/find" @click.native="makeactive('find')">
        <div class="mint-tab-item-icon"><img src="./assets/img/find.png"></div> 
        <div class="mint-tab-item-label">发现</div>
    </router-link> 
    <router-link class="mint-tab-item cart" to="/cart" @click.native="makeactive('cart')">
        <div class="mint-tab-item-icon"><img src="./assets/img/cart.png"></div> 
        <div class="mint-tab-item-label">购物车</div>
    </router-link> 
    <router-link class="mint-tab-item my" to="/my" @click.native="makeactive('my')">
        <div class="mint-tab-item-icon"><img src="./assets/img/my.png"></div> 
        <div class="mint-tab-item-label">我的</div>
    </router-link>
</div>
  </div>
</template>

<script>
export default {
  name: 'App',
  data(){
    return{   
      active: '',
    }
  },
   methods:{
     makeactive: function(item){
          this.active = item;
          
      }
   }
  }
</script>

<style >
	#app {
		font-family: Avenir, Helvetica, Arial, sans-serif;
		-webkit-font-smoothing: antialiased;
		-moz-osx-font-smoothing: grayscale;
		color: #2c3e50;
		padding-bottom: 50px;
		box-sizing: border-box;
		overflow: hidden;
	}

	.v-enter {
		transform: translateX(100%);
		opacity: 0;
	}

	.v-leave-to {
		transform: translateX(-100%);
		position: absolute;
		opacity: 0;
	}

  div.index .index,
	div.classify .classify,
	div.find .find,
	div.cart .cart,
  div.my .my{
		background-color:#bbbabaf6;
	}

</style>




