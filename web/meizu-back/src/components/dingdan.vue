<template>
<div class="slidebar">
    <!--表头搜索款-->
 <el-input
    placeholder="请输入客户订单或商户订单"
    prefix-icon="el-icon-search"
    style="width: 20%"
    v-model="input2">
  </el-input>
</el-dialog>

   <!--表-->
  <el-table
    ref="multipleTable"
    :data="tableData.slice((currentPage-1)*pageSize,currentPage*pageSize)"
    tooltip-effect="dark"
    style="width: 88%"
    @selection-change="handleSelectionChange">
    <el-table-column
      type="selection"
      width="55">
    </el-table-column>
    <el-table-column
      prop="meform"
      label="商户订单号"
      width="120">
    </el-table-column>
    <el-table-column
      prop="clform"
      label="客户订单号"
      width="120">
    </el-table-column>
     <el-table-column
      prop="comname"
      label="商品"
      width="120">
    </el-table-column>
     <el-table-column
      prop="money"
      label="金额"
      width="120">
    </el-table-column>
    <el-table-column
      label="时间"
      show-overflow-tooltip>
      <template slot-scope="scope">
      {{attachdate(scope.row.focreate)}}
      </template>
    </el-table-column>
     <el-table-column label="操作">
      <template slot-scope="scope">
        <el-button
          size="mini"
          type="danger"
          @click="handleDelete(scope.row.id)">删除</el-button>
      </template>
    </el-table-column>
  </el-table>

  <el-dialog title="删除歌手" :visible.sync="delVisible" width="300px" center>
            <div align="center">删除不可恢复，是否确定删除？</div>
            <span slot="footer">
                <el-button size="mini" @click="delVisible = false">取消</el-button>
                <el-button size="mini" @click="deleteRow">确定</el-button>                
            </span>
        </el-dialog>

  <!--分页功能-->
 <el-pagination
                background
                layout = "total,prev,pager,next"
                :current-page="currentPage"
                :page-size="pageSize"
                :total="tableData.length"
                @current-change="handleCurrentChange"
                >
            </el-pagination>
  </div>
</template>

<script>
import {getallform,deform} from '../api/index'
import { mixin } from '../mixins/index'
  export default {
     mixins: [mixin],
    data() {
      return {
        tableData: [],
        dialogFormVisible: false,
        form: {
         meform: '',
          clform: '',
           comname: '',
           money:'',
           focreate:''
        },
        formLabelWidth: '120px',
        multipleSelection: [],
        input2:'',
        dialogVisible: false,
        dialogImageUrl:'',
        currentPage:1, 
        pageSize:4,
        idx:-1,
        delVisible: false,
       tempData: []
      }
    },

     watch:{
        //搜索框里面的内容发生变化的时候，搜索结果table列表的内容跟着它的内容发生变化
        input2: function(){
            if(this.input2 == ''){
                this.tableData = this.tempData
            }else{
                this.tableData = [];
                for(let item of this.tempData){
                    if(item.meform.includes(this.input2) || item.clform.includes(this.input2)){
                        this.tableData.push(item);
                    }
                }
            }
        }
    },

  created(){
        this.getData()
    },
    methods: {
      handleSelectionChange(val) {
        this.multipleSelection = val;
      },
       //查询所有内容
        getData(){
          this.tempData = [];
            this.tableData = [];
            getallform().then(res => {
                this.tempData = res;
                this.tableData = res;
            })
        },
       //获取当前页
        handleCurrentChange(val){
            this.currentPage = val;
        },
        //删除轮播图
        deleteRow(){
          deform(this.idx)
          .then(res=>{
            if(res){
              this.getData();       
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
            this.delVisible = false;
        },
    }
  }
</script>

<style>
.slidebar{
    width: 88%;
}
</style>