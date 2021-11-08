<template>
    <div>       
        <el-tabs :tab-position="tabPosition='left'" style="height: 100%; ">
            <el-tab-pane label="推荐">
                <div class="tj">
                     <div class="tjtop">
                    <h2 style="  position: none;">推荐</h2>
                </div>
                <div class="tjcontext">
                    <div>
                        <ul v-for="item in tjval">
                            <li @click="detail(item)">
                                <img :src="getUrl(item.productpic)">
                                <p>{{item.productname}}</p>
                            </li>
                        </ul>
                    </div>
                </div>
                </div>
                </el-tab-pane>
            <el-tab-pane label="手机">
                <div class="tj">
                     <div class="tjtop">
                    <h2>手机</h2>
                </div>
                <div class="tjcontext">
                    <div>
                        <ul v-for="item in ipval">
                            <li @click="detail(item)">
                                <img :src="getUrl(item.productpic)">
                                <p>{{item.productname}}</p>
                            </li>
                        </ul>
                    </div>
                </div>
                </div>
            </el-tab-pane>
            <el-tab-pane label="声学">
                <div class="tj">
                     <div class="tjtop">
                    <h2>声学</h2>
                </div>
                <div class="tjcontext">
                    <div>
                        <ul v-for="item in voiceval">
                            <li @click="detail(item)">
                                <img :src="getUrl(item.productpic)">
                                <p>{{item.productname}}</p>
                            </li>
                        </ul>
                    </div>
                </div>
                </div>
            </el-tab-pane>
            <el-tab-pane label="配件">
                 <div class="tj">
                     <div class="tjtop">
                    <h2>配件</h2>
                </div>
                <div class="tjcontext">
                    <div>
                        <ul v-for="item in partsval">
                            <li @click="detail(item)">
                                <img :src="getUrl(item.productpic)">
                                <p>{{item.productname}}</p>
                            </li>
                        </ul>
                    </div>
                </div>
                </div>
            </el-tab-pane>
            <el-tab-pane label="生活">
                 <div class="tj">
                     <div class="tjtop">
                    <h2>生活</h2>
                </div>
                <div class="tjcontext">
                    <div>
                        <ul v-for="item in liveval">
                            <li @click="detail(item)">
                                <img :src="getUrl(item.productpic)">
                                <p>{{item.productname}}</p>
                            </li>
                        </ul>
                    </div>
                </div>
                </div>
            </el-tab-pane>
            <el-tab-pane label="Lipro">
                <div class="tj">
                     <div class="tjtop">
                    <h2>Lipro</h2>
                </div>
                <div class="tjcontext">
                    <div>
                        <ul v-for="item in liproval">
                            <li @click="detail(item)">
                                <img :src="getUrl(item.productpic)">
                                <p>{{item.productname}}</p>
                            </li>
                        </ul>
                    </div>
                </div>
                </div>
            </el-tab-pane>
        </el-tabs>
    </div>
</template>
<style>

</style>
<script>
import {getAllClassify} from '../api/index'
import { mixin } from '../mixins/index'
export default {
    mixins: [mixin],
    data() {
      return {
            tjval:[],
            ipval:[],
            voiceval:[],
            partsval:[],
            liveval:[],
            liproval:[]

      };
    },
    methods:{
        getClassify(){
            getAllClassify().then(res=>{
                for(let i = 0 ; i<res.length ; i++){
                     if(res[i].producttpye == 0){
                        this.tjval.push(res[i])
                    }else if(res[i].producttpye == 1){
                        this.ipval.push(res[i])
                    }else if(res[i].producttpye == 2){
                        this.voiceval.push(res[i])
                    }else if(res[i].producttpye == 3){
                        this.partsval.push(res[i])
                    }else if(res[i].producttpye == 4){
                        this.liveval.push(res[i])
                    }else if(res[i].producttpye == 5){
                        this.liproval.push(res[i])
                    }
                   
                }
               
            })
        },

        detail(item){
            sessionStorage.setItem("item.productname",item.productname)
            this.$router.push('/detail')
        }

    },
    mounted(){
        this.getClassify()
    }
}
</script>

<style>
ul li{
    list-style: none;
}
.tjtop{
    text-align: center;
}
.tjcontext ul li{
    float: left;
    padding-right: 20px;
    padding-bottom: 20px;
}

.tjcontext ul li img{
    height: 70px;
    width: 50px;
}

.tjcontext ul li p{
    height: 20px;
    width: 55px;
    font-size: 12px;
}

</style>
