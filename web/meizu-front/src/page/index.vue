<template>
<div class="indexbox">
  <!-- 首页 -->
<div  class="searchTop">
<!-- 头部 -->
<div class="sercontent">
  <a href="#"  class="index-logo">
      <svg width="80px" fill="#008cff" height="30px" viewBox="0 0 108 10">
          <g id="编组" transform="translate(0.999800, 0.999800)">
            <polygon id="Fill-1" points="53.3530588 20 56.6877647 20 56.6877647 0 53.3530588 0"></polygon>
              <path d="M103.371647,0.000176470588 L103.371647,15.0003235 C103.371647,15.9199718 102.625176,16.6667451 101.704588,16.6667451 L98.3698824,16.6667451 L96.7022353,16.6667451 L91.7004706,16.6667451 C90.7798824,16.6667451 90.0334118,15.9199718 90.0334118,15.0003235 L90.0334118,0.000176470588 L86.6987059,0.000176470588 L86.6987059,15.8335343 C86.6987059,18.1344193 88.5651765,20.0001765 90.8669412,20.0001765 L96.7022353,20.0001765 L98.3698824,20.0001765 L102.538118,20.0001765 C104.839882,20.0001765 106.706353,18.1344193 106.706353,15.8335343 L106.706353,0.000176470588 L103.371647,0.000176470588 Z" id="Fill-2"></path><path d="M22.5082353,0.000176470588 L15.0052941,0.000176470588 L11.6711765,0.000176470588 L4.16823529,0.000176470588 C1.86588235,0.000176470588 -2.71678105e-14,1.865236 -2.71678105e-14,4.16657365 L-2.71678105e-14,19.9990005 L3.33470588,19.9990005 L3.33470588,4.99973549 C3.33470588,4.07896524 4.08117647,3.33282383 5.00176471,3.33282383 L11.6711765,3.33282383 L11.6711765,20.0001765 L15.0052941,20.0001765 L15.0052941,3.33282383 L21.6747059,3.33282383 C22.5952941,3.33282383 23.3423529,4.07896524 23.3423529,4.99973549 L23.3423529,19.9990005 L26.6764706,19.9990005 L26.6764706,4.16657365 C26.6764706,1.865236 24.8105882,0.000176470588 22.5082353,0.000176470588" id="Fill-4"></path><path d="M31.6787647,4.16717644 L31.6787647,4.16717644 L31.6787647,15.8336471 C31.6787647,18.1345997 33.5446471,20.0004118 35.847,20.0004118 L48.3517059,20.0004118 L48.3517059,16.6668824 L36.6805294,16.6668824 C35.7593529,16.6668824 35.0128824,15.9212632 35.0128824,15.0004118 L35.0128824,13.3333531 L35.0128824,11.6674704 L48.3517059,11.6674704 L48.3517059,8.33394111 L35.0128824,8.33394111 L35.0128824,5.00041176 C35.0128824,4.0795603 35.7593529,3.33335308 36.6805294,3.33335308 L48.3517059,3.33335308 L48.3517059,0.000411764706 L35.847,0.000411764706 C33.5446471,0.000411764706 31.6787647,1.8656358 31.6787647,4.16717644" id="Fill-6"></path><path d="M81.6971176,2.50017657 C81.6971176,1.11948741 80.5771176,0.000470588235 79.1959412,0.000470588235 L61.6894706,0.000470588235 L61.6894706,3.3334119 L76.7135882,3.3334119 L62.523,15.6367166 L62.5253529,15.6384807 C62.0135882,16.0965543 61.6894706,16.7598496 61.6894706,17.5001766 C61.6894706,18.8814538 62.8094706,20.0004706 64.1900588,20.0004706 L81.6971176,20.0004706 L81.6971176,16.6669412 L66.6653529,16.6669412 L80.7418235,4.46242519 C81.3224118,4.0049396 81.6971176,3.29695418 81.6971176,2.50017657" id="Fill-8"></path>
          </g>
      </svg>
   </a>
  <el-autocomplete class="srk"
  v-model="state"
  :fetch-suggestions="querySearchAsync"
  placeholder="搜索商品"
  @select="handleSelect"
></el-autocomplete>
<el-button class="serbutton" type="primary" icon="el-icon-search"><i>搜索</i></el-button>
<el-col :span="12">
    <!-- <span class="demonstration">click 激活</span> -->
    <el-dropdown trigger="click">
      <span class="el-dropdown-link">
        <i class="el-icon-arrow-down el-icon--right"></i>
      </span>
      <el-dropdown-menu slot="dropdown">
        <el-dropdown-item icon="el-icon-message-solid">消息</el-dropdown-item>
        <el-dropdown-item icon="el-icon-star-off">收藏</el-dropdown-item>
      </el-dropdown-menu>
    </el-dropdown>
  </el-col>
</div>
<!-- 主内容 -->
<!-- 轮播图 -->
<div class="lbt">
  <mt-swipe :auto="4000">
  <mt-swipe-item v-for="item in imgs" :key="item.id">
  <img :src="getUrl(item.pic)" />
  </mt-swipe-item>

</mt-swipe>

</div>
<!-- 图标列表 -->
<div class="liebiao">
  <ul id="tupian" class="mui-table-view mui-grid-view mui-grid-9">
      <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-4">
        <router-link to="/index" class="rot">
          <img src="../assets/images/MZ18.png" alt="" class="img1">
          <div class="mui-media-body">魅族 18</div>
        </router-link>
      </li>
      <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-4">
        <router-link to="/index" class="rot">
          <img src="../assets/images/jfdh.png" alt="" class="img1">
          <div class="mui-media-body">积分兑换</div>
        </router-link>
      </li>
      <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-4">
        <router-link to="/index" class="rot">
          <img src="../assets/images/lyhzq.png" alt="" class="img1">
          <div class="mui-media-body">老用户</div>
        </router-link>
      </li>
      <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-4">
        <router-link to="/index" class="rot">
          <img src="../assets/images/yjhx.png" alt="" class="img1">
          <div class="mui-media-body">以旧换新</div>
        </router-link>
      </li>
      <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-4">
        <router-link to="/index" class="rot">
          <img src="../assets/images/pjzq.png" alt="" class="img1">
          <div class="mui-media-body">配件专区</div>
        </router-link>
      </li>
      <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-4">
        <router-link to="/index" class="rot">
          <img src="../assets/images/hylq.png" alt="" class="img1">
          <div class="mui-media-body">会员领券</div>
        </router-link>
      </li>
       <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-4">
        <router-link to="/index" class="rot">
          <img src="../assets/images/jkzm.png" alt="" class="img1">
          <div class="mui-media-body">健康照明</div>
        </router-link>
      </li>
       <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-4">
        <router-link to="/index" class="rot">
          <img src="../assets/images/5Gzj.png" alt="" class="img1">
          <div class="mui-media-body">5G之家</div>
        </router-link>
      </li>
    </ul>
</div>

<!-- 商品列表 -->
  <div class="splb">
    <ul>
      <li v-for="item in homelist">
       <img :src="getUrl(item.homepic)">
      </li>
    </ul>
  </div>

  </div>
</div>

    
</template>

<script>
import {getslideshow,getAllHome} from '../api/index'
import { mixin } from '../mixins/index'
  export default {
    mixins: [mixin],
    data() {
      return {
        restaurants: [],
        state: '',
        timeout:  null,
        imgs:[],
        homelist:[]
      };
    },
    methods: {
      loadAll() {
        return [
          { "value": "魅族 18 Pro", "address": "8GB/256GB" },
          { "value": "魅族 18", "address": "#" },
          { "value": "魅族 17 Pro", "address": "#" },
          { "value": "魅族 16th", "address": "#" },
          { "value": "魅族 17", "address": "#" },
          { "value": "魅族16x", "address": "#" },
          { "value": "魅蓝E2", "address": "#" },
          { "value": "魅蓝S6", "address": "#" },
        ];
      },
      querySearchAsync(queryString, cb) {
        var restaurants = this.restaurants;
        var results = queryString ? restaurants.filter(this.createStateFilter(queryString)) : restaurants;

        clearTimeout(this.timeout);
        this.timeout = setTimeout(() => {
          cb(results);
        }, 3000 * Math.random());
      },
      createStateFilter(queryString) {
        return (state) => {
          return (state.value.toLowerCase().indexOf(queryString.toLowerCase()) === 0);
        };
      },
      handleSelect(item) {
        console.log(item);
      },
      getImgs(){
        getslideshow().then(res=>{
          this.imgs = res
        })
      },
      getHomelist(){
       getAllHome().then(res=>{
          this.homelist = res
       })
      }
    },
    mounted() {
      this.restaurants = this.loadAll();
      this.getImgs()
      this.getHomelist()
    }
  };
</script>

<style>
/*清除ul li 的默认样式 */
ul,li{ 
  padding:0;
  margin:0;
  list-style:none
  }
/* 取消字体下划线 */
a{
  text-decoration:none
}
.indexbox{
  height: 601px;
  overflow: scroll;
  scrollbar-width: none;
}
/* 整个顶部 */
.serachTop{
  height: 100%;
  width: 100%;
}
.sercontent{
  overflow: hidden;
  /* border-bottom: 1px gainsboro solid; */
  padding-bottom: 1px;
  padding-left: 10px;
}
/* 搜索框 */
.el-button--primary{
  margin-left: 5px;
}
/* elm组件自带名 */
.serbutton i{
  text-align: center;
}
/* elm组件自带名 */
.el-input {
    position: relative;
    font-size: 14px;
    display: block;
    width: 100%;
    }
.el-button{
  padding: 8px 13px;
}
.srk{
  /* border: 1px solid black; */
  width: 140px;
  height: 40px;
  margin-left: 20px;
}
  .index-logo{
    float: left;
  }

/* 下拉菜单 */
.el-dropdown-link {
    cursor: pointer;
    color: #409EFF;
  }
  .el-icon-arrow-down {
    font-size: 14px;
  }
  .el-dropdown {
    display: block;
    position: fixed;
    color: #606266;
    font-size: 14px;
    right: 2px;
    top: 2px;
}

/* 主内容 */

/* 轮播图 */
.lbt{
  height: 200px;
  border: 1px solid #fff;
  margin-bottom: 2px;
  margin-top: 2px;
}

/* 图标列表 */
.liebiao{
  height: 180px;
  border: 1px solid #fff;
}
#tupian {
    background-color: #fff;
    border: none;
    list-style: none;
    width: 300px;
    margin: auto;
    height: 180px;
}
  .mui-media-body{
    font-size: 14px;
    color: black;
    font-weight: 100;
    text-align: center;
  }
.img1 {
    width: 60px;
    height: 60px;
  }
  .mui-table-view-cell{
    float: left;
    margin-left: 10px;
    display: block;
    height: 83px;
    width: 60px;
    /* border: 1px solid black; */
  }

  /* 商品列表 */
.splb img{
  width: 165px;
  height: 206px;
  margin-right: 10px; 
}
.splb ul li{
 float: left;
}
</style>
 