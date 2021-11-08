<template>
<div>
  <div class="navleft">
    <el-menu
      default-active="$route.path"
      router
      class="el-menu-vertical-demo"
      background-color="#545c64"
      height="1000px"
      text-color="#fff"
      active-text-color="#ffd04b">
       <el-submenu index="0">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>用户数据</span>
        </template>
          <el-menu-item index="/userdata">数据可视化图</el-menu-item>
        </el-submenu>
        <el-submenu index="1">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>首页</span>
        </template>
          <el-menu-item index="/slideshow">轮播图</el-menu-item>
          <el-menu-item index="/Home">首页产品图</el-menu-item>
        </el-submenu>
         <el-submenu index="2">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>分类</span>
        </template>
          <el-menu-item index="/classify">分类产品</el-menu-item>
           <el-menu-item index="/flprodution">产品详情</el-menu-item>
        </el-submenu>
         <el-submenu index="3">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>发现</span>
        </template>
          <el-menu-item index="/find">发现</el-menu-item>
        </el-submenu>
          <el-submenu index="4">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>订单</span>
        </template>
          <el-menu-item index="/dingdan">订单</el-menu-item>
        </el-submenu>
    </el-menu>
  </div>

  <div class="rbar">
    <router-view></router-view>
  </div>
  
</div>
  
</template>

<script>
  export default {
    data(){
      return{
      }
    },
    methods: {
    }
  }
</script>

<style>
 .el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
    min-height: 740px;
  }
  .navleft{
    height: 100px;
    width: 200px;
    float: left;
    position: relative;
  }
  .rbar{
    position: absolute;
    top: 0;
    left: 210px;
    width: 88%;
  }
</style>


<script>
  export default {
    data(){
      return{
      }
    },
    methods: {
    }
  }
</script>
