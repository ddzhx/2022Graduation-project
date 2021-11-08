<template>
<div>
 <div id="myChart" :style="{ width: '800px', height: '800px' }"></div>
</div>
 
</template>

<script>
import {getalllogin} from '../api/index'
import * as echarts from "echarts";
export default {
    data() {
      return {
        sex0:0,
        sex1:0
      }
    },
  mounted() {
     this.getdata();
    this.drawLine();
   
  },
  methods: {
    drawLine() {
      var chartDom = document.getElementById("myChart");
      var myChart = echarts.init(chartDom);
      var option;

      option = {
        //头部信息
        title: {
          text: "客户的男女比例",
          subtext: "customer Data",
          left: "center",
        },
        tooltip: {
          trigger: "item",
        },
        legend: {
          orient: "vertical",
          left: "left",
          top: "40",
        },
        series: [
          {
            name: "男女比例",
            type: "pie",
            radius: "50%",
            data: [
              { value: sessionStorage.getItem("Sex1"), name: "男性" },
              { value: sessionStorage.getItem("Sex0"), name: "女性" },
            ],
            emphasis: {
              itemStyle: {
                shadowBlur: 10,
                shadowOffsetX: 0,
                shadowColor: "rgba(0, 0, 0, 0.5)",
              },
            },
          },
        ],
      };

      option && myChart.setOption(option);
    },
       getdata(){
        getalllogin().then(res =>{
           for(var i = 0;i<res.length;i++){
               if(res[i].sex == 0){
                   this.sex0++
               }else{
                   this.sex1++
               }
           }
           sessionStorage.setItem("Sex0",this.sex0)
           sessionStorage.setItem("Sex1",this.sex1)
        })
    },
  },
};
</script>