<template>
  <div>
    <header class="mint-header">
      <div class="mint-header-button is-left">
        <a href="#/" class="router-link-active">
          <button class="mint-button mint-button--default mint-button--normal">
            <span class="mint-button-icon"
              ><i class="mintui mintui-back"></i
            ></span>
            <label class="mint-button-text">返回</label>
          </button>
        </a>
      </div>
      <h1 class="mint-header-title">注册</h1>
      <div class="mint-header-button is-right">
        <button class="mint-button mint-button--default mint-button--normal">
          <span class="mint-button-icon"
            ><i class="mintui mintui-more"></i
          ></span>
          <label class="mint-button-text"></label>
        </button>
      </div>
    </header>
    订单页

    <div class="duser">
      <label>商户订单码：</label
      ><input
        placeholder="请输入用户名"
        type="text"
        class="user"
        v-model="sdd.sh"
        readonly="readonly"
      />
    </div>
    <div class="duser">
      <label>金额：</label
      ><input
        placeholder="请输入用户名"
        type="text"
        class="user"
        v-model="sdd.s"
        readonly="readonly"
      />
    </div>
    <div class="duser">
      <label>销售产品码：</label
      ><input
        placeholder="请输入用户名"
        type="text"
        class="user"
        v-model="sdd.xs"
        readonly="readonly"
      />
    </div>
    <div class="duser">
      <label>订单名称:</label
      ><input
        placeholder="请输入用户名"
        type="text"
        class="user"
        v-model="sdd.dd"
        readonly="readonly"
      />
    </div>
    <button
      type="submit"
      class="mint-button mint-button--primary mint-button--large is-disabled"
      @click="postdd"
    >
      提交订单
    </button>
  </div>
</template>

<script>
import { Toast } from "mint-ui";
import { pay } from "../api/index";
export default {
  data() {
    return {
      sdd: {
        sh: "",
        s: "",
        xs: "",
        dd: "",
      },
    };
  },
  methods: {
    getAll() {
      this.sdd.sh = sessionStorage.getItem("shanghu");
      this.sdd.s = sessionStorage.getItem("jinger");
      this.sdd.xs = sessionStorage.getItem("xiaoshou");
      this.sdd.dd = sessionStorage.getItem("dingdan");
      console.log(sessionStorage.getItem("Arr"))
    },
    postdd() {
      let params = new URLSearchParams();
      params.append("out_trade_no", sessionStorage.getItem("shanghu"));
      params.append("total_amount", sessionStorage.getItem("jinger"));
      params.append("product_code", sessionStorage.getItem("xiaoshou"));
      params.append("subject", sessionStorage.getItem("dingdan"));
        pay(params).then(res =>{
         document.write(res)
        })
    },
  },
  mounted() {
    this.getAll();
  },
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
</style>