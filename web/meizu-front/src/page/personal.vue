<template>
  <div>
    <header class="mint-header">
      <div class="mint-header-button is-left">
        <a href="#/" class="router-link-active">
          <button class="mint-button mint-button--default mint-button--normal">
            <span class="mint-button-icon"
              ><i class="mintui mintui-back"></i
            ></span>
            <label class="mint-button-text" @click="tuihui">返回</label>
          </button>
        </a>
      </div>
      <h1 class="mint-header-title">个人信息</h1>
      <div class="mint-header-button is-right">
        <button class="mint-button mint-button--default mint-button--normal">
          <span class="mint-button-icon"
            ><i class="mintui mintui-more"></i
          ></span>
          <label class="mint-button-text"></label>
        </button>
      </div>
    </header>

    <div class="duser">
      <label>用户名：</label
      ><input
        placeholder="请输入用户名"
        type="text"
        class="user"
        v-model="ruleForm.name"
        readonly="readonly"
      />
    </div>
    <div class="dpaw">
      <label>电&ensp;&ensp;话：</label
      ><input
        placeholder="请输入电话"
        type="text"
        class="paw"
        v-model="ruleForm.phone"
      />
    </div>
    <div class="dpaw">
      <label>地&ensp;&ensp;址：</label
      ><input
        placeholder="请输入地址"
        type="text"
        class="paw"
        v-model="ruleForm.adderss"
      />
    </div>
    <div class="dpaw">
      <label>邮&ensp;&ensp;箱：</label
      ><input
        placeholder="请输入邮箱"
        type="text"
        class="paw"
        v-model="ruleForm.email"
      />
    </div>

    <button
      type="submit"
      class="mint-button mint-button--primary mint-button--large is-disabled"
     @click="xiugai"
    >
      修改
    </button>
  </div>
</template>

<script>
import { Toast } from "mint-ui";
import { updatelogin,getalllogin } from "../api/index";
export default {
  data() {
    return {
      ruleForm: {},
    };
  },
  methods: {
    tuihui(){
        this.$router.go(-1)
    },
    getall(){
        getalllogin().then(res =>{
            let name1 = sessionStorage.getItem("Username")
            for(let i = 0 ; i<res.length ; i++){
                if(res[i].name == name1 ){
                   this.ruleForm = res[i]
                }
            }
        })
    },
    xiugai(){
         let params = new URLSearchParams();
      params.append("id",this.ruleForm.id)
      params.append("phone",this.ruleForm.phone);
      params.append("adderss",this.ruleForm.adderss);
      params.append("email",this.ruleForm.email);
        updatelogin(params).then(res =>{
           
        })
         .catch(err => {
                console.log(err);
            });
    }
  },
  mounted(){
      this.getall();
  }
};
</script>

<style>
*:focus {
  outline: none;
}
.user {
  border: none;
  height: 50px;
  width: 70%;
}
.paw {
  border: none;
  height: 50px;
  width: 70%;
}
.duser {
  margin-top: 100px;
  margin-bottom: 20px;
}
.dpaw {
  margin-bottom: 20px;
}
</style>