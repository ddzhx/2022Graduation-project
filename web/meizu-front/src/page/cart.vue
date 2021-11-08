<template>
  <div class="box" >
    <div class="block">
      <div class="shop" v-for="(item,index) in orderData" :key="index">
        <div class="line">
          <div>{{item.shopName}}</div>
        </div>
        <div class="row" v-for="(row,i) in item.goodsList" :key="row.id">
          <div class="pic" @click="selectGoods(index,i)">
            <img
              :src="row.isGoods == 1 ? 'http://sucai.suoluomei.cn/sucai_zs/images/20191121093322-1.png' :'https://sucai.suoluomei.cn/sucai_zs/images/20191121093322-2.png'"
              alt
            />
          </div>
          <div class="detail">
            <div class="photo">
              <img :src="getUrl(row.crpic)" alt />
            </div>
            <div class="info">
              <div class="title">{{row.crname}}</div>
              <div class="norm">{{row.crformat}}</div>
              <div class="rol">
                <span class="amount">￥{{row.crprice}}</span>
                 <el-input-number v-model="row.crmunder" disable-input @change="countNum(i)" :min="1" :max="10" label="无"></el-input-number>
                <div class="del" @click="delGoods(0,row.id)">
                  <img src="https://sucai.suoluomei.cn/sucai_zs/images/20191121100950-3.png" alt />
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="close">
        <div class="all" @click="selectAll()">
          <div class="pic">
            <img
              :src="isAll == 1 ? 'https://sucai.suoluomei.cn/sucai_zs/images/20191121093322-1.png' : 'https://sucai.suoluomei.cn/sucai_zs/images/20191121093322-2.png'"
              alt
            />
          </div>
          <span>全选</span>
        </div>
        <div class="refer">
          <div class="total">
            <span>合计:</span>
            <span>￥{{allPrice}}</span>
          </div>
          <div class="settlement" @click="sum(allPrice)">结算</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mixin } from '../mixins/index'
import {getallCart,deCart,updatecart} from '../api/index'
export default {
  mixins: [mixin],
  data() {
    return {
      isAll: 0,
      allPrice: 0,
      orderData: [
        {
          shopId: 1,
          shopName: "",
          isShop: 0,
          goodsList: []
        }
      ]
    };
  },

  methods: {
    // 删除商品
    delGoods(index, i) {
      deCart(i)
          .then(res=>{
            if(res){
              this.getallCart()
              this.$message({
                  message: '删除成功',
                  type: 'success'
                });
            }else{
              this.$message({
                 message: '删除失败',
                 type: 'error'
        });
            }
          })
          .catch(err => {
                console.log(err);
            });
      this.watchAll();
      this.countPrice();
    },

    // 选择商品
    selectGoods(index, i) {
      var list = this.orderData[index].goodsList;
      if (list[i].isGoods == 0) {
        list[i].isGoods = 1;
      } else {
        list[i].isGoods = 0;
      }
      var anti = list.map(item => item.isGoods).indexOf(0);
      if (anti == -1) {
        this.orderData[index].isShop = 1;
      } else {
        this.orderData[index].isShop = 0;
      }
      this.watchAll();
      this.countPrice();
    },

    // 选择店铺
    selectShop(index) {
      var list = this.orderData;
      var goodsList = list[index].goodsList;
      if (list[index].isShop == 0) {
        list[index].isShop = 1;
        for (let i in goodsList) {
          goodsList[i].isGoods = 1;
        }
      } else {
        list[index].isShop = 0;
        for (let i in goodsList) {
          goodsList[i].isGoods = 0;
        }
      }
      this.watchAll();
      this.countPrice();
    },

    // 全选
    selectAll() {
      var list = this.orderData;
      if (list.length == 0) {
        this.isAll = 0;
        return;
      }
      if (this.isAll == 0) {
        this.isAll = 1;
        for (let i in list) {
          list[i].isShop = 0;
          this.selectShop(i);
        }
      } else {
        this.isAll = 0;
        for (let i in list) {
          list[i].isShop = 1;
          this.selectShop(i);
        }
      }
      this.countPrice();
    },

    // 监听全选
    watchAll() {
      var list = this.orderData;
      if (list.length == 0) {
        this.isAll = 0;
        return;
      }
      var result = [];
        for (let j in list[0].goodsList) {
          result.push(list[0].goodsList[j].isGoods);
        }
      var anti = result.every(item => item > 0)
      if (anti == true) {
        this.isAll = 1;
      } else {
        this.isAll = 0;
      }
    },

    // 更改商品数量
    countNum(i) {
       let params = new URLSearchParams();
         params.append('id',this.orderData[0].goodsList[i].id)
         params.append('crmunder',this.orderData[0].goodsList[i].crmunder);

      updatecart(params)
      .then(res => {
         
      })
       .catch(err => {
                console.log(err);
            });
      this.countPrice();
    },

    // 计算总价格
    countPrice() {
      let arr = []
      let arr1 = []
      let crpic = 0;
      var list = this.orderData;
      for (let i in list) {
        for (let j in list[0].goodsList) {
          if (list[0].goodsList[j].isGoods == 1) {
            crpic += list[0].goodsList[j].crprice * list[0].goodsList[j].crmunder;
            arr.push(list[0].goodsList[j].crname)
            arr1.push(list[0].goodsList[j].id)
          }
        }
        sessionStorage.setItem("Arr",arr)
        sessionStorage.setItem("Arr1",arr1)
      }
      this.allPrice = crpic;
    },

    //获取数据
    getallCart(){
      this.orderData[0].goodsList = []
      getallCart().then(res =>{
       let username = sessionStorage.getItem("Username")
       if(username == null){
        document.querySelector(".box").style.backgroundImage = 'url('+ require("../assets/img/nocart1.png")+')'
        document.querySelector(".box").style.backgroundPosition = '0,20px'
        document.querySelector(".box").style.backgroundSize = '100%'
         document.querySelector(".box").style.backgroundRepeat = 'no-repeat'
       }else{
         for(var i=0;i<res.length;i++){
           if(username == res[i].crusername){
              this.orderData[0].goodsList.push(res[i])
           }
           
         }
       }
       if(this.orderData[0].goodsList.length == 0){
         document.querySelector(".box").style.backgroundImage = 'url('+ require("../assets/img/nocart1.png")+')'
        document.querySelector(".box").style.backgroundPosition = '0,20px'
        document.querySelector(".box").style.backgroundSize = '100%'
         document.querySelector(".box").style.backgroundRepeat = 'no-repeat'
       }
      })
    },
    sum(s,id){
      var num = Math.floor(Math.random()*9000+1000)
      var date = new Date()
      var getnian = date.getFullYear()
      var getyue = date.getMonth()+1 >= 10 ? date.getMonth() + 1 : "0"+date.getMonth()
      var getday = date.getDate() >= 10 ? date.getDate() + 1 : "0"+date.getDate()
      var getHH = date.getHours() >= 10 ? date.getHours() + 1 : "0"+date.getHours()
      var getmm = date.getMinutes() >= 10 ? date.getMinutes() + 1 : "0"+date.getMinutes()
      var getss = date.getSeconds() >= 10 ? date.getSeconds() + 1 : "0"+date.getSeconds()
      //金额
      sessionStorage.setItem("jinger",s)
      //商户订单号
      var sh = "sh"+getnian+getyue+getday+num+getHH+getmm+getss
       sessionStorage.setItem("shanghu",sh)
      //销售产品码
      var xs = "xs"+getnian+getyue+getday+num+getHH+getmm+getss
       sessionStorage.setItem("xiaoshou",xs)
      //订单名称
      var dd = "dd"+getnian+getyue+getday+num+getHH+getmm+getss
       sessionStorage.setItem("dingdan",dd)

       this.$router.push("/dingdan")
    }
  },
  mounted(){
        this.getallCart()
    }
};
</script>


<style scoped>
*{
  margin: 0;
  padding: 0;
}
.box {
    overflow: scroll;
    scrollbar-width: none;
    position: relative;
    width: 100vw;
    height: 82vh;
    padding: 4vw;
    box-sizing: border-box;
    background: #fff;
    margin-bottom: 13.86667vw;
  }
  
  .shop {
    width: 90vw;
    margin-bottom: 8vw;
    box-shadow: 0vw 1.06667vw 2.66667vw 0vw rgba(97, 97, 97, 0.19);
    border-radius: 1.6vw;
    padding: 1.33333vw;
    box-sizing: border-box;
  }
  /* 加减按钮宽度 */
  .el-input-number{
    width: 35vw;
  }
 
  .line {
    display: flex;
    align-items: center;
  }
  
  .pic {
    width: 5.33333vw;
    height: 5.33333vw;
  }
  
  img {
    width: 100%;
    height: 100%;
    object-fit: cover;
  }
  
  .line div:nth-child(2) {
    font-size: 3.2vw;
    margin-left: 2.13333vw;
  }
  
  .row {
    display: flex;
    align-items: center;
    margin-top: 1.33333vw;
  }
  
  .detail {
    width: 84vw;
    height: 31.46667vw;
  
    margin-left: 2.13333vw;
    padding: 2.66667vw;
    box-sizing: border-box;
    display: flex;
    align-items: center;
    justify-content: space-between;
  }
  
  .photo {
    width: 17.6vw;
    height: 17.6vw;
  }
  
  .info {
    width: 55vw;
    height: 24vw;
    display: flex;
    justify-content: space-around;
    flex-direction: column;
    text-align: left;
  }
  
  .title {
    font-size: 3.73333vw;
  }
  
  .norm {
    font-size: 2.93333vw;
    color: #999999;
  }
  
  .rol {
    display: flex;
    align-items: center;
    justify-content: space-between;
  }
  
  .amount {
    font-size: 5.06667vw;
    font-weight: 600;
    color: #ff3b30;
  }
  
  .del {
    width: 4vw;
    display: flex;
    align-items: center;
  }
  
  .close {
    position: fixed;
    z-index: 2;
    bottom: 13.33335vw;
    left: 0;
    width: 100%;
    height: 13.86667vw;
    border-top: 0.13333vw solid #eeeeee;
    background: #fff;
    display: flex;
    align-items: center;
    justify-content: space-between;
  }
  
  .all {
    display: flex;
    align-items: center;
    margin-left: 4vw;
  }
  
  .all span {
    color: #999999;
    font-size: 3.2vw;
    margin-left: 0.66667vw;
  }
  
  .refer {
    display: flex;
    align-items: center;
    height: 100%;
  }
  
  .total {
    display: flex;
    align-items: center;
  }
  
  .total span:nth-child(1) {
    font-size: 3.46667vw;
  }
  
  .total span:nth-child(2) {
    font-size: 5.06667vw;
    font-weight: 600;
    color: #ff3b30;
  }
  
  .settlement {
    display: flex;
    position: relative;
    align-items: center;
    justify-content: center;
    width: 60vw;
    height: 100%;
    background: #ff3b30;
    color: #fff;
    font-size: 4vw;
    margin-left: 2vw;
    z-index: 1;
  }
</style>
