<template>
    <div class="img">
        <div class="dtlb">
            <img :src="getUrl(detail.pdpic)" class="dtlbimg" >
            <img src="../assets/images/返回5.png" alt="" class="imgfh" v-on:click="back">
            <img src="../assets/images/购物车.png" alt="" class="imggw">
        </div>
        <div class="dt_title">
            <div class="tit1">
                <p class="mz">{{detail.pdname}}</p>
                <img src="../assets/images/分享.png" alt="">
            </div>
                <p  class="tit2">
                    {{detail.pdcontext}}
                </p>
                <p class="price">￥ {{detail.pdprice}}</p>
        </div>
        <div class="db">
            <ul>
                <li>
                    <div class="limin">
                        <p>领券</p>
                        <strong>满59999减900 满4999减800</strong>
                    </div>
                    <img src="../assets/images/右箭头.png" alt="">
                </li>
                <li>
                    <div class="limin">
                    <p>活动</p>
                    <span>分期</span><p class="p2">￥416.58×12分期免息</p>
                    </div>
                    <img src="../assets/images/右箭头.png" alt="">
                    <span>加价购</span><p class="p2">另加29.0元起,即可换购超值商品</p>
                </li>
                <li>
                    <div class="limin">
                        <p>领券</p>
                        <p class="p2">全网通公开版,飞雪流光,8+128GB,官方标配 ×1</p>
                    </div>
                    <img src="../assets/images/右箭头.png" alt="">
                </li>
                 <li>
                    <div class="limin">
                    <p>服务</p>
                    <p class="p2">本商品由魅族负责发货和提供售后服务</p>
                    </div>
                    <img src="../assets/images/右箭头.png" alt="">
                    <p>花呗分期 · 百城速达 · 顺丰发货 · 7天无理由退货</p>
                </li>
            </ul>
        </div>
        <ul class="btn">
            <li class="sc"><img src="../assets/images/收藏.png" alt="">收藏</li>
            <li class="bt2" @click="cartbtn">加入购物车</li>
            <li class="bt2">立即购买</li>
        </ul>
    </div>
</template>

<script>
import { Toast } from 'mint-ui';
import {getAllPddetails,getaddcart} from '../api/index'
import { mixin } from '../mixins/index'
export default {
    mixins: [mixin],
    data() {
      return {
            detail:{
                pdpic:"/img/pddetailsPic/16299664283282021-08-26_155529.png",
                pdname:'ss',
                pdcontext:'ssss',
                pdprice:22222
            }

      };
    },
    methods:{
        back(){
        this.$router.go(-1);//返回上一层
        console.log('已返回上一层')
    },
      getdetail(){
         getAllPddetails().then(res=>{
                let productname = sessionStorage.getItem("item.productname")
                for(var i = 0 ; i<res.length ; i++){
                    if(productname == res[i].pdname){
                        this.detail = res[i]
                    }
                }
      })

    },
    cartbtn(){
        let params = new URLSearchParams();
        let username = sessionStorage.getItem("Username")
         params.append("crusername",username)
         params.append("crpic",this.detail.pdpic)
         params.append("crname",this.detail.pdname)
        params.append("crprice",this.detail.pdprice)
        params.append("crformat",this.detail.pdcontext)
        params.append("crmunder",1)
         params.append("isGoods",0)
         if(username == null){
               Toast('请先登录');
           }else{
                  getaddcart(params)
        .then((res) =>{
            if(res.code == 1){
                Toast('加入购物车成功')
            }
        }).catch(err =>{
            console.log(err)
        })

           }
    }
    },
    mounted(){
      this.getdetail()
    }
}
</script>

<style scoped>
*{
    list-style: none;
    margin: 0;
    padding: 0;
}
 .dtlb{
     height: 60vw;
     border: 0.13333vw solid black;
 }

 .imgfh{
     width: 6vw;
     height: 6vw;
     position: absolute;
     top: 3vw;
     left: 3vw;
 }
 .dtlbimg{
     margin-top: 20px;
     margin-left: 80px;
 }
 .imggw{
     width: 6vw;
     height: 6vw;
     position: absolute;
     top: 3vw;
     right: 3vw;
 }
 .dt_title{
     width: 100vw;
     border-bottom: solid 1.2vw #F3F3F3;
 }
 .mz{
     display: inline-block;
     margin: 0;
     font-weight: bolder;
 }
 .dt_title img{
     width: 4.66667vw;
     height: 4.66667vw;
     vertical-align: middle;
     position: absolute;
     right: 2vw;
 }
 .tit1{
     width: 98w;
     height: 4.66667vw;
     margin-top: 1.33333vw;
     margin-left: 1.33333vw;
 }
 .tit2{
     width: 94vw;
     color: #8E8E8E;
     font-size: 3vw;
     margin: 0;
     margin-top: 3vw;
     margin-left: 1.33333vw;
 }
 .price{
     color: #ED445D;
     font-weight: bolder;
     margin-top: 2vw;
     margin-left: 1.33333vw;
     font-size: 5vw;
     margin-bottom: 3vw;
 }
 .db ul{
     font-size: 3vw;
     margin-top: 2vw;
     margin-left: 1.333333vw;
 }
 .db li{
     width: 100vw;
     height: 12vw;
     border-bottom: 0.26667vw solid #F1F1F1;
     margin: auto;
     overflow: hidden;
 }
.db li:nth-child(4){
     height: 16vw;
     border-bottom: 2px solid #F1F1F1;
 }
 .limin:nth-child(2){
     margin-bottom: 2vw;
 }
 .limin{
     line-height: 12vw;
     width: 85vw;
     height: 6.4vw;
     display: inline-block;
 }
 .db span{
     border: 0.13333vw solid red;
     padding: 0.13333vw;
     color: red;
     margin-left: 7.9vw;
 }
  .limin span{
     margin-left: 1.33333vw;
 }
 .db img{
     width: 3.33333vw;
     height: 3.33333vw;
     vertical-align: middle;
     margin-left: 2.93333vw;
 }
  .p2{
     color: black;
     font-weight: bolder;
     margin-left: 1.33333vw;
 }
 .db li p{
     display: inline-block;
 }
 .db li:nth-child(4) p:nth-child(3){
     margin-left: 7.9vw;
     margin-top: 2vw;
 }
 .db li strong{
     color: #ED445D;
     margin-left: 1.33333vw;
     font-weight: bolder;
     font-size: 3vw;
     display: inline-block;
 }
 .db li:nth-child(2){
     height: 18vw;
 }
 .db li:nth-child(2) p:nth-child(4){
     margin-top: 2vw;
 }
 /* 底部按钮 */
 .btn{
     border-top: 0.26667vw solid #EEEEEE;
     width: 100vw;
     height: 12vw;
     position: fixed;
     bottom: 0;
 }
 .btn li{
     float: left;
     height: 12vw;
     text-align: center;
 }
 .btn img{
     width: 7vw;
     height: 7vw;
     display: block;
     margin: auto;
 }
 .bt3{
      width: 39vw;
      line-height: 12vw;
      background: white;
 }
 .sc{
     font-size: 1.6vw;
     width: 20vw;
     height: 12vw;
     border-right: 0.26667vw solid #F0F0F0;
     background: white;
 }
 .btn li:nth-child(3){
     background: #ED4662;
 }
 .btn li:nth-child(2){
     background: white;
 }
 .bt2{
      width: 39vw;
      line-height: 12vw;
 }
</style>