<template>
   <div> 
     <header class="mint-header">
         <div class="mint-header-button is-left">
             <a href="#/" class="router-link-active">
             <button class="mint-button mint-button--default mint-button--normal">
                 <span class="mint-button-icon"><i class="mintui mintui-back"></i></span> 
                 <label class="mint-button-text">返回</label>
            </button>
            </a>
            </div> 
                 <h1 class="mint-header-title">登录</h1> 
                 <div class="mint-header-button is-right">
                     <button class="mint-button mint-button--default mint-button--normal">
                         <span class="mint-button-icon"><i class="mintui mintui-more"></i></span> 
                         <label class="mint-button-text"></label></button></div></header>

                         <div class="duser">
                             <label>用户名：</label><input placeholder="请输入用户名" type="text" class="user" v-model="ruleForm.username">
                         </div>
                         <div class="dpaw">
                           <label>密&ensp;&ensp;码：</label><input placeholder="请输入密码" type="password" class="paw" v-model="ruleForm.password">
                         </div>

                         <div class="button">
                            <button type="submit" class="mint-button mint-button--primary mint-button--large is-disabled" @click="register">注册</button>
                            <button type="submit" class="mint-button mint-button--primary mint-button--large is-disabled" @click="login">登录</button>
                         </div>

                            
        
        
   </div>
</template>

<script>
import { Toast } from 'mint-ui';
import {getLoginStatus} from "../api/index"
export default {
    data(){
        return{
            ruleForm:{
            username:"",
            password:""
      },
        }
    
    },
    methods:{
        login(){
           let params = new URLSearchParams();
           params.append("name",this.ruleForm.username)
           params.append("password",this.ruleForm.password)
           if(this.ruleForm.username == ''){
               Toast('用户名不能为空')
           }else if(this.ruleForm.password == ''){
               Toast('密码不能为空')
           }
           getLoginStatus(params)
           .then((res)=>{
               if(res.code == 1){
                   sessionStorage.setItem("Username",this.ruleForm.username)
                //    this.$store.commit('setUsername',this.ruleForm.username)
                //    this.$store.commit('setnouser',true)
                   this.$router.push("/index")
                   Toast('登录成功')
                  this.$router.go(0)
               }else{
                    Toast('用户名或密码错误')
               }
           }).catch(err => {
                console.log(err);
            });
        },
        register(){
            this.$router.push("/register")
        }
    }
}
</script>

<style>
*:focus {outline: none;}
.user{
    border: none;
    height: 50px;
    width: 80%;
}
.paw{
     border: none;
     height: 50px;
     width: 80%;
}
.duser{
margin-top: 100px;
margin-bottom: 20px;
}
.button{
    margin-top: 30px;
}
.button button{
    margin-bottom: 20px;
}
</style>