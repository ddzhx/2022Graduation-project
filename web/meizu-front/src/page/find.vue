<template>
  <div>
    <!-- 头部发现 -->
    <div class="fx">发 现</div>
    <span>最新推荐</span>

    <!-- 推荐列表 -->
    <div class="rot">
      <ul>
        <li v-for="(item,a) in find" @click="add(a)"> 
            <img :src="getUrl(item.findpic)" alt="" class="ftp" />
            <h1>{{item.findtitle}}</h1>
            <p>{{item.findtitle}}</p>
            <p>作者：{{item.name}}   <i>{{item.findread}} 阅读</i></p>
        </li>
       
      </ul>
     
    </div>
  </div>
</template>

<script>
import {getAllFind,updateRead} from '../api/index'
import { mixin } from '../mixins/index'
export default {
    mixins: [mixin],
    data() {
      return {
            find:[],
            

      };
    },
    methods:{
        getFind(){
            getAllFind().then(res=>{
                this.find = res     
            })
        },
      add(a){
        
        this.find[a].findread++
        
        let params = new URLSearchParams();
            params.append('id',this.find[a].id)
            params.append('findread',this.find[a].findread);

           updateRead(params)
            .then(res => {
               
            })
            .catch(err => {
                console.log(err);
            });
            this.editVisible = false;
      }

    },
    mounted(){
        this.getFind()
    }
}

</script>

<style scoped>
*{
  list-style: none;
  text-decoration:none
}
.rot{
    margin-top: 5px;
    text-align: center;
    color: black;
}
.fx {
  height: 40px;
  border-bottom: 1px solid gainsboro;
  font-weight: 1200;
  font-size: x-large;
  text-align: center;
  font-family: Hiragino Sans GB;
}
span {
  font-weight: 900;
  font-family: Hiragino Sans GB;
  margin: 5px 0 0 20px;
  display: block;
}
.rot ul{
  padding: 0;
}
.rot li{
  border-bottom: 1px solid #F2F2F2;
  margin-bottom: 5px;
  border-radius: 10px;
}
</style>