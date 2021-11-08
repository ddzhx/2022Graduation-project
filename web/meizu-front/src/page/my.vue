<template>
    <div id="app">
        <div class="log-rsg">
            <router-link to="/login">
            <div class="hearde">
                    <div ><img src="../assets/img/nologin.png" class="lgiprint"><h2 class="ndenglu" @click="gologin">{{username1}}</h2></div>
                    <div @click="back"><h5>退出登录</h5></div>
            </div>
        </router-link>
        </div>

        <div class="box2">
            <a href="#"><li><img src="../assets/images/dfk.png" alt="">待付款</li></a>
            <a href="#"><li><img src="../assets/images/dfh.png" alt="">待发货</li></a>
            <a href="#"><li><img src="../assets/images/dsh.png" alt="">待收货</li></a>
            <a href="#"><li><img src="../assets/images/dtk.png" alt="">退款/售后</li></a>
        </div>

        <div class="box3">
            <div class="boxli">
                <a href="#"><li><img src="../assets/images/yhq.png" alt="">优惠券</li></a>
                <a href="#"><li><img src="../assets/images/hb.png" alt="">红包</li></a>
                <a href="#" @click="personal"><li><img src="../assets/images/shdz.png" alt="">个人信息</li></a>
                <a href="#"><li><img src="../assets/images/fjmd.png" alt="">附近门店</li></a>
                <a href="#"><li><img src="../assets/images/wdsc.png" alt="">我的收藏</li></a>
                <a href="#"><li><img src="../assets/images/mmtd.png" alt="">M码通道</li></a>
                <a href="#"><li><img src="../assets/images/yjhx.png" alt="">以旧换新</li></a>
                <a href="#"><li><img src="../assets/images/sz.png" alt="">设置</li></a>
            </div>
        </div>
    </div>
</template>

<script>
import {mapGetters} from 'vuex'
export default {
    data(){
        return{
            username1:'未登录'
        }
    },
    //   computed:{
    //     ...mapGetters([
    //         'nouser',
    //         'username',
    //     ])
    // },
    methods:{
        back(){
            //this.$store.commit('setUsername','未登录');
            sessionStorage.removeItem("Username")
            this.$store.commit('setnouser',false)
            this.$router.go(0)
        },
        gologin(){
           let login = sessionStorage.getItem("Username")
            if(login == null){
               this.username1 == "未登录"
            }else{
                 this.username1 = sessionStorage.getItem("Username")
            }
        },
        personal(){
            this.$router.push('/personal')
        }
    },
    mounted(){
       this.gologin()
    }
    
}
</script>

<style>
*{
    list-style: none;
    text-decoration: none;
}
#app{
    height: 100%;
}
.hearde{
    height: 150px;
    width: 100%;
    background-color: rgb(208, 226, 236);
    position: relative;
}
.lgiprint{
    height: 75px;
    width: 75px;
    position: absolute;
    top: 50px;
    left: 30px;
}
.ndenglu{
    position: absolute;
    top: 50px;
    left: 115px;
}
h5{
    position: absolute;
    right: 0;
}
.log-rsg{
    float: both;
}
.box2{
    width: 100%;
    height: 70px;
}
.box2 img{
    width: 40px;
    height: 40px;
    display: block;
    margin: auto;
}
.box2 li{
    width: 25%;
    font-weight: bolder;
    text-align: center;
    float: left;
}
.box3{
    margin-top: 5px;
    height: 100%;
    border-top: 9px solid #F2F2F2;
}
.boxli{
    margin-left: 10px;
    margin-top: 10px;
}
.box3 a{
    display: block;
    font-weight: bold;
    margin-bottom: 15px;
}
.box3 img{
    display: inline-block;
    width: 35px;
    height: 35px;
    vertical-align: middle;
    margin-right: 7px;
}

</style>