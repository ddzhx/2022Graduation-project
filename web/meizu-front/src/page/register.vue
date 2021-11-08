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

    <div class="duser">
      <label>用户名：</label
      ><input
        placeholder="请输入用户名"
        type="text"
        class="user"
        v-model="ruleForm.username"
      />
    </div>
    <div class="dpaw">
      <label>密&ensp;&ensp;码：</label
      ><input
        placeholder="请输入密码"
        type="password"
        class="paw"
        v-model="ruleForm.password"
      />
    </div>
    <div class="dpaw">
      <label>确认密码：</label
      ><input
        placeholder="请确认密码"
        type="password"
        class="paw"
        v-model="ruleForm.unpassword"
      />
    </div>
    <div class="dpaw">
      <label>性&ensp;&ensp;别：</label>男<input
        type="radio"
        name="sex"
        value="1"
        v-model="ruleForm.sex"
      />
      女<input type="radio" name="sex" value="0" v-model="ruleForm.sex"/>
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
      @click="editreg"
    >
      注册
    </button>
  </div>
</template>

<script>
import { Toast } from "mint-ui";
import { setregister } from "../api/index";
export default {
  data() {
    return {
      ruleForm: {
        username: "",
        password: "",
        unpassword: "",
        sex: "",
        phone: "",
        adderss: "",
        email: "",
      },
    };
  },
  methods: {
    editreg() {
      let params = new URLSearchParams();
      params.append("name", this.ruleForm.username);
      params.append("password", this.ruleForm.password);
      params.append("sex",this.ruleForm.sex);
      params.append("phone",this.ruleForm.phone);
      params.append("adderss",this.ruleForm.adderss);
      params.append("email",this.ruleForm.email);
      if (this.ruleForm.username == "") {
        Toast("用户名不能为空");
      } else if (this.ruleForm.password == "") {
        Toast("密码不能为空");
      } else if (this.ruleForm.unpassword == "") {
        Toast("确认密码不能为空");
      } else if (this.ruleForm.unpassword != this.ruleForm.password) {
        Toast("密码与确认密码不一致");
      } else if (this.ruleForm.sex == "") {
        Toast("性别不能为空");
      }else if (this.ruleForm.phone == "") {
        Toast("手机号不能为空");
      }else if (this.ruleForm.adderss == "") {
        Toast("地址不能为空");
      }else if (this.ruleForm.email == "") {
        Toast("邮箱不能为空");
      }else {
        setregister(params)
          .then((res) => {
            if (res.code == 1) {
              this.$router.push("/login");
              Toast("注册成功");
            } else {
              Toast("用户已存在注册失败");
            }
          })
          .catch((err) => {
            console.log(err);
          });
      }
    },
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