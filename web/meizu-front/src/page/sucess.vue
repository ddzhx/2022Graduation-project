<template>
  <div class="sucess">
    <h1>支付成功</h1>
    <span @click="back"><a href="">返回首页</a></span>
  </div>
</template>

<script>
import { setform,deCart } from "../api/index";
export default {
  data() {
    return {};
  },
  created() {
      this.setform()
      this.decart()
  },
  methods: {
    back() {
      this.$router.push("/index");
    },
    setform() {
      let params = new URLSearchParams();
      params.append("meform", sessionStorage.getItem("shanghu"));
      params.append("clform", sessionStorage.getItem("dingdan"));
      params.append("comname", sessionStorage.getItem("Arr"));
      params.append("money", sessionStorage.getItem("jinger"));

      setform(params).then(res =>{
          if(res.code == 1){
              console.log("订单保存成功")
          }else{
              console.log("订单保存失败")
          }
      })
    },
    decart(){
        var shuzu = sessionStorage.getItem("Arr1")
        let fenge = shuzu.split(",")
       for(var i=0;i<fenge.length;i++){
           deCart(fenge[i])
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
       }
    }

  },
};
</script>
<style>
a {
  text-decoration: none;
}
.sucess {
  margin-top: 10%;
  text-align: center;
}
</style>